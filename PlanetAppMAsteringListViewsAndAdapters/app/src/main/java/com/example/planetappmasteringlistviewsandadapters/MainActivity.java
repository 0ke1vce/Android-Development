package com.example.planetappmasteringlistviewsandadapters;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//        ListView listView;
    ListView listView;
    ArrayList<PlanetModelClass> planetarraylist;
    MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//         Adapter View
        listView=findViewById(R.id.Lview);

//        Data source
        planetarraylist=new ArrayList<>();

        PlanetModelClass planet1=new PlanetModelClass("Mercury","0 Moons",R.drawable.mercury);
        PlanetModelClass planet2=new PlanetModelClass("Venus","0 Moons",R.drawable.venus);
        PlanetModelClass planet3=new PlanetModelClass("Earth","1 Moons",R.drawable.earth);
        PlanetModelClass planet4=new PlanetModelClass("Mars","2 Moons",R.drawable.mars);
        PlanetModelClass planet5=new PlanetModelClass("Jupiter","63 Moons",R.drawable.jupiter);
        PlanetModelClass planet6=new PlanetModelClass("Saturn","95 Moons",R.drawable.saturn);
        PlanetModelClass planet7=new PlanetModelClass("Uranus","28 Moons",R.drawable.uranus);
        PlanetModelClass planet8=new PlanetModelClass("Neptune","16 Moons",R.drawable.neptune);

        planetarraylist.add(planet1);
        planetarraylist.add(planet2);
        planetarraylist.add(planet3);
        planetarraylist.add(planet4);
        planetarraylist.add(planet5);
        planetarraylist.add(planet6);
        planetarraylist.add(planet7);
        planetarraylist.add(planet8);

//     Adapter:
        adapter=new MyCustomAdapter(planetarraylist,getApplicationContext());
        listView.setAdapter(adapter);



//      HANDLING CLICK EVENTS:
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Planet Name "+adapter.getItem(i).getPlanet()+" have "+adapter.getItem(i).getMoon(), Toast.LENGTH_SHORT).show();
            }
        });




//My Code--:get


        /*
        listView=findViewById(R.id.Lview);
        String []Planet={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};

        String [] img={"0","1","2","3","4","5","6","7"};

        String[] text={"Moon Count- 0","Moon Count- 0","Moon Count- 1","Moon Count-2","Moon Count- 63","Moon Count- 95","Moon Count- 28","Moon Count- 16"};



        CustomAdapters CAdapter=new CustomAdapters(Planet,img,text,this);
        listView.setAdapter(CAdapter);

*/
    }
}