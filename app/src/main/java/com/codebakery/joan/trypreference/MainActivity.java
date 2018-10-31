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
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.buttonInsert)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonSelect)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonInsert :
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
