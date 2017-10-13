package com.dahuozi.activitypassvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyApplication application;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send(View view){
        switch (view.getId()) {
            case R.id.btn1:
                //通过Intent方式传值
                Intent intent = new Intent(MainActivity.this, resultActivity.class);
                intent.putExtra("name", "zhaoxulang");
                intent.putExtra("age", 20);
                intent.putExtra("score", 98.5);
                intent.putExtra("sex", '男');
                intent.putExtra("bl", true);
                startActivity(intent);
                break;
            case R.id.btn2:
                //通过Bundle传值
                Intent intent1= new Intent(MainActivity.this,resultActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","大伙子");
                bundle.putInt("age",19);
                bundle.putDouble("score",98.5);
                bundle.putChar("sex",'男');
                intent1.putExtras(bundle);
                startActivity(intent1);
                break;

        }

    }
    //点击按钮保存到Application
    public void click(View view){
        application = (MyApplication) getApplication();
        application.setName("小明");
        application.setAge(18);
        startActivity(new Intent(MainActivity.this,resultActivity.class));
    }
}
