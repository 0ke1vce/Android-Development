package com.example.menusinandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

//        TimePicker Ui Widget that allows user to select a specific time of day using GUI
//        Commonly used in scenario where you need to gather time related info from user such as setting alarm,scheduling event
        TimePicker tp=findViewById(R.id.time);
        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
//                                                Handle TIme Change
                Toast.makeText(MainActivity2.this, "User select Time-> "+hour+":"+minute, Toast.LENGTH_SHORT).show();
            }
        });


        Button b=findViewById(R.id.Page);
        Intent in=new Intent(this, MainActivity3.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(in);
            }
        });




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.search){
            EditText edt = findViewById(R.id.editText);
            Toast.makeText(this, "Search menu", Toast.LENGTH_SHORT).show();

            }
        else if(id==R.id.home){
            Toast.makeText(this, "You are on home", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}