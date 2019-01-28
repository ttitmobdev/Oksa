package com.example.user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    TextView nameText;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        nameText = findViewById(R.id.nameId);
        Intent getName = getIntent();
        userName = getName.getStringExtra("NAME");
        try {
            if (!userName.equals("null"))
                nameText.setText("Привет, " + userName + "!");
            else
                nameText.setText("");
        } catch (Exception e){
            Log.d("Ssd","aas");
        }
    }
}
