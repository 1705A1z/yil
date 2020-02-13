package com.wd.health.aaa;

/**
 * @Description: java类作用描述
 * @Author: 王晨飞
 * @UpdateUser: 更新者：
 * @CreateDate: 2020/2/11 21:03
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wd.health.R;

public class MyFloatView extends ViewGroup {

    private int scrrenWid;//屏幕宽度
    public MyFloatView(Context context) {
        super(context);
    }

    public MyFloatView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }
    public MyFloatView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        scrrenWid = w;
    }

    int vSpace =30;
    int hSpace=40;
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        int left=hSpace;
        int top=vSpace;
        int right=0;
        int bottom=0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            //主动测量
            childAt.measure(0,0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            //摆放
            right=left+measuredWidth;
            //换行
            if (right>scrrenWid -12) {
                left=hSpace;
                right=left+measuredWidth;
                top=bottom+vSpace;
            }
            bottom=top+measuredHeight;
            childAt.layout(left,top,right,bottom);
            left=left+measuredWidth+hSpace;
        }

    }

    public void addTag(String tag){
        TextView textView = new TextView(getContext());
        textView.setText(tag);
        textView.setTextColor(Color.parseColor("#000000"));
        textView.setTextSize(25);
        textView.setBackgroundColor(Color.parseColor("#B0B3B8"));
        textView.setGravity(View.TEXT_ALIGNMENT_CENTER);
        textView.setPadding(10,10,10,10);
        textView.setBackgroundResource(R.drawable.ic_launcher_background);
        LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        addView(textView,params);
    }
}
