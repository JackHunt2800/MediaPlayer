package com.main.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart=findViewById(R.id.btn_start);
        btnStop=findViewById(R.id.btn_stop);

        //cut and paste it in the onStart method in Myservices class to run in the background
        /*MediaPlayer player= MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.start();*/

        btnStart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startService(new Intent(MainActivity.this,MyServices.class));
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                stopService(new Intent(MainActivity.this,MyServices.class));
            }
        });




    }




}