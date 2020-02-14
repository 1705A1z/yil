package com.wd.health.presenter;

import com.wd.health.base.BasePresenter;
import com.wd.health.bean.PatientBean;
import com.wd.health.contract.PatientContatct;
import com.wd.health.model.PatientModel;

public class PatientPresenter extends BasePresenter<PatientContatct.IView>implements PatientContatct.IPresenter {


    private PatientModel model;

    @Override
    protected void initModel() {
        model = new PatientModel();
    }

    @Override
    public void getPatient(int Id) {
       model.getPatient(Id, new PatientContatct.IModel.PatientCallBack() {
           @Override
           public void PatientSuccess(PatientBean patientBean) {
               getView().PatientSuccess(patientBean);
           }

           @Override
           public void PatientErorr(String mag) {
              getView().PatientErorr(mag);
           }
       });
    }
}
