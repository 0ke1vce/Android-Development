package com.example.activitylifecycle;

import static com.example.activitylifecycle.R.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    // onCreate() is the first method which is called when an activity is created
//    Its where you perform initialisation task such as setting up UI and initialising variable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        Initialise UI element and variables here
        Toast.makeText(this, "onCreate Method is called", Toast.LENGTH_SHORT).show();


// Types of INtent-:
//         Explicit Intent -> Use to start specific activity within your own application
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSecondActivity();
            }
        });


//            Implicit INtent-> use to perform action that can involve component from other applications
// Open web page from chrome
           Button b1=findViewById(R.id.button2);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openWebPage();
                }
            });





    }
public void openWebPage(){
    Uri webpage =Uri.parse("https://www.google.com");
    Intent intent =new Intent(Intent.ACTION_VIEW,webpage);
    startActivity(intent);
}
    public void gotoSecondActivity(){
        Intent in =new Intent(this, MainActivity3.class);
        startActivity(in);
    }

    //    Second method is onStart method
    // This method is called when the activity  become visible  to the user. but is not yet  interactive
    @Override
    protected void onStart() {
        super.onStart();

//        Start animations or UI related tasks
        Toast.makeText(this, "onStart Method is called", Toast.LENGTH_SHORT).show();

    }

// This method is called  when the activity is in the foreground and ready for user interaction
    @Override
    protected void onResume() {
        super.onResume();
//        Component that should be actively running like live locations and sensors
        Toast.makeText(this, "onResume method is called", Toast.LENGTH_SHORT).show();
    }



//    This methods is called when activity is about to lose focus typically because of another activity is starting or device is going into multi window mode,
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() is called", Toast.LENGTH_SHORT).show();
//you should release resource and pause operations
    }



//    This method is called when the activity is no longer visible to the user
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop() is called", Toast.LENGTH_SHORT).show();
//        Release resources , save data
    }


//    This method is called when the activity is restarted after being stopped
    @Override
    protected void onRestart() {
        super.onRestart();
//        Perform any necessary restart task
//        onRestart() is followed by onStart()
        Toast.makeText(this, "onRestart() is called", Toast.LENGTH_SHORT).show();
    }



//      This method is called when activity is being destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Clean up resource and finalize task
        Toast.makeText(this, "onDestroy() is called", Toast.LENGTH_SHORT).show();

    }


}