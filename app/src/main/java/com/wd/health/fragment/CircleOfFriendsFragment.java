package com.wd.health.fragment;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wd.health.R;
import com.wd.health.aaa.MySearchHand;
import com.wd.health.adapter.Disease.DiseaseAdapter;
import com.wd.health.adapter.Disease.DiseaseCategoryAdapter;
import com.wd.health.base.BaseFragment;
import com.wd.health.contract.DiseaseCategoryContract;
import com.wd.health.bean.DepartmentBean;
import com.wd.health.bean.DiseaseCategoryBean;
import com.wd.health.presenter.DiseaseCategoryPresenter;

import java.util.List;

import butterknife.ButterKnife;
import io.reactivex.annotations.Nullable;

public class CircleOfFriendsFragment extends BaseFragment<DiseaseCategoryPresenter> implements DiseaseCategoryContract.IView {
    private static final String TAG = "CircleOfFriendsFragment";
    private RecyclerView rlv;
    private RecyclerView rlv2;
    private TextView textView;


    @Override
    protected int provideLayoutId() {
        return R.layout.circle_fragment;

    }

    @Override
    protected DiseaseCategoryPresenter providePresenter() {
        return new DiseaseCategoryPresenter();

    }

    @Override
    protected void initView() {
        super.initView();
         rlv = getView().findViewById(R.id.rlv);
         rlv2 = getView().findViewById(R.id.rlv2);
        textView = getView().findViewById(R.id.keshi);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        this.rlv.setLayoutManager(linearLayoutManager);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext());
        linearLayoutManager1.setOrientation(LinearLayoutManager.VERTICAL);
        this.rlv2.setLayoutManager(linearLayoutManager1);
    }

    @Override
    protected void initData() {
        super.initData();
        Intent intent = getActivity().getIntent();
        int id = intent.getIntExtra("Id",1 );
        Log.d(TAG, "initData: "+id);
        mPresenter.getDepart();

    }

    @Override
    public void DepartSuccess(DepartmentBean departmentBean) {

        List<DepartmentBean.ResultBean> result = departmentBean.getResult();
        DiseaseAdapter diseaseAdapter = new DiseaseAdapter(getContext(), result);
        rlv.setAdapter(diseaseAdapter);
        diseaseAdapter.setiCallBack(new DiseaseAdapter.ICallBack() {
            @Override
            public void getId(int id) {
                mPresenter.getDisease(id);
            }

            @Override
            public void getName(String name) {
                textView.setText(name);
            }
        });

    }

    @Override
    public void DepartErorr(String mag) {

    }

    @Override
    public void DiseaseSuccess(DiseaseCategoryBean diseaseCategoryBean) {
        List<DiseaseCategoryBean.ResultBean> result = diseaseCategoryBean.getResult();
        DiseaseCategoryAdapter diseaseCategoryAdapter = new DiseaseCategoryAdapter(getContext(), result);
        rlv2.setAdapter(diseaseCategoryAdapter);

    }

    @Override
    public void DiseaseErorr(String mag) {

    }

    public static class MySearchHand extends LinearLayout {
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
            ButterKnife.bind(this, inflate);
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

        com.wd.health.aaa.MySearchHand.OnBackCilckListener mOnBackCilckListener;

        public void setOnBackCilckListener(com.wd.health.aaa.MySearchHand.OnBackCilckListener onBackCilckListener) {
            mOnBackCilckListener = onBackCilckListener;
        }
    }
}
