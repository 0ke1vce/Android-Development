package com.example.databindinginandroid;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void onButtonClicked(View view){
        Toast.makeText(context, "Button is been click", Toast.LENGTH_SHORT).show();
    }

}
