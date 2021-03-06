package com.wd.health.presenter;

import com.wd.health.base.BaseActivity;
import com.wd.health.base.BasePresenter;
import com.wd.health.bean.DrugsBean;
import com.wd.health.bean.DrugssBean;
import com.wd.health.contract.DrugsContract;
import com.wd.health.model.DrugsModel;

public class DrugsPresenter extends BasePresenter<DrugsContract.IView> implements DrugsContract.IPresenter {

    private DrugsModel model;

    @Override
    protected void initModel() {
        model = new DrugsModel();
    }

    @Override
    public void getDrugs() {
          model.getDrugs(new DrugsContract.IModel.DrugsCallBack() {
              @Override
              public void DrugsSuccess(DrugsBean drugsBean) {
                  getView().DrugsSuccess(drugsBean);
              }

              @Override
              public void DrugsErorr(String mag) {
                  getView().DrugsErorr(mag);
              }
          });
    }

    @Override
    public void getDrugss(int drugsCategoryId, int page, int count) {
        model.getDrugss(drugsCategoryId, page, count, new DrugsContract.IModel.DrugssCallBack() {
            @Override
            public void DrugssSuccess(DrugssBean drugssBean) {
                getView().DrugssSuccess(drugssBean);
            }

            @Override
            public void DrugssErorr(String mag) {
               getView().DrugssErorr(mag);
            }
        });
    }
}
