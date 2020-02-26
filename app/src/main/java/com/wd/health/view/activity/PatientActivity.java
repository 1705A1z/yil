package com.wd.health.view.activity;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;



import com.wd.health.R;
import com.wd.health.adapter.PatientAdapter;
import com.wd.health.base.BaseActivity;
import com.wd.health.bean.PatientBean;
import com.wd.health.contract.PatientContatct;
import com.wd.health.presenter.PatientPresenter;

import java.util.List;

public class PatientActivity extends BaseActivity<PatientPresenter> implements PatientContatct.IView {

    private static final String TAG = "PatientActivity";
    private RecyclerView rlv;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void initData() {

        Intent intent = this.getIntent();
        int id = intent.getIntExtra("id1", 1);
        Log.d(TAG, "aaaa: " + id);
        mPresenter.getPatient(id);


    }

    @Override
    protected void initView() {
        rlv = (RecyclerView) findViewById(R.id.rlv_path);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_patient;

    }

    @Override
    protected PatientPresenter ProvidePresenter() {
        return new PatientPresenter();

    }

    @Override
    public void PatientSuccess(PatientBean patientBean) {
        Log.d(TAG, "PatientSuccess: "+patientBean.getResult().getBenefitTaboo());
        List<PatientBean.ResultBean> result = (List<PatientBean.ResultBean>) patientBean.getResult();
        PatientAdapter patientAdapter = new PatientAdapter(this, result);
        rlv.setLayoutManager(linearLayoutManager);
        rlv.setAdapter(patientAdapter);

    }

    @Override
    public void PatientErorr(String mag) {

    }
}
