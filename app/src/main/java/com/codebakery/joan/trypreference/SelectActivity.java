package com.codebakery.joan.trypreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ((Button) findViewById(R.id.buttonToMain)).setOnClickListener(this);

        SharedPreferences sharedPreferences = getSharedPreferences("member",Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name", "Nobody");
        String pass = sharedPreferences.getString("pass", "Nobody");
        String email = sharedPreferences.getString("email", "Nobody");

        ((TextView) findViewById(R.id.textViewResult)).setText("이름 : " + name + "\n 비밀번호 : " + pass + "\n 이메일 : " + email);

    }

    @Override
    public void onClick(View v) {
        setResult(RESULT_FIRST_USER);
        finish();
    }
}
