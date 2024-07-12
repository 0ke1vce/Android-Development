package com.example.volumecalculatorgridviewandmasteringadapters;

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

public class SphereVolume extends AppCompatActivity {
        EditText edt;
    TextView txt;
        Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sphere_volume);


        txt=findViewById(R.id.textView3);
        btn=findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt=findViewById(R.id.editText);
                String s=edt.getText().toString();
                Double radius=Double.parseDouble(s);
                Double volume =(4*3.14159*radius*radius*radius)/3;

                txt.setText(""+volume+" m^3");
            }
        });





    }
}