package com.pt2.zegar;


import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button button1, button2;
    Gracz gracz1, gracz2;
    private int ileSekund;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        gracz1 = new Gracz(button1, true);
        gracz2 = new Gracz(button2, false);

        //start.setOnClickListener(
        //        new View.OnClickListener() {
        //            @Override
        //            public void onClick(View view) {
        //                czyAktywny = true;
        //            }
        //        }
        //);
        //stop.setOnClickListener(
        //        new View.OnClickListener() {
        //            @Override
        //            public void onClick(View view) {
        //               czyAktywny = false;
        //            }
        //        }
        //);
        //reset.setOnClickListener(
        //        new View.OnClickListener() {
        //            @Override
        //            public void onClick(View view) {
        //                czyAktywny = false;
        //              ileSekund = 0;
        //                zegar.setText("00:00:00");
        //            }
        //        }
        //);
    }
    private String zwrocLadnyCzas(int ileSekund){
        int sekundy = ileSekund % 60;
        int minuty = (ileSekund / 60) % 60;
        int godziny = ileSekund / 3600;
        return String.format("%02d:%02d:%02d", godziny, minuty, sekundy);
    }
}