package com.example.cardviewandsportsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ClickListener {


    RecyclerView rcl;
List<CardModelClass> lst;
CustomAdapter cadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rcl=findViewById(R.id.Recycler);
        lst=new ArrayList<CardModelClass>();
        CardModelClass c1=new CardModelClass("Football",R.drawable.football);
        CardModelClass c2=new CardModelClass("Boxing",R.drawable.boxing);
        CardModelClass c3=new CardModelClass("Volleyball",R.drawable.volleyball);
        CardModelClass c4=new CardModelClass("Basketball",R.drawable.basketball);
        CardModelClass c5=new CardModelClass("Formulae1",R.drawable.formulae);

        lst.add(c1);
        lst.add(c2);
        lst.add(c3);
        lst.add(c4);
        lst.add(c5);

        LinearLayoutManager ln=new LinearLayoutManager(this);
        rcl.setLayoutManager(ln);

        cadapter=new CustomAdapter(lst);
        rcl.setAdapter(cadapter);

        cadapter.setClickListener(this);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
        public void onClick(View view,int pos){
            Toast.makeText(this, lst.get(pos).getTitle(), Toast.LENGTH_SHORT).show();
        }


}