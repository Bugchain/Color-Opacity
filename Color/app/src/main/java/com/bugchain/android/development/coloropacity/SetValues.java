package com.bugchain.android.development.coloropacity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by BUG CHAIN on 8/12/2557.
 */
public class SetValues extends Fragment {

    ImageView img;
    TextView textValue,textProress;

    public static SetValues newInstance(){
        SetValues fragment = new SetValues();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.setvalue,container,false);

        SeekBar seekBar = (SeekBar)rootView.findViewById(R.id.seekbar);
        img = (ImageView)rootView.findViewById(R.id.image);
        textValue = (TextView)rootView.findViewById(R.id.textValues);
        textProress = (TextView)rootView.findViewById(R.id.textProgress);
        textProress.setText("50 %");

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
                textProress.setText(String.valueOf(progress) + " %");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        return rootView;
    }
}
