package com.example.painterpixel;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Button resetbtn, savebtn;
    int [] listKotak = new int[110] ;
    int [] textviewid = new int [] {R.id.textView0, R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5, R.id.textView6,
    R.id.textView7, R.id.textView8, R.id.textView9, R.id.textView10, R.id.textView11, R.id.textView12, R.id.textView13, R.id.textView14,
    R.id.textView15, R.id.textView16, R.id.textView17, R.id.textView18, R.id.textView19, R.id.textView20, R.id.textView21, R.id.textView22,
    R.id.textView23, R.id.textView24, R.id.textView25, R.id.textView26, R.id.textView27, R.id.textView27, R.id.textView28, R.id.textView29,
    R.id.textView30, R.id.textView31, R.id.textView32, R.id.textView33, R.id.textView34, R.id.textView35, R.id.textView36, R.id.textView37,
    R.id.textView38, R.id.textView39, R.id.textView40, R.id.textView41, R.id.textView42, R.id.textView43, R.id.textView44, R.id.textView45,
    R.id.textView46, R.id.textView47, R.id.textView48, R.id.textView49, R.id.textView50, R.id.textView51, R.id.textView52, R.id.textView53,
    R.id.textView54, R.id.textView55, R.id.textView56, R.id.textView57, R.id.textView58, R.id.textView59, R.id.textView60, R.id.textView61,
    R.id.textView62, R.id.textView63, R.id.textView64, R.id.textView65, R.id.textView66, R.id.textView67, R.id.textView68, R.id.textView69,
    R.id.textView70, R.id.textView71, R.id.textView72, R.id.textView73, R.id.textView74, R.id.textView75, R.id.textView76, R.id.textView77,
    R.id.textView78, R.id.textView79, R.id.textView80, R.id.textView81, R.id.textView82, R.id.textView83, R.id.textView84, R.id.textView85,
    R.id.textView86, R.id.textView87, R.id.textView88, R.id.textView89, R.id.textView90, R.id.textView91, R.id.textView92, R.id.textView93,
    R.id.textView94, R.id.textView95, R.id.textView86, R.id.textView97, R.id.textView98, R.id.textView99, R.id.textView100, R.id.textView101,
    R.id.textView102, R.id.textView103, R.id.textView104, R.id.textView105, R.id.textView106, R.id.textView107, R.id.textView108, R.id.textView109};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < listKotak.length; i++) {
            listKotak[i] = 0;

            int finalI = i;
            ((TextView) findViewById(textviewid[i])).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listKotak[finalI] == 0) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        ((GradientDrawable) gradientDrawable).setColor(Color.RED);
                        listKotak[finalI] = 1;
                    } else if (listKotak[finalI] == 1) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        ((GradientDrawable) gradientDrawable).setColor(Color.YELLOW);
                        listKotak[finalI] = 2;
                    } else if (listKotak[finalI] == 2) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        ((GradientDrawable) gradientDrawable).setColor(Color.GREEN);
                        listKotak[finalI] = 3;
                    } else if (listKotak[finalI] == 3) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        ((GradientDrawable) gradientDrawable).setColor(Color.BLUE);
                        listKotak[finalI] = 4;
                    } else if (listKotak[finalI] == 4) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        ((GradientDrawable) gradientDrawable).setColor(Color.CYAN);
                        listKotak[finalI] = 5;
                    } else if (listKotak[finalI] == 5) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        ((GradientDrawable) gradientDrawable).setColor(Color.MAGENTA);
                        listKotak[finalI] = 6;
                    } else if (listKotak[finalI] == 6) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        ((GradientDrawable) gradientDrawable).setColor(Color.GRAY);
                        listKotak[finalI] = 7;
                    } else if (listKotak[finalI] == 7) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        ((GradientDrawable) gradientDrawable).setColor(Color.BLACK);
                        listKotak[finalI] = 8;
                    } else if (listKotak[finalI] == 8) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        ((GradientDrawable) gradientDrawable).setColor(Color.WHITE);
                        listKotak[finalI] = 0;
                    }
                    Log.d("key", String.valueOf(listKotak[finalI]));
                }
            });
        }

        resetbtn = findViewById(R.id.resetBtn);
        savebtn = findViewById(R.id.saveBtn);

    }
}