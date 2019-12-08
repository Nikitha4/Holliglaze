package com.example.christmasgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class SugarCookieScreen extends YouTubeBaseActivity {
    com.google.android.youtube.player.YouTubePlayerView YouTubePlayerView;
    Button buttonPlay;
    YouTubePlayer.OnInitializedListener OnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube);
        buttonPlay = (Button) findViewById(R.id.buttonPlay);
        YouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlay);
        OnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("qup8YYGQyCk");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        };
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YouTubePlayerView.initialize((YouTubeConfiguration.getApiKey()), OnInitializedListener);
            }
        });
    }
}
