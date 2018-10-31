package com.codebakery.joan.trypreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        //역시 버튼 동작이 있으니까 핸들러를 달아줍니다.
        ((Button) findViewById(R.id.buttonSave)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //SharedPreferences pref = getSharedPreferences("member",Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = pref.edit(); 을
        //한줄로 줄였네요.
        SharedPreferences.Editor editor = getSharedPreferences("member",Context.MODE_PRIVATE).edit();
        editor.putString("name", ((EditText)findViewById(R.id.editTextName)).getText().toString());
        editor.putString("pass", ((EditText)findViewById(R.id.editTextPwd)).getText().toString());
        editor.putString("email", ((EditText)findViewById(R.id.editTextEmail)).getText().toString());

        //editor.commit() 이 성공하면 true 가 리턴 됩니다.
        if (editor.commit()){
            Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show();
        }

        //그냥
        //setResult(RESULT_FIRST_USER);
        super.finish();
    }
}
