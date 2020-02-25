package com.wd.health.model;


import com.wd.health.bean.DrugsBean;
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
}
