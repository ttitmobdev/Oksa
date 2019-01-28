package com.example.user.RegAndAuth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.user.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void auth(View view) {
        Intent auth = new Intent(MainActivity.this,AuthActivity.class);
        startActivity(auth);
    }

    public void reg(View view) {
        Intent reg = new Intent(MainActivity.this,RegActivity.class);
        startActivity(reg);
    }
}
