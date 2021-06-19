package com.mengpeng.linkageviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mengpeng.linkageviewpager.widget.LinkTab;
import com.mengpeng.linkageviewpager.widget.RadioGroupTabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RadioGroupTabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);

        initTab();
    }

    private void initTab() {

        List<LinkTab> list = new ArrayList<>();
        list.add(new LinkTab("测试1", R.drawable.maintab_1_selector));
        list.add(new LinkTab("测试2", R.drawable.maintab_2_selector));
        list.add(new LinkTab("测试3", R.drawable.maintab_3_selector));
        list.add(new LinkTab("测试4", R.drawable.maintab_4_selector));

        tabLayout.addTab(list);
        tabLayout.setRadioGroupTabLayoutBackground(R.color.colorBg);

        tabLayout.setOnRadioGroupTabLayoutClickListener(
                new RadioGroupTabLayout.setOnRadioGroupTabLayoutClickListener() {
                    @Override
                    public void onTabLayoutClickListener(int position) {
                        Log.d("MainActovity", "下标：" + position);
                    }
                });

    }
}
