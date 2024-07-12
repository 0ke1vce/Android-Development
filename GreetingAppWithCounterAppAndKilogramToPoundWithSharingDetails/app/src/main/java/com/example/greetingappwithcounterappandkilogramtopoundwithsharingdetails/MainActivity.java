package com.example.greetingappwithcounterappandkilogramtopoundwithsharingdetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public void Sharedata(){
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,"App By-> Ujjwal");
        startActivity(Intent.createChooser(i,"Choose a platform"));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       Button greetapp=findViewById(R.id.greet);
        Intent greet=new Intent(this, GreetingApp.class);
       greetapp.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               startActivity(greet);
           }
       });

        Button counterApp=findViewById(R.id.counter);
        Intent counter=new Intent(this, CounterApp.class);
        counterApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(counter);
            }
        });


        Button kgToLbs=findViewById(R.id.KgToLb);
        Intent KGTOLBS=new Intent(this, KiloGramsToPounds.class);
        kgToLbs.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           startActivity(KGTOLBS);
                                       }
                                   });

/*
    //      To get name from greeting App
    Intent in=getIntent();
    String name=in.getStringExtra("name");
*/
        Button share=findViewById(R.id.ShareDetails);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sharedata();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}