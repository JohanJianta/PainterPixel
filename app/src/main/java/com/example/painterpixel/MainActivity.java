package com.example.painterpixel;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Button resetbtn, savebtn;
    int [] listKotak = new int[176] ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetbtn = findViewById(R.id.resetBtn);
        savebtn = findViewById(R.id.saveBtn);

        TextView tv0 = findViewById(R.id.textView0);

        for (int i = 0; i < listKotak.length; i++){
            listKotak[i] = 0;
        }

        tv0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (listKotak[0]== 0){
                    tv0.setBackgroundColor(Color.RED);
                    listKotak[0]= 1;
                }
                else if (listKotak[0]== 1){
                    tv0.setBackgroundColor(Color.BLUE);
                    listKotak[0]= 7;
                }
                else if (listKotak[0]== 7){
                    tv0.setBackgroundColor(Color.TRANSPARENT);
                    listKotak[0]= 0;
                }
                Log.d("key", String.valueOf(listKotak[0]));

            }
        });

        TextView tv1 = findViewById(R.id.textView1);



        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (listKotak[1]== 0){
                    tv0.setBackgroundColor(Color.RED);
                    listKotak[1]= 1;
                }
                else if (listKotak[1]== 1){
                    tv0.setBackgroundColor(Color.BLUE);
                    listKotak[1]= 7;
                }
                else if (listKotak[1]== 7){
                    tv0.setBackgroundColor(Color.TRANSPARENT);
                    listKotak[1]= 0;
                }
                Log.d("key", String.valueOf(listKotak[0]));

            }
        });


        TextView tv2 = findViewById(R.id.textView2);
//        tv2.setOnClickListener(this);


        TextView tv3 = findViewById(R.id.textView3);




    }
}