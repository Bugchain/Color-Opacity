package com.bugchain.android.development.coloropacity;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main extends ActionBarActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setvalue);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekbar);
        img = (ImageView)findViewById(R.id.image);
        final TextView textValue = (TextView)findViewById(R.id.textValues);

        seekBar.setProgress(50);
        img.setBackgroundColor(Color.parseColor("#" + "7f" + "009688"));
        textValue.setText("#" + "7F" + "  " + "009688");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {



            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String hex = Integer.toHexString(progress * 255 / 100);


                if(hex.length()==1)
                    hex = "0" + hex;

                textValue.setText("#" + hex.toUpperCase() + "  " + "009688");
                img.setBackgroundColor(Color.parseColor("#" + hex + "009688"));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

//        GridView listView = (GridView)findViewById(R.id.listViewItem);
//        String[] colors = getResources().getStringArray(R.array.string_color);
//        String[] values = getResources().getStringArray(R.array.opacity_values);
//        String[] hex    = getResources().getStringArray(R.array.hex_values);
//        listView.setAdapter(new MyAdapter(this,values,colors,hex));

    }

}
