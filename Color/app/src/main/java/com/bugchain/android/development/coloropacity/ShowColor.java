package com.bugchain.android.development.coloropacity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by BUG CHAIN on 8/12/2557.
 */
public class ShowColor extends Fragment{

    public static ShowColor newInstance(){
        ShowColor fragment = new ShowColor();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView  = inflater.inflate(R.layout.layout_color,container,false);

        GridView listView = (GridView)rootView.findViewById(R.id.listViewItem);
        String[] colors = getResources().getStringArray(R.array.string_color);
        String[] values = getResources().getStringArray(R.array.opacity_values);
        String[] hex    = getResources().getStringArray(R.array.hex_values);
        listView.setAdapter(new MyAdapter(container.getContext(),values,colors,hex));

        return rootView;
    }
}
