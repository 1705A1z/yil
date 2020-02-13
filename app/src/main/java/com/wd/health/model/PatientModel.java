package com.wd.health.model;

import com.wd.health.api.IApi;
import com.wd.health.bean.PatientBean;
import com.wd.health.contract.PatientContatct;
import com.wd.health.utils.CommonObserver;
import com.wd.health.utils.CommonSchedulers;
import com.wd.health.utils.RetrofitManager;

import io.reactivex.Observable;

public class PatientModel implements PatientContatct.IModel {
    @Override
    public void getPatient(int id, PatientCallBack patientCallBack) {
        IApi iApi = RetrofitManager.getInstance().create();
        Observable<PatientBean> patien = iApi.getPatien(id);
        patien.compose(CommonSchedulers.io2main())
                .subscribe(new CommonObserver<PatientBean>() {
                    @Override
                    public void onNext(PatientBean patientBean) {
                        patientCallBack.PatientSuccess(patientBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                      patientCallBack.PatientErorr(e.getMessage());
                    }
                });
    }
}
