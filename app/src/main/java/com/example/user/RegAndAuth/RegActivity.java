package com.example.user.RegAndAuth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.NewActivity;
import com.example.user.R;

public class RegActivity extends AppCompatActivity {
    EditText nameEdit;
    EditText loginEdit;
    EditText passwordEdit;
    EditText password2Edit;
    CheckBox checkBox;
    Button regBtn;
    String name1;
    String login1;
    String password;
    String password2;
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        nameEdit = findViewById(R.id.editNameId);
        loginEdit = findViewById(R.id.editLoginId);
        passwordEdit = findViewById(R.id.editPassId);
        password2Edit = findViewById(R.id.editPass2Id);
        checkBox = findViewById(R.id.checkboxId);
        regBtn = findViewById(R.id.newRegBtnId);
        link = findViewById(R.id.linkId);


        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name1 = nameEdit.getText().toString();
                login1 = loginEdit.getText().toString();
                password = passwordEdit.getText().toString();
                password2 = password2Edit.getText().toString();

                if (!name1.equals("") && !login1.equals("") && !password.equals("") && !password2.equals("") && password.equals(password2) ) {
                    if (checkBox.isChecked() == true) {
                        Intent suc = new Intent(RegActivity.this, NewActivity.class);
                        suc.putExtra("NAME", name1);
                        startActivity(suc);
                    } else {
                        toast("Вы не приняли условия соглашения.");
                    }
                } else {
                    toast("Ошибка. Проверьте корректность данных.");
                }
            }
        });
    }
    public void toast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
