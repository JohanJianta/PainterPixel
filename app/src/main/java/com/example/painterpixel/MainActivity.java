package com.example.painterpixel;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.BLUE;
import static android.graphics.Color.CYAN;
import static android.graphics.Color.GRAY;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.MAGENTA;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;
import static android.graphics.Color.YELLOW;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button resetbtn, savebtn;
    int[] listKotak = new int[352];
    int[] textviewid = new int[]{R.id.textView0, R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5, R.id.textView6,
            R.id.textView7, R.id.textView8, R.id.textView9, R.id.textView10, R.id.textView11, R.id.textView12, R.id.textView13, R.id.textView14,
            R.id.textView15, R.id.textView16, R.id.textView17, R.id.textView18, R.id.textView19, R.id.textView20, R.id.textView21, R.id.textView22,
            R.id.textView23, R.id.textView24, R.id.textView25, R.id.textView26, R.id.textView27, R.id.textView28, R.id.textView29, R.id.textView30,
            R.id.textView31, R.id.textView32, R.id.textView33, R.id.textView34, R.id.textView35, R.id.textView36, R.id.textView37, R.id.textView38,
            R.id.textView39, R.id.textView40, R.id.textView41, R.id.textView42, R.id.textView43, R.id.textView44, R.id.textView45, R.id.textView46,
            R.id.textView47, R.id.textView48, R.id.textView49, R.id.textView50, R.id.textView51, R.id.textView52, R.id.textView53, R.id.textView54,
            R.id.textView55, R.id.textView56, R.id.textView57, R.id.textView58, R.id.textView59, R.id.textView60, R.id.textView61, R.id.textView62,
            R.id.textView63, R.id.textView64, R.id.textView65, R.id.textView66, R.id.textView67, R.id.textView68, R.id.textView69, R.id.textView70,
            R.id.textView71, R.id.textView72, R.id.textView73, R.id.textView74, R.id.textView75, R.id.textView76, R.id.textView77, R.id.textView78,
            R.id.textView79, R.id.textView80, R.id.textView81, R.id.textView82, R.id.textView83, R.id.textView84, R.id.textView85, R.id.textView86,
            R.id.textView87, R.id.textView88, R.id.textView89, R.id.textView90, R.id.textView91, R.id.textView92, R.id.textView93, R.id.textView94,
            R.id.textView95, R.id.textView96, R.id.textView97, R.id.textView98, R.id.textView99, R.id.textView100, R.id.textView101, R.id.textView102,
            R.id.textView103, R.id.textView104, R.id.textView105, R.id.textView106, R.id.textView107, R.id.textView108, R.id.textView109, R.id.textView110,
            R.id.textView111, R.id.textView112, R.id.textView113, R.id.textView114, R.id.textView115, R.id.textView116, R.id.textView117, R.id.textView118,
            R.id.textView119, R.id.textView120, R.id.textView121, R.id.textView122, R.id.textView123, R.id.textView124, R.id.textView125, R.id.textView126,
            R.id.textView127, R.id.textView128, R.id.textView129, R.id.textView130, R.id.textView131, R.id.textView132, R.id.textView133, R.id.textView134,
            R.id.textView135, R.id.textView136, R.id.textView137, R.id.textView138, R.id.textView139, R.id.textView140, R.id.textView141, R.id.textView142,
            R.id.textView143, R.id.textView144, R.id.textView145, R.id.textView146, R.id.textView147, R.id.textView148, R.id.textView149, R.id.textView150,
            R.id.textView151, R.id.textView152, R.id.textView153, R.id.textView154, R.id.textView155, R.id.textView156, R.id.textView157, R.id.textView158,
            R.id.textView159, R.id.textView160, R.id.textView161, R.id.textView162, R.id.textView163, R.id.textView164, R.id.textView165, R.id.textView166,
            R.id.textView167, R.id.textView168, R.id.textView169, R.id.textView170, R.id.textView171, R.id.textView172, R.id.textView173, R.id.textView174,
            R.id.textView175, R.id.textView176, R.id.textView177, R.id.textView178, R.id.textView179, R.id.textView180, R.id.textView181, R.id.textView182,
            R.id.textView183, R.id.textView184, R.id.textView185, R.id.textView186, R.id.textView187, R.id.textView188, R.id.textView189, R.id.textView190,
            R.id.textView191, R.id.textView192, R.id.textView193, R.id.textView194, R.id.textView195, R.id.textView196, R.id.textView197, R.id.textView198,
            R.id.textView199, R.id.textView200, R.id.textView201, R.id.textView202, R.id.textView203, R.id.textView204, R.id.textView205, R.id.textView206,
            R.id.textView207, R.id.textView208, R.id.textView209, R.id.textView210, R.id.textView211, R.id.textView212, R.id.textView213, R.id.textView214,
            R.id.textView215, R.id.textView216, R.id.textView217, R.id.textView218, R.id.textView219, R.id.textView220, R.id.textView221, R.id.textView222,
            R.id.textView223, R.id.textView224, R.id.textView225, R.id.textView226, R.id.textView227, R.id.textView228, R.id.textView229, R.id.textView230,
            R.id.textView231, R.id.textView232, R.id.textView233, R.id.textView234, R.id.textView235, R.id.textView236, R.id.textView237, R.id.textView238,
            R.id.textView239, R.id.textView240, R.id.textView241, R.id.textView242, R.id.textView243, R.id.textView244, R.id.textView245, R.id.textView246,
            R.id.textView247, R.id.textView248, R.id.textView249, R.id.textView250, R.id.textView251, R.id.textView252, R.id.textView253, R.id.textView254,
            R.id.textView255, R.id.textView256, R.id.textView257, R.id.textView258, R.id.textView259, R.id.textView260, R.id.textView261, R.id.textView262,
            R.id.textView263, R.id.textView264, R.id.textView265, R.id.textView266, R.id.textView267, R.id.textView268, R.id.textView269, R.id.textView270,
            R.id.textView271, R.id.textView272, R.id.textView273, R.id.textView274, R.id.textView275, R.id.textView276, R.id.textView277, R.id.textView278,
            R.id.textView279, R.id.textView280, R.id.textView281, R.id.textView282, R.id.textView283, R.id.textView284, R.id.textView285, R.id.textView286,
            R.id.textView287, R.id.textView288, R.id.textView289, R.id.textView290, R.id.textView291, R.id.textView292, R.id.textView293, R.id.textView294,
            R.id.textView295, R.id.textView296, R.id.textView297, R.id.textView298, R.id.textView299, R.id.textView300, R.id.textView301, R.id.textView302,
            R.id.textView303, R.id.textView304, R.id.textView305, R.id.textView306, R.id.textView307, R.id.textView308, R.id.textView309, R.id.textView310,
            R.id.textView311, R.id.textView312, R.id.textView313, R.id.textView314, R.id.textView315, R.id.textView316, R.id.textView317, R.id.textView318,
            R.id.textView319, R.id.textView320, R.id.textView321, R.id.textView322, R.id.textView323, R.id.textView324, R.id.textView325, R.id.textView326,
            R.id.textView327, R.id.textView328, R.id.textView329, R.id.textView330, R.id.textView331, R.id.textView332, R.id.textView333, R.id.textView334,
            R.id.textView335, R.id.textView336, R.id.textView337, R.id.textView338, R.id.textView339, R.id.textView340, R.id.textView341, R.id.textView342,
            R.id.textView343, R.id.textView344, R.id.textView345, R.id.textView346, R.id.textView347, R.id.textView348, R.id.textView349, R.id.textView350,
            R.id.textView351};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < listKotak.length; i++) {
            int finalI = i;
            ((TextView) findViewById(textviewid[i])).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listKotak[finalI] == 0) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        gradientDrawable.setColor(RED);
                        listKotak[finalI] = 1;
                    } else if (listKotak[finalI] == 1) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        gradientDrawable.setColor(YELLOW);
                        listKotak[finalI] = 2;
                    } else if (listKotak[finalI] == 2) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        gradientDrawable.setColor(GREEN);
                        listKotak[finalI] = 3;
                    } else if (listKotak[finalI] == 3) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        gradientDrawable.setColor(BLUE);
                        listKotak[finalI] = 4;
                    } else if (listKotak[finalI] == 4) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        gradientDrawable.setColor(CYAN);
                        listKotak[finalI] = 5;
                    } else if (listKotak[finalI] == 5) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        gradientDrawable.setColor(MAGENTA);
                        listKotak[finalI] = 6;
                    } else if (listKotak[finalI] == 6) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        gradientDrawable.setColor(GRAY);
                        listKotak[finalI] = 7;
                    } else if (listKotak[finalI] == 7) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        gradientDrawable.setColor(BLACK);
                        listKotak[finalI] = 8;
                    } else if (listKotak[finalI] == 8) {
                        GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[finalI])).getBackground()).mutate();
                        gradientDrawable.setColor(WHITE);
                        listKotak[finalI] = 0;
                    }
                    Log.d("key", String.valueOf(listKotak[finalI]));
                }
            });
        }

        resetbtn = findViewById(R.id.resetBtn);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < listKotak.length; i++) {
                    GradientDrawable gradientDrawable = (GradientDrawable) ((GradientDrawable) ((TextView) findViewById(textviewid[i])).getBackground()).mutate();
                    gradientDrawable.setColor(WHITE);
                    listKotak[i] = 0;
                }
            }
        });

        savebtn = findViewById(R.id.saveBtn);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,SaveActivity.class);
                    intent.putExtra("color", listKotak);
                    startActivity(intent);
            }
        });
    }
}