package com.dahuozi.activitypassvalue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends Activity {
    //private TextView tv;
    private TextView tv_showInfo;
    private MyApplication myApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layout);
        /*
        tv = (TextView)findViewById(R.id.tv_show);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",0);
        double score = intent.getDoubleExtra("score",0.0);
        char sex = intent.getCharExtra("sex",' ');
        boolean bl = intent.getBooleanExtra("bl",false);
        tv.setText("name:"+name+"\nage:"+age+"\nscore:"+score+"\nsex:"+sex+"\nbl:"+bl);
        */
        tv_showInfo = (TextView) findViewById(R.id.tv_show);
        /*Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("name");
        int   age = bundle.getInt("age");
        double score = bundle.getDouble("score");
        char sex = bundle.getChar("sex");
        tv_showInfo.setText("name:"+name+"\nage:"+age+"\nscore:"+score+"\nsex:"+sex);*/
        myApplication = (MyApplication)getApplication();
        String name = myApplication.getName();
        int age = myApplication.getAge();
        tv_showInfo.setText("name:"+name+"\nage:"+age);



    }
}
