package com.example.luckynumberapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    Random rand=new Random();
    TextView randomNumber;
    Button shareButton;





public void sharedata(String Name,int RandomNumber){
    Intent i =new Intent(Intent.ACTION_SEND) ;
    //Action send use to send data across diffrent application
    i.setType("text/plain");

//    Additional Information
    i.putExtra(Intent.EXTRA_SUBJECT,Name+" got Lucky today!");
    i.putExtra(Intent.EXTRA_TEXT,"His Lucky Number is: "+RandomNumber);

//    Then we will start activity and pass intent.createChoose() and i choose a platform
//    createChooser method will allow us to create a dialog that display a list of application that can handle specific intent
//    Useful when you want to give which application to choose
    startActivity(Intent.createChooser(i,"Choose a Platform"));

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        randomNumber=findViewById(R.id.randNumber);
        shareButton=findViewById(R.id.share);

//        to get the name from first activity
        Intent i=getIntent();
        String Name=i.getStringExtra("name");
//        Key ki value de do



//        To generate Random number
        int LuckyNumber=rand.nextInt(10001);
        randomNumber.setText(""+LuckyNumber);

//        Share Button
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               sharedata(Name,LuckyNumber);
            }
        });






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}