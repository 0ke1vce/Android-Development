package com.example.menusinandroid;

import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        //    CheckBoxes- Checkbox is an UI widget that allows user to toggle between two states checked and unchecked.
//    Commonly used when you want to make a binary choice such as  selecting or deselecting option.
//    A CheckBox can be displayed alongside a label or text to indicate meaning of choice
//         To initialise a CheckBox
        CheckBox chk=findViewById(R.id.MyCheckBox);
        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Not Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });


// RadioButton- radio button is a widget that allows user to select a single option from a set of mutually exclusive choices
//        Commonly used when user need to choose one option from multiple options presented in a list.
        RadioGroup rdg=findViewById(R.id.radioGroup);
        rdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                RadioButton rbutton=findViewById(checkId);
                Toast.makeText(MainActivity.this, "You selected+ "+rbutton.getText(), Toast.LENGTH_SHORT).show();

            }
        });


        Intent in=new Intent(this, MainActivity2.class);
        ImageView img=findViewById(R.id.imageView);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(in);
            }
        });




//        Spinner- Spinner is a UI widget that display a dropdown list of item from which uder can select a  single option
        Spinner s=findViewById(R.id.Spin);
//        Using the array adapter
//        Array Adapter- use to populate the spinner with item from a string array resource
        String [] arr={"C++","JAVA","Python","C"};
        ArrayAdapter <String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arr);
//        Applying the adapter to spinner
        s.setAdapter(adapter);


/*
//        TimePicker Ui Widget that allows user to select a specific time of day using GUI
//        Commonly used in scenario where you need to gather time related info from user such as setting alarm,scheduling event
        TimePicker tp=findViewById(R.id.time);
        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
                                        @Override
                                        public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
//                                                Handle TIme Change
                                            Toast.makeText(MainActivity.this, "User select Time-> "+hour+":"+minute, Toast.LENGTH_SHORT).show();
                                        }
                                    });
*/



        }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.my_menu,menu);
            return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int Item_id=item.getItemId();
        if(Item_id==R.id.search){
            Toast.makeText(this, "You selected search", Toast.LENGTH_SHORT).show();
        }
        else if(Item_id==R.id.home){
            Toast.makeText(this, "You selected Home", Toast.LENGTH_SHORT).show();
        }
        return  true;
    }






}
