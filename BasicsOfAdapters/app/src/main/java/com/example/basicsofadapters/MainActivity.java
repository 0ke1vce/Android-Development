package com.example.basicsofadapters;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
        ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//          1- Adapter view creation
//        AdapterView is a class in Android that provide a container to display a class of items or data in a scrollable view
//        It's Part of Android UI framework that acts as a placeholder for various type of adapter based views like grid view,list view ,Spiner and more
//        ListView is an Adapter view that displays a vertical list of items that can be scrolled
        list=findViewById(R.id.ListView);

//        2- Data Source
//        Data Source-> refers to collection of data that you want to display using adapter
//        It can be a Array, a list, a cursor from database or any other data structure that holds the information you want to show on screen
//        DataSource is what  the adapters take as an input and Transform into Views for displaying within the adapter view
        String [] str={"India","America","Japan","Russia","Argentina","Ukraine","Palistien","China","korea","france","Germany","Malasiya","Bulgaria","South Korea","britain","Italy","Mexico","Egypt","Kazekistan","Pakistan","Australia"};

//        3- Adapter Creation
//        Adapter-> Acts as a bridge between data source and adapter view

//         ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,str);

// This establishes the connection between  the data and the views that will be displayed on the screen
        // SetAdapter() is use to associate an adapter with a UI component  that displays a collection
//        list.setAdapter(adapter);


//         Running my Custom Adapter
       CustomAdapter ad= new CustomAdapter(this,str);
       list.setAdapter(ad);





/*

        Spinner sp=findViewById(R.id.spin);
        String []s={"A","B","c"};
        ArrayAdapter <String> adapter1=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,s);
        sp.setAdapter(adapter1);

*/


    }
}