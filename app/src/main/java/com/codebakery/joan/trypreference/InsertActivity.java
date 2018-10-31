package com.codebakery.joan.trypreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsertActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        ((Button) findViewById(R.id.buttonSave)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SharedPreferences.Editor editor = getSharedPreferences("member",Context.MODE_PRIVATE).edit();
        editor.putString("name", ((EditText)findViewById(R.id.editTextName)).getText().toString());
        editor.putString("pass", ((EditText)findViewById(R.id.editTextPwd)).getText().toString());
        editor.putString("email", ((EditText)findViewById(R.id.editTextEmail)).getText().toString());
        editor.commit();
    }
}
