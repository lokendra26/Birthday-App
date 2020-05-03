package com.example.devanshsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.WindowManager;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class firstvideo extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstvideo);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(firstvideo.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        },15000);

        VideoView videoViewone=(VideoView) findViewById(R.id.videoView2);
        String uriPath="android.resource://com.example.devanshsapp/"+R.raw.one_birthday;
        Uri uri=Uri.parse(uriPath);
        videoViewone.setVideoURI(uri);
        videoViewone.requestFocus();
        videoViewone.start();
    }

}
