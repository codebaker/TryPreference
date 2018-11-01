package com.codebakery.joan.trypreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 반드시 setContentView(R.layout.activity_main) 이후에 findViewById를 하셔야 합니다
        // 안그럼 null이 떨어져요
        setContentView(R.layout.activity_main);

        //버튼 있으니까 핸들러를 달아줍니다.
        ((Button) findViewById(R.id.buttonInsert)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonSelect)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //버튼이 두개니까 분기문으로 처리해 줍니다.
        switch(view.getId()) {
            case R.id.buttonInsert :
                //Intent intent = new Intent(this,InsertActivity.class) 를
                // 하지 않고 바로 new 해줍니다.
                startActivityForResult(new Intent(this,InsertActivity.class),RESULT_FIRST_USER);
                break;
            case R.id.buttonSelect :
                startActivityForResult(new Intent(this,SelectActivity.class),RESULT_FIRST_USER);
                break;
            default:
                break;
        }
    }
}
