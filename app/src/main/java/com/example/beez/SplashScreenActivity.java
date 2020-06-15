package com.example.beez;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen config=new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(StartActivity.class)
                .withSplashTimeOut(3000)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
                .withLogo(R.drawable.pngtree);

        View easyscreen=config.create();
        setContentView(easyscreen);

    }
}