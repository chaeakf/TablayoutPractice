package com.tj.tablayoutpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tj.tablayoutpractice.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        act.tabLayout.addTab(act.tabLayout.newTab().setText("홈"));

    }

    @Override
    public void bindViews() {
        act= DataBindingUtil.setContentView(this, R.layout.activity_main);

    }
}
