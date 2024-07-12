package com.example.volumecalculatorgridviewandmasteringadapters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelClass> myArrayList;
    GridView grd;
    myCustomAdapters adapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        grd=findViewById(R.id.Grid);
        myArrayList =new ArrayList<>();

        ModelClass shape1=new ModelClass("Cylinder", R.drawable.cylinder);
        ModelClass shape2=new ModelClass("Cube", R.drawable.cube);
        ModelClass shape3=new ModelClass("Cuboid",R.drawable.cuboid);
        ModelClass shape4=new ModelClass("Sphere", R.drawable.sphere);

        myArrayList.add(shape1);
        myArrayList.add(shape2);
        myArrayList.add(shape3);
        myArrayList.add(shape4);

       adapters=new myCustomAdapters(myArrayList,getApplicationContext());
        grd.setAdapter(adapters);
//        grd.setNumColumns(2);
// You can set number of columns in XML Also



        grd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               String shape=adapters.getItem(i).getShapename().toString();
                if(shape.equals("Sphere")){
                   Intent forsphere=new Intent(getApplicationContext(), SphereVolume.class);
                    startActivity(forsphere);
               }
                if(shape.equals("Cube")){
                    Intent cube=new Intent(getApplicationContext(),com.example.volumecalculatorgridviewandmasteringadapters.cube.class);
                    startActivity(cube);
                }


            }
        });



    }
}