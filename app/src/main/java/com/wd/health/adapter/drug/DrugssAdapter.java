package com.wd.health.adapter.drug;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wd.health.R;
import com.wd.health.bean.DrugsBean;
import com.wd.health.bean.DrugssBean;

import java.util.ArrayList;
import java.util.List;

public class DrugssAdapter extends RecyclerView.Adapter<DrugssAdapter.MyAdapter> {

    Context context;
  List<DrugssBean.ResultBean>list=new ArrayList<>();

    public DrugssAdapter(Context context, List<DrugssBean.ResultBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.drugss, viewGroup, false);
        return new MyAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter myAdapter, int i) {
        DrugssBean.ResultBean resultBean = list.get(i);
        myAdapter.name.setText(resultBean.getName());
        myAdapter.pic.setImageURI(resultBean.getPicture());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyAdapter extends RecyclerView.ViewHolder {

        private final TextView name;
        private final SimpleDraweeView pic;

        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            pic = itemView.findViewById(R.id.iv_pic);
            name = itemView.findViewById(R.id.dr_name);
        }
    }
}
