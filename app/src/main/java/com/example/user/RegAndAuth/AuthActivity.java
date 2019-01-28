package com.example.user.RegAndAuth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.NewActivity;
import com.example.user.R;

public class AuthActivity extends AppCompatActivity {
    EditText loginEdit;
    EditText passwordEdit;
    Button authBtn;
    Button frgPass;
    String userLogin;
    String userPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        loginEdit = findViewById(R.id.editLoginAuthId);
        passwordEdit = findViewById(R.id.editPassAuthId);
        authBtn = findViewById(R.id.authBtnId);
        frgPass = findViewById(R.id.frgBtnId);

        authBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin = loginEdit.getText().toString();
                userPass = passwordEdit.getText().toString();
                if (!userLogin.equals("")&& !userPass.equals("")){
                    Intent suc = new Intent(AuthActivity.this,NewActivity.class);
                    startActivity(suc);
                } else
                    toast("Ошибка. Проверьте корректность данных.");
            }
        });
        frgPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frg = new Intent(AuthActivity.this,FrgPassActivity.class);
                startActivity(frg);
            }
        });
    }
    public void toast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
