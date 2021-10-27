package com.hakansaglam.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Boolean isMetallica = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        if (isMetallica) {
            isMetallica = false;
           imageView.setImageResource(R.drawable.metallica);
        } else {
            isMetallica = true;
            imageView.setImageResource(R.drawable.metallica2);
        }
    }
}