package com.wd.health.contract;

import com.wd.health.base.IBaseView;
import com.wd.health.bean.DrugsBean;
import com.wd.health.bean.DrugssBean;

public interface DrugsContract {
    interface IView extends IBaseView {

        //药品科目分类列表查询
        void DrugsSuccess(DrugsBean drugsBean);
        void DrugsErorr(String mag);

        //根据药品类目查询常见药品
        void DrugssSuccess(DrugssBean drugssBean);
        void DrugssErorr(String mag);
    }
    interface IModel{

        //药品科目分类列表查询
        void getDrugs(DrugsCallBack drugsCallBack);
        //根据药品类目查询常见药品
        void getDrugss( int drugsCategoryId,int page,int count,DrugssCallBack drugssCallBack);
        interface DrugsCallBack{
            void DrugsSuccess(DrugsBean drugsBean);
            void DrugsErorr(String mag);
        }

        interface DrugssCallBack{
            void DrugssSuccess(DrugssBean drugssBean);
            void DrugssErorr(String mag);
        }
    }
    interface IPresenter{
        //药品科目分类列表查询
        void getDrugs();
        void getDrugss(int drugsCategoryId,int page,int count);
    }
}
