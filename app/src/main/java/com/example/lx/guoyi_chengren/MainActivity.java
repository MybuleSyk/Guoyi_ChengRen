package com.example.lx.guoyi_chengren;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.lx.guoyi_chengren.base.BaseActivity;
import com.example.lx.guoyi_chengren.comment.CommentFragment;
import com.example.lx.guoyi_chengren.energy.EnergyFragment;
import com.example.lx.guoyi_chengren.friends.FriendsFragment;
import com.example.lx.guoyi_chengren.home.HomeFragment;
import com.example.lx.guoyi_chengren.my.MyFragment;
import android.support.v4.app.FragmentManager;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends BaseActivity{

    private FrameLayout main_framelayout;
    private RadioGroup m_group;
    private HomeFragment homeFragment;
    private EnergyFragment energyFragment;
    private CommentFragment commentFragment;
    private FriendsFragment friendsFragment;
    private MyFragment myFragment;
    private FragmentManager manager;


    @Override
    protected int initlayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        main_framelayout= (FrameLayout) findViewById(R.id.main_framelayout);
        m_group= (RadioGroup) findViewById(R.id.radiogroup);
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        if (homeFragment == null) {
            homeFragment=new HomeFragment();
            transaction.add(R.id.main_framelayout,homeFragment);
        }else {
            transaction.show(homeFragment);
        }

        transaction.commit();
    }
    @Override
    protected void initDate() {

    }

    @Override
    protected void initListener() {


        m_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                FragmentTransaction transaction = manager.beginTransaction();
                hideAll(transaction);

                switch (checkedId){
                    case R.id.home:

                        if (homeFragment == null) {
                            homeFragment=new HomeFragment();
                            transaction.add(R.id.main_framelayout,homeFragment);
                        }else {
                            transaction.show(homeFragment);
                        }

                        break;
                    case R.id.energy:

                        if (energyFragment == null) {
                            energyFragment=new EnergyFragment();
                            transaction.add(R.id.main_framelayout,energyFragment);
                        }else {
                            transaction.show(energyFragment);
                        }

                        break;
                    case R.id.comment:

                        if (commentFragment == null) {
                            commentFragment=new CommentFragment();
                            transaction.add(R.id.main_framelayout,commentFragment);
                        }else {
                            transaction.show(commentFragment);
                        }
                        break;
                    case R.id.friends:

                        if (friendsFragment == null) {
                            friendsFragment=new FriendsFragment();
                            transaction.add(R.id.main_framelayout,friendsFragment);
                        }else {
                            transaction.show(friendsFragment);
                        }
                        break;
                    case R.id.my:

                        if (myFragment == null) {
                            myFragment=new MyFragment();
                            transaction.add(R.id.main_framelayout,myFragment);
                        }else {
                            transaction.show(myFragment);
                        }
                        break;
                }
                transaction.commit();
            }
        });

    }

    public void hideAll(FragmentTransaction transaction){

        if (homeFragment != null) {

            transaction.hide(homeFragment);
        }
        if (energyFragment != null) {

            transaction.hide(energyFragment);
        }
        if (commentFragment != null) {

            transaction.hide(commentFragment);
        }
        if (friendsFragment != null) {

            transaction.hide(friendsFragment);
        }
        if (myFragment != null) {
            transaction.hide(myFragment);
        }

    }

}
