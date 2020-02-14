package com.wd.health.contract;

import com.wd.health.base.IBaseView;
import com.wd.health.bean.PatientBean;

/**
 *@describe(描述)：内科药物详情
 *@data（日期）: 2020/2/12
 *@time（时间）: 10:26
 *@author（作者）: Jiaochengxiang
 **/
public interface PatientContatct {
    interface IView extends IBaseView{
        void PatientSuccess(PatientBean patientBean);
        void PatientErorr(String mag);
    }
    interface IModel{
        void getPatient(int Id,PatientCallBack patientCallBack);

        interface PatientCallBack{
            void PatientSuccess(PatientBean patientBean);
            void PatientErorr(String mag);
        }
    }
    interface IPresenter{
        void getPatient(int Id);
    }
}
