package com.mengpeng.linkageviewpager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mengpeng.linkageviewpager.R;

/**
 * 作者：MengPeng
 * 时间：2018/3/5 - 下午7:09
 * 说明：
 */
public class RadioGroupTabLayout extends RelativeLayout {

    private Context context;

    public RadioGroupTabLayout(Context context) {
        this(context, null);
    }

    public RadioGroupTabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RadioGroupTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;

        initView(attrs, defStyleAttr);

    }

    private void initView(AttributeSet attrs, int defStyleAttr) {
        View view = LayoutInflater.from(context).inflate(R.layout.radiogroup_tablayout, null);

        TextView line = view.findViewById(R.id.radioGroupTabLayout_line);
        RadioGroup container = view.findViewById(R.id.radioGroupTabLayout_container);

        initAddTab();


    }

    private void initAddTab() {

    }
}
