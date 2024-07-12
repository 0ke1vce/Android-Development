package com.example.menusinandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Date;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

//        Date Picker
        DatePicker dt=findViewById(R.id.Date);

//        Button
        Button bt=findViewById(R.id.btn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String day=" Day "+dt.getDayOfMonth();
                    String month=" Month "+(dt.getMonth()+1);
                    String Year=" Year "+dt.getYear();
                Toast.makeText(MainActivity3.this, day+month+Year, Toast.LENGTH_SHORT).show();
            }
        });



        Button next=findViewById(R.id.NextPage);
        Intent in=new Intent(this, MainActivity4.class);
        next.setOnClickListener(new View.OnClickListener() {
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