package com.example.user.RegAndAuth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.R;

public class FrgPassActivity extends AppCompatActivity {
    EditText log;
    Button frg;
    String login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frg_pass);
        log = findViewById(R.id.editLoginFrgId);
        frg = findViewById(R.id.frgBtnId);
        frg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login = log.getText().toString();
                if (!login.equals("")) {
                    Intent go = new Intent(FrgPassActivity.this, AuthActivity.class);
                    startActivity(go);
                } else {
                    toast("Вы не ввели логин.");
                }
            }
        });

    }
    public void toast (String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
