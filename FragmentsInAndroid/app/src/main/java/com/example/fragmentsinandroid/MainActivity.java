package com.example.fragmentsinandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button firstfragment,secondfragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        firstfragment=findViewById(R.id.button1);
        secondfragment=findViewById(R.id.button2);

        firstfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 loadFragment(new First_fragment());
            }
        });

        secondfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new Second_fragment());
            }
        });






    }

    public void loadFragment(Fragment fragment){
        FragmentManager fm=getSupportFragmentManager();
//        It's a system service provide by android that is responsible for managing the fragments
//        responsible for all runtime managment of fragments, including adding, removing, hiding, showing and navigation between fragments

        FragmentTransaction ft=fm.beginTransaction();
//         Transaction is a set of operations that involves adding,replacing, or removing fragments within the activity
//         Begintransaction() creates a  new transaction to change a fragment during runtime
//         You can use add method or replace method for fragments transaction to specify which fragments to add or replace or where to add them in activity layout.
        ft.replace(R.id.frameLayout,fragment);
        ft.commit();  // this method is use to save the changes




    }

}