package com.example.greetingappwithcounterappandkilogramtopoundwithsharingdetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GreetingApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_greeting_app);


        EditText edt=findViewById(R.id.textUser);
        Button btn=findViewById(R.id.greet);
        Button btn2=findViewById(R.id.back);


//        Intent givingDataToMain=new Intent(this,MainActivity.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=edt.getText().toString();
         /*       givingDataToMain.putExtra("name",s);
                startActivity(givingDataToMain);
          */
                Toast.makeText(GreetingApp.this, "Hello Have a Good Day "+s, Toast.LENGTH_SHORT).show();
            }
        });

        Intent in=new Intent(this, MainActivity.class);
        btn2.setOnClickListener(new View.OnClickListener() {
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
}