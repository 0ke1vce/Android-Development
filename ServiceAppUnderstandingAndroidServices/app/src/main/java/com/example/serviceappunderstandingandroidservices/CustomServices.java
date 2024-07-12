package com.example.serviceappunderstandingandroidservices;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class CustomServices extends Service {


    private MediaPlayer player;
//    MEdiaplayer  class use to play audio and video in app. Provide a interface to control play,pause etc...use to play media from various sources like local disk, newtwork service etc.


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

//         This will play default audio of ringtone  in device
        player=MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);

//
        player.setLooping(true);
        player.start();

        return START_STICKY;  //START_STICKY means service should be restarted after it has been terminated

    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;   // null indicate it doesn't bind to any other services or activity
    }
}
