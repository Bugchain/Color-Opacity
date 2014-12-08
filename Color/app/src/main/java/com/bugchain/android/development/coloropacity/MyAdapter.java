package com.bugchain.android.development.coloropacity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BUG CHAIN on 7/12/2557.
 */
public class MyAdapter extends BaseAdapter {

    private String[] color;
    private String[] value;
    private String[] hexValue;
    private Context context;

    public MyAdapter(Context context,String[] value,String[] color,String[] hexValue){
        this.context = context;
        this.color = color;
        this.value = value;
        this.hexValue = hexValue;
    }
    @Override
    public int getCount() {
        return value.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
            holder.image =  (ImageView)convertView.findViewById(R.id.image);
            holder.text =  (TextView)convertView.findViewById(R.id.textValues);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        holder.image.setBackgroundColor(Color.parseColor(color[position]));
        holder.text.setText(value[position]);


        return convertView;
    }

    class ViewHolder{
        ImageView image;
        TextView text;
    }
}
