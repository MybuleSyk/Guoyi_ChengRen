package com.example.lx.guoyi_chengren.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by lx on 2018/4/12.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initlayout());

        initView();
        initDate();
        initListener();
    }

    protected abstract int initlayout();
    protected abstract void initView();

    protected abstract void initDate();

    protected abstract void initListener();

}
