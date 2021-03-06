package com.wd.health.adapter.drug;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wd.health.R;
import com.wd.health.bean.DrugsBean;

import java.util.ArrayList;
import java.util.List;

public class DrugsAdapter extends RecyclerView.Adapter<DrugsAdapter.MyAdapter> {

    Context context;
    List<DrugsBean.ResultBean>list=new ArrayList<>();

    public DrugsAdapter(Context context, List<DrugsBean.ResultBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.drugs, viewGroup, false);
        return new MyAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter myAdapter, int i) {
        DrugsBean.ResultBean resultBean = list.get(i);
        myAdapter.name.setText(resultBean.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyAdapter extends RecyclerView.ViewHolder {

        private final TextView name;

        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.dr_name);
        }
    }
}
