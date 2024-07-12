package com.example.broadcastrecieverinandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        This method is implemented when the Broadcast Reciever recieves a broadcast.

        if(intent.getAction()!=null && intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){

            boolean isAirplaneOn=intent.getBooleanExtra("state",false);

            String msg=isAirplaneOn ? "Airplane Mode ON":"Airplane Mode Off";
//            Use ternary operators   ?-> if true      :-> if false

            Toast.makeText(context, msg,Toast.LENGTH_SHORT).show();

        }


    }
}
