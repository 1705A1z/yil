package com.wd.health.view.activity;

import android.widget.TextView;

import com.wd.health.R;
import com.wd.health.base.BaseFragment;
import com.wd.health.bean.BannerBean;
import com.wd.health.bean.ConsultingListBean;
import com.wd.health.bean.DeseaseBeanyou;
import com.wd.health.bean.DeseaseBeanzuo;
import com.wd.health.bean.DrugBean;
import com.wd.health.bean.DrugsyouBean;
import com.wd.health.bean.DrugszuoBean;
import com.wd.health.bean.HealthBean;
import com.wd.health.bean.KeListBean;
import com.wd.health.bean.SymptomBean;
import com.wd.health.contract.BannerContract;
import com.wd.health.contract.HomeContract;
import com.wd.health.model.bean.DeseaseBeanyou;
import com.wd.health.model.bean.DeseaseBeanzuo;
import com.wd.health.model.bean.DeseaseXiangBean;
import com.wd.health.model.bean.DrugsXiangBean;
import com.wd.health.model.bean.DrugsanBean;
import com.wd.health.model.bean.DrugsyouBean;
import com.wd.health.model.bean.DrugszuoBean;
import com.wd.health.model.bean.HotsouBean;
import com.wd.health.model.bean.JiantabBean;
import com.wd.health.model.bean.LoginBean;
import com.wd.health.model.bean.SouBean;
import com.wd.health.model.bean.WenZhenBean;
import com.wd.health.model.bean.XbanBean;
import com.wd.health.model.bean.ZiXunXiangBean;
import com.wd.health.model.bean.ZixunBean;
import com.wd.health.presenter.BannerPresenter;
import com.wd.health.presenter.HomePresenter;

import butterknife.BindView;

public class DeseaseAvtivity  extends BaseFragment< BannerPresenter> implements BannerContract.IView {


    @BindView(R.id.text_desease_name)
    TextView textDeseaseName;
    @BindView(R.id.text_desease_bing)
    TextView textDeseaseBing;
    @BindView(R.id.text_desease_zheng)
    TextView textDeseaseZheng;
    @BindView(R.id.text_desease_yi)
    TextView textDeseaseYi;
    @BindView(R.id.text_desease_xi)
    TextView textDeseaseXi;
    @BindView(R.id.text_desease_zhong)
    TextView textDeseaseZhong;
    private String id;

    @Override
    protected BannerPresenter providePresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initData() {
        super.initData();
        id = getIntent().getStringExtra("id");
        mPresenter.onDeseaseXiang(id);
    }

    @Override
    protected void initView() {
        super.initView();
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_desease_avtivity;
    }

    /*
     * 症状symptom
     * 病理benefitTaboo
     * 宜pathology
     * 中chineseMedicineTreatment
     *
     * */
    String benefitTaboo = data.getResult().getBenefitTaboo();
        textDeseaseYi.setText(benefitTaboo);

    String symptom = data.getResult().getSymptom();
        textDeseaseZheng.setText(symptom);

    String pathology = data.getResult().getPathology();
        textDeseaseBing.setText(pathology);

    String chineseMedicineTreatment = data.getResult().getChineseMedicineTreatment();
        textDeseaseZhong.setText(chineseMedicineTreatment);
}




    @Override
    public void BannerSuccess(BannerBean bannerBean) {

    }

    @Override
    public void SymptomSuccess(SymptomBean symptomBean) {

    }

    @Override
    public void DrugSeccess(DrugBean drugBean) {

    }

    @Override
    public void KeLianSeccess(KeListBean listBean) {

    }

    @Override
    public void HealthSeccess(HealthBean healthBean) {

    }

    @Override
    public void CondultingSeccess(ConsultingListBean consultingListBean) {

    }

    @Override
    public void onDrugzuoSuccess(DrugszuoBean data) {

    }

    @Override
    public void onDrugsyouSuccess(DrugsyouBean data) {

    }

    @Override
    public void onDeseasezuoSuccess(DeseaseBeanzuo data) {

    }

    @Override
    public void onDeseaseyouSuccess(DeseaseBeanyou data) {

    }

    @Override
    public void BannerFailure(String mag) {

    }
}
