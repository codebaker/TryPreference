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

        //메인으로 돌아가는 버튼에 핸들러 달고
        ((Button) findViewById(R.id.buttonToMain)).setOnClickListener(this);


        //getSharedPreferences(저장한 파일 이름,Context.MODE_PRIVATE) 저장한 파일이름으로 SharedPreferences 객체를 가져온다,
        SharedPreferences sharedPreferences = getSharedPreferences("member",Context.MODE_PRIVATE);

        //키값으로 가져와서
        String name = sharedPreferences.getString("name", "Nobody");
        String pass = sharedPreferences.getString("pass", "None");
        String email = sharedPreferences.getString("email", "None");

        //텍스트 뷰에 저장합니다.
        ((TextView) findViewById(R.id.textViewResult)).setText("- 이름 : " + name + "\n- 비밀번호 : " + pass + "\n- 이메일 : " + email);
    }

    @Override
    public void onClick(View v) {
        //백버튼을 누르면 호출되서 화면을 닫아주는 finish() 호출해주면됨.
        super.finish();
    }
}
