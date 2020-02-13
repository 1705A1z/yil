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
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wd.health.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.Nullable;

public class MySearchHand extends LinearLayout {
//    @BindView(R2.id.srarch_back)
    ImageView imgview;
//    @BindView(R2.id.search_edtext)
    EditText tv_shou;
//    @BindView(R2.id.search_sosuo)
    ImageView rlv2;

    /**
     * 自定义搜索框
     */
    public MySearchHand(Context context) {
        this(context, null);
    }

    public MySearchHand(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public MySearchHand(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    /**
     * 自定义搜索框
     * 加载布局
     * 按钮
     * 获取输入的值 接口回调
     */
    private void init(Context context) {
//        View inflate = LayoutInflater.from(context).inflate(R.layout.search_item, this, true);
        View inflate = LayoutInflater.from(context).inflate(R.layout.circle_fragment, this, true);
        ButterKnife.bind(this,inflate);
       /* ImageView srarch_back = inflate.findViewById(R.id.srarch_back);
        ImageView srarch_Iv = inflate.findViewById(R.id.search_sosuo);
        final EditText srarch_edText = inflate.findViewById(R.id.search_edtext);*/
        /** back
         *  sosuo
         * */
        imgview.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnBackCilckListener.onBackClick();
            }
        });
        rlv2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //输入内容
                String srarch = tv_shou.getText().toString().trim();
                mOnBackCilckListener.onTextListener(srarch);
            }
        });
    }

    /**
     * 接口回调事件
     */
    public interface OnBackCilckListener {
        void onBackClick();

        void onTextListener(String text);
    }

    OnBackCilckListener mOnBackCilckListener;

    public void setOnBackCilckListener(OnBackCilckListener onBackCilckListener) {
        mOnBackCilckListener = onBackCilckListener;
    }
}

