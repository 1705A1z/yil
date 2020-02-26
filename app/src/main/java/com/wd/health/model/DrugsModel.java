package com.wd.health.model;


import com.wd.health.bean.DrugsBean;
import com.wd.health.bean.DrugssBean;
import com.wd.health.contract.DrugsContract;
import com.wd.health.utils.CommonObserver;
import com.wd.health.utils.CommonSchedulers;
import com.wd.health.utils.RetrofitManager;

public class DrugsModel implements DrugsContract.IModel {
    @Override
    public void getDrugs(DrugsCallBack drugsCallBack) {
        RetrofitManager.getInstance().create()
                .getDrugs().compose(CommonSchedulers.io2main())
                .subscribe(new CommonObserver<DrugsBean>() {
                    @Override
                    public void onNext(DrugsBean drugsBean) {
                         drugsCallBack.DrugsSuccess(drugsBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        drugsCallBack.DrugsErorr(e.getMessage());
                    }
                });
    }

    @Override
    public void getDrugss(int drugsCategoryId, int page, int count, DrugssCallBack drugssCallBack) {
        RetrofitManager.getInstance().create()
                .getDrugss(drugsCategoryId,page,count)
                .compose(CommonSchedulers.io2main())
                .subscribe(new CommonObserver<DrugssBean>() {
                    @Override
                    public void onNext(DrugssBean drugssBean) {
                        drugssCallBack.DrugssSuccess(drugssBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        drugssCallBack.DrugssErorr(e.getMessage());
                    }
                });
    }


}
