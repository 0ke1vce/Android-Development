package com.example.broadcastrecieverinandroid;

import android.content.Intent;
import android.content.IntentFilter;
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


        IntentFilter intentFilter= new IntentFilter("android.intent.action.AIRPLANE_MODE");
        AirplaneModeReciever broadcastreciever=new AirplaneModeReciever();
        registerReceiver(broadcastreciever,intentFilter);









        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}


/*

Broadcast Reciever listens for system-wide broadcast events or intents and allows your application to respond to those events.

When any of these event occurs, it bring the application into action by creating a notification bar or performing a task.

UNlike activities broadcast reciever doesn't contain any user interface

 */