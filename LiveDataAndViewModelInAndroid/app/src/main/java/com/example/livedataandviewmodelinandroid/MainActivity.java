package com.example.livedataandviewmodelinandroid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


    }
}



/*

View Model is a class that is responsible for prepraring and managing the data for an activity or fragment.
It also handles the communication of the Activity/Fragment with rest of Application.

View Model Class is a buiesness logic or screen level state holder. It exposes the state to UI and encapsulates related Buiesness logic.

 */
