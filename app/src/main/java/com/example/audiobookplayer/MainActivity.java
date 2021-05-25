package com.example.audiobookplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            PlayViewFragment fragmentDemo = (PlayViewFragment)
                    getSupportFragmentManager().findFragmentById(R.id.fragment_container_view);
        }
    }
}