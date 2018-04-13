package com.example.lx.guoyi_chengren.energy.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lx.guoyi_chengren.R;
import com.example.lx.guoyi_chengren.energy.bean.Titlte;

import java.util.List;
import java.util.Objects;

/**
 * Created by lx on 2018/4/12.
 */

public class EnerListAdapter extends BaseAdapter {

    private Context context;
    private List<Titlte> list;

    private ViewHolder holder;

    public EnerListAdapter(Context context, List<Titlte> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_enlist, null);
            holder = new ViewHolder();
            holder.title1=convertView.findViewById(R.id.title1);
            holder.title2=convertView.findViewById(R.id.title2);
            holder.imageview=convertView.findViewById(R.id.imageview);

            convertView.setTag(holder);

        }else {

            holder= (ViewHolder) convertView.getTag();
        }
        holder.title1.setText(list.get(position).getTitlte1());
        holder.title2.setText(list.get(position).getTitlte2());
        holder.imageview.setImageResource(list.get(position).getImageview());

        return convertView;
    }

    static class ViewHolder{
        TextView title1;
        TextView title2;
        ImageView imageview;
    }
}
