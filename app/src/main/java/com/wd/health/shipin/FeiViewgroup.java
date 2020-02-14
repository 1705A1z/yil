package com.wd.health.shipin;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.wd.health.R;

public class FeiViewgroup extends ViewGroup {

    private int groupheight=0;
    private int groupwidht=0;
    private int anInt;

    public FeiViewgroup(Context context) {
        this(context,null);
    }

    public FeiViewgroup(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public FeiViewgroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.FeiViewgroup);
//        switch (anInt = (int) typedArray.getInt(R.styleable.FeiViewgroup_Arrangement, 0)) {
//        }
    }

    private void initView() {

    }

    //测量控件宽高的方法
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        switch (anInt){
            case 0:
                measure(widthMeasureSpec,heightMeasureSpec,0);
                break;
            case 1:
                measure(widthMeasureSpec,heightMeasureSpec,1);
                break;
            case 2:
                measure(widthMeasureSpec,heightMeasureSpec,2);
                break;
        }

        measureChildren(widthMeasureSpec,heightMeasureSpec);
        setMeasuredDimension(groupwidht,groupheight);
    }

    private void measure(int widthMeasureSpec, int heightMeasureSpec,int anInt){
        int modeheight= MeasureSpec.getMode(heightMeasureSpec);
        Log.e("modeheight",modeheight+"");
        int sizeheight = MeasureSpec.getSize(heightMeasureSpec);
        switch (modeheight){
            case MeasureSpec.AT_MOST:
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    int measuredHeight = childAt.getMeasuredHeight();
                    switch (anInt){
                        case 0:
                            groupheight+=measuredHeight;
                            break;
                        case 1:
                            groupheight=measuredHeight;
                            break;
                        case 2:
                            groupheight+=measuredHeight;
                            break;
                    }
                }
                break;
            case MeasureSpec.EXACTLY:
                groupheight=sizeheight;
                break;

        }
        int modewidth = MeasureSpec.getMode(widthMeasureSpec);
        Log.e("modewidth",modeheight+"");
        int sizewidth = MeasureSpec.getSize(widthMeasureSpec);
        switch (modewidth){
            case MeasureSpec.AT_MOST:
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    int measuredWidth = childAt.getMeasuredWidth();
                    switch (anInt){
                        case 0:
                            groupwidht=measuredWidth;
                            break;
                        case 1:
                            groupwidht+=measuredWidth;
                            break;
                        case 2:
                            groupwidht+=measuredWidth;
                            break;
                    }
                }
                break;
            case MeasureSpec.EXACTLY:
                groupwidht=sizewidth;
                break;

        }
    }

   //摆放控件的方法
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int hieght=0;
        int width=0;
        switch (anInt){
            case 0:
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    childAt.layout(0,hieght,measuredWidth,hieght+measuredHeight);
                    hieght+=measuredHeight;
                }
                break;
            case 1:
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    childAt.layout(width,0,width+measuredWidth,measuredHeight);
                    width+=measuredWidth;
                }
                break;
            case 2:
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    childAt.layout(width,hieght,width+measuredWidth,hieght+measuredHeight);
                    width+=measuredWidth;
                    hieght+=measuredHeight;
                }
                break;
        }


    }
    //绘制控件的方法
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
