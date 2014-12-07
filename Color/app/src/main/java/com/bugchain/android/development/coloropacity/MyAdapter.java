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
    private Context context;

    public MyAdapter(Context context,String[] value,String[] color){
        this.context = context;
        this.color = color;
        this.value = value;
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

        convertView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        ImageView img = (ImageView)convertView.findViewById(R.id.image);
        TextView textValue = (TextView)convertView.findViewById(R.id.textValues);

        img.setBackgroundColor(Color.parseColor(color[position]));
        textValue.setText(value[position]);

        return convertView;
    }
}
