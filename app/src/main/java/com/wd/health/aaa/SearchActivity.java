package com.wd.health.aaa;

/**
 * @Description: java类作用描述
 * @Author: 王晨飞
 * @UpdateUser: 更新者：
 * @CreateDate: 2020/2/11 21:03
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wd.health.R;

public class SearchActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa);
        MySearchHand mySearchHand = findViewById(R.id.myView);
        final MyFloatView myFloatView = findViewById(R.id.text);
        mTextView = findViewById(R.id.t_view);
        mySearchHand.setOnBackCilckListener(new MySearchHand.OnBackCilckListener() {
            @Override
            public void onBackClick() {
                //返回键
                onBackPressed();
            }

            @Override
            public void onTextListener(String text) {
                mTextView.setText(text);
            }
        });

        myFloatView.addTag("阿胶");
        myFloatView.addTag("小可爱医生");
        myFloatView.addTag("感冒");
        myFloatView.addTag("头痛");
        myFloatView.addTag("神经病");
        myFloatView.addTag("发烧");
        myFloatView.addTag("癫痫");
        myFloatView.addTag("阿莫西林");
        myFloatView.addTag("脱发");
    }
}
