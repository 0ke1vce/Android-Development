package com.example.maakichu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button login;
EditText user,password;
TextView  signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    login=findViewById(R.id.LoginToApp);
    user=findViewById(R.id.EmailLogin);
    password=findViewById(R.id.Password);
    signin=findViewById(R.id.Signin);

    Intent signinpage=new Intent(this, MainActivity2.class);
    signin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(signinpage);
        }

    });

    Intent loginapp=new Intent(this, MainActivity3.class);
    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(loginapp);
        }
    });

    }
}