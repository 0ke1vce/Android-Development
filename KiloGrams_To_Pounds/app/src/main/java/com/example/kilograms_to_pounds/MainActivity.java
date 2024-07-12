package com.example.kilograms_to_pounds;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    EditText edt;
    Button butn,resett;


    public void ConvertToPound(String s){
        double n=Double.parseDouble(s)*2.20462262;   //here we converted the kilogram into pounds
        txt.setText(""+n);
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        TAking wieghts in KGS
        edt=findViewById(R.id.kgs);
        //        Using Button
        butn=findViewById(R.id.btn);
//     Giving Into Pounds
        txt=findViewById(R.id.Pounds);
//        Resetting
        resett=findViewById(R.id.reset);


        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=edt.getText().toString();
              ConvertToPound(s);

            }
        });

        resett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Resetting", Toast.LENGTH_SHORT).show();
                txt.setText("0");
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}