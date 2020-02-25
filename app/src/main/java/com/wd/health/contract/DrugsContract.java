package com.wd.health.contract;

import com.wd.health.base.IBaseView;
import com.wd.health.bean.DrugsBean;

public interface DrugsContract {
    interface IView extends IBaseView {

        //药
        void DrugsSuccess(DrugsBean drugsBean);
        void DrugsErorr(String mag);

    }
    interface IModel{

        void getDrugs(DrugsCallBack drugsCallBack);

        interface DrugsCallBack{
            void DrugsSuccess(DrugsBean drugsBean);
            void DrugsErorr(String mag);
        }

    }
    interface IPresenter{
        void getDrugs();
    }
}
