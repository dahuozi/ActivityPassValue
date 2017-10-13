package com.dahuozi.activitypassvalue;

import android.app.Application;

/**
 * Created by lenovo on 2017/10/13.
 * 全局存储数据
 */

public class MyApplication extends Application {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
