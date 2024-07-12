package com.example.greetingappwithcounterappandkilogramtopoundwithsharingdetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CounterApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_counter_app);

        TextView txt=findViewById(R.id.zero);
        Button btn=findViewById(R.id.counter);
        Button btn2=findViewById(R.id.reset);
        Button btn3=findViewById(R.id.back);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=txt.getText().toString();
                int x=Integer.parseInt(num);
                x=x+1;
                txt.setText(""+x);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("0");
            }
        });

        Intent in=new Intent(this, MainActivity.class);
        btn3.setOnClickListener(new View.OnClickListener() {
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