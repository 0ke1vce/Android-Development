package com.example.uieditinginandroidstudio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Scanner;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Scanner sc=new Scanner(System.in);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        Declaring and Initialising views
        TextView myTextView=findViewById(R.id.UjjwalKiId);
        myTextView.setText("UjjwalKIModifiedId");

//        EdiT Text
        EditText myEditText=findViewById(R.id.InputIdName);
        String Text=myEditText.getText().toString();

// Button
        Button myButton=findViewById(R.id.MyButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// Code to be executed when button is clicked
                Toast.makeText(MainActivity.this, "Button Dabaya", Toast.LENGTH_SHORT).show();
            }
        });


//        Image View
        ImageView img=findViewById(R.id.MyImageId);
        img.setImageResource(R.drawable.aaa);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}