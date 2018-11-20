package com.example.george.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 内存泄漏：
 * A a=A(); （ActivityTwo）
 * ....
 * c=a;（MainActivity中的ublic static Activity activity）
 * 只能定位到A泄漏
 * <p>
 * 发现泄漏方法1：Dump Java heap
 * 以package分类，找到这个类的引用
 * <p>
 * 发现泄漏方法2：Record方式
 * 以package分类，找到这个类的引用,双击找到泄漏代码部分
 */
public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        MainActivity.activity = this;
    }
}
