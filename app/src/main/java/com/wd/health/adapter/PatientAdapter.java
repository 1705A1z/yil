package com.wd.health.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wd.health.R;
import com.wd.health.bean.PatientBean;

import java.util.ArrayList;
import java.util.List;

public class PatientAdapter extends RecyclerView.Adapter<PatientAdapter.MyAdapter> {
    Context context;
    List<PatientBean.ResultBean>list=new ArrayList<>();
    private View view;

    public PatientAdapter(Context context, List<PatientBean.ResultBean> list) {
        this.context = context;
        this.list .addAll(list);
    }

    @NonNull
    @Override
    public MyAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view = LayoutInflater.from(context).inflate(R.layout.patient, viewGroup, false);
        return new MyAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter myAdapter, int i) {
        PatientBean.ResultBean resultBean = list.get(i);
        myAdapter.bene.setText(resultBean.getBenefitTaboo());
        myAdapter.cmt.setText(resultBean.getChineseMedicineTreatment());
        myAdapter.path.setText(resultBean.getPathology());
        myAdapter.sym.setText(resultBean.getSymptom());
        myAdapter.wmt.setText(resultBean.getWesternMedicineTreatment());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyAdapter extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView path;
        private final TextView sym;
        private final TextView bene;
        private final TextView wmt;
        private final TextView cmt;

        public MyAdapter(@NonNull View itemView) {
             super(itemView);
            name = itemView.findViewById(R.id.pa_name);
            path = itemView.findViewById(R.id.pathology);
            sym = itemView.findViewById(R.id.symptom);
            bene = itemView.findViewById(R.id.benefitTaboo);
            wmt = itemView.findViewById(R.id.wmt);
            cmt = itemView.findViewById(R.id.cmt);
        }
     }

}
