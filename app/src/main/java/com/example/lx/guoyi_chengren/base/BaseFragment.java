package com.example.lx.guoyi_chengren.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lx on 2018/4/12.
 */

public abstract class BaseFragment extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //视图
        initview();

        initdata();

        return initlayout();
    }

    @Override
    public void onResume() {
        super.onResume();

        restartdata();
    }

    protected abstract void initview();

    protected abstract void initdata();

    protected abstract View initlayout();

    protected abstract void restartdata();
}
