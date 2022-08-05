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
    int [] listKotak = new int[5] ;
    int [] textviewid = new int [] {R.id.textView0, R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4};

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
                        ((GradientDrawable) gradientDrawable).setColor(Color.BLUE);
                        listKotak[finalI] = 7;
                    } else if (listKotak[0] == 7) {
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