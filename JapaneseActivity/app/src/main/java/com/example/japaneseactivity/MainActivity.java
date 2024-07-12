package com.example.japaneseactivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button naruto,onepiece,bleach,dragonball;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        naruto=findViewById(R.id.Naruto);
        onepiece=findViewById(R.id.OnePiece);
        bleach=findViewById(R.id.Bleach);
        dragonball=findViewById(R.id.DragonBall);


//        Calling our function To running sound when we press the button
        naruto.setOnClickListener(this);
        onepiece.setOnClickListener(this);
        bleach.setOnClickListener(this);
        dragonball.setOnClickListener(this);

/*
        naruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.naruto);
                mediaPlayer.start();

            }
        });


        bleach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.bankai);
                mediaPlayer.start();
            }
        });


        dragonball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.goku);
                mediaPlayer.start();
            }
        });


        onepiece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.luffy);
                mediaPlayer.start();
            }
        });
*/


    }

    @Override
    public void onClick(View view) {
            int ClickedButton=view.getId();
            if(ClickedButton==R.id.Naruto){
                PlaySounds(R.raw.naruto);
            }
            else if (ClickedButton==R.id.Bleach) {
                PlaySounds(R.raw.bankai);
            }
            else if(ClickedButton==R.id.OnePiece){
                PlaySounds(R.raw.luffy);
            } else if (ClickedButton==R.id.DragonBall) {
                    PlaySounds(R.raw.goku);
            }
    }


    public void PlaySounds(int sourcefile){
                    MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),sourcefile);
                    mediaPlayer.start();
    }



}