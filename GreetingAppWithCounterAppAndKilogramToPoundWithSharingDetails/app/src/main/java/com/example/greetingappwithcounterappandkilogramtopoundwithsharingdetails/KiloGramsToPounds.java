package com.example.greetingappwithcounterappandkilogramtopoundwithsharingdetails;

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

public class KiloGramsToPounds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kilo_grams_to_pounds);

        EditText edt=findViewById(R.id.kg);
        Button btn=findViewById(R.id.Convert);
        Button btn2=findViewById(R.id.back);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=edt.getText().toString();
                Double d=Double.parseDouble(s);
                Double Pound=d*2.20462262;
                edt.setText("");
                Toast.makeText(KiloGramsToPounds.this, "In Pound It is: "+Pound+" Lbs", Toast.LENGTH_SHORT).show();
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