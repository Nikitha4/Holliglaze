package com.example.christmasgame;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class SecondScreen extends YouTubeBaseActivity {
    Spinner cookieSpinner;
    Spinner cakeSpinner;
    Spinner candySpinner;
    Spinner pieSpinner;
    Spinner pastrySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        cookieSpinner = (Spinner) findViewById(R.id.Cookies);
        cookieSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1){
                    Intent intent = new Intent(SecondScreen.this, GingerbreadScreen.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, SugarCookieScreen.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, ChocolateCookieScreen.class);
                    startActivity(intent);
                } else {
                    return;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        cakeSpinner = (Spinner) findViewById(R.id.Cake);
        cakeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1){
                    Intent intent = new Intent(SecondScreen.this, RedVelvetCakeScreen.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, YuleLogCakeScreen.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, FruitCakeScreen.class);
                    startActivity(intent);
                } else {
                    return;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        candySpinner = (Spinner) findViewById(R.id.Candy);
        candySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1){
                    Intent intent = new Intent(SecondScreen.this, TrufflesCandyScreen.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, PeppermintBarkCandyScreen.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, SnowmenPopsCandyScreen.class);
                    startActivity(intent);
                } else {
                    return;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        pieSpinner = (Spinner) findViewById(R.id.Pie);
        pieSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1){
                    Intent intent = new Intent(SecondScreen.this, ApplePieScreen.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, WhiteChristmasPieScreen.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, CoconutPieScreen.class);
                    startActivity(intent);
                } else {
                    return;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        pastrySpinner = (Spinner) findViewById(R.id.Pastries);
        pastrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1){
                    Intent intent = new Intent(SecondScreen.this, TeaSconesPastryScreen.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, CroissantPastryScreen.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, DanishPastryScreen.class);
                    startActivity(intent);
                } else {
                    return;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
