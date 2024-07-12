package com.example.luckynumberapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    Button changeActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        edt=findViewById(R.id.Name);
        changeActivity=findViewById(R.id.button4);


        changeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x=edt.getText().toString();
                if(x.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter your name please", Toast.LENGTH_SHORT).show();
                }
                else{
               changeactivity(x);
            }}
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void changeactivity(String x){
        Intent in=new Intent(getApplicationContext(), MainActivity2.class);
        in.putExtra("name",x);    //it uses a key value pair
//        Put extra method is use to put extra data within an intent object;
        startActivity(in);
    }
}