package com.zainpradana.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.sampek_tuwek);
    }

    public void onPlay(View view) {
        mp.start();
    }

    public void onPause(View view) {
        mp.pause();
    }

    public void onStop(View view) {
        mp.stop();
        finish();
        moveTaskToBack(true);
    }
}