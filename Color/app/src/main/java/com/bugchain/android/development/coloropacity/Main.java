package com.bugchain.android.development.coloropacity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView listView = (ListView)findViewById(R.id.listViewItem);
        String[] colors = getResources().getStringArray(R.array.string_color);
        String[] values = getResources().getStringArray(R.array.opacity_values);

        listView.setAdapter(new MyAdapter(this,values,colors));

    }

}
