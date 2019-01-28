package com.example.user.Splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.RegAndAuth.MainActivity;
import com.example.user.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread mTh = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent goMain = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(goMain);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        mTh.start();
    }
}
