package com.example.george.myapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 内存泄漏：handler持有当前activity
 * 发现泄漏方法1：Dump Java heap
 *  以package分类，找到这个类的引用
 *
 * 发现泄漏方法2：Record方式
 *  以package分类，找到这个类的引用,双击找到泄漏代码部分
 *
 */
public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },1000000);
    }
}
