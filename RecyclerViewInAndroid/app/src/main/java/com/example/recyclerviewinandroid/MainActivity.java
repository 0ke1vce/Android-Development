package com.example.recyclerviewinandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

//    1- Adapter View
    RecyclerView recycleView;

//    2- Data Source
    List<ItemModelClass> lst;

//    Adapter
    MyCustomAdapter myadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        Recycler View-
//                  Makes it easy to efficiently display large set of data.
//          You supply the data and define how each items looks and the recycle view library dynamically creates the element when they're needed
//        Recycle those individual element. When an item scrolls off the screen, Recycle View doesn't destroy it's view.
//        Recycle View reuses that view that have scrolled on screen
//        Recycle view improves performance and app Responsiveness and reduces power consumption

//        Creating A recycle View
//        1- Item Layout
//        2- Recycler View
//        3- Model Class
//        4- Adapter Class
//        5- View Holder
        

        recycleView =findViewById(R.id.RecyclerView);
        lst=new ArrayList<ItemModelClass>() ;
        ItemModelClass item1=new ItemModelClass(R.drawable.ic_launcher_background,"icon1","icon1 description");
        ItemModelClass item2=new ItemModelClass(R.drawable.ic_launcher_background,"icon2","icon2 description");
        ItemModelClass item3=new ItemModelClass(R.drawable.ic_launcher_background,"icon3","icon3 description");
        ItemModelClass item4=new ItemModelClass(R.drawable.ic_launcher_background,"icon4","icon4 description");
        ItemModelClass item5=new ItemModelClass(R.drawable.ic_launcher_background,"icon5","icon5 description");
        ItemModelClass item6=new ItemModelClass(R.drawable.ic_launcher_background,"icon6","icon6 description");

        lst.add(item1);
        lst.add(item2);
        lst.add(item3);
        lst.add(item4);
        lst.add(item5);
        lst.add(item6);


//         Making a Linear Layout
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recycleView.setLayoutManager(layoutManager);




    myadapter=new MyCustomAdapter(lst);
    recycleView.setAdapter(myadapter);


    myadapter.setOnClickListener(this);



    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(this, lst.get(pos).getItemName(), Toast.LENGTH_SHORT).show();
    }
}