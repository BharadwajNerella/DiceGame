package com.bharadwaj.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static Button button,button2;
    public static TextView textView;
    public static ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btVar1);
        button2 = findViewById(R.id.btVar2);
        textView = findViewById(R.id.tvVar1);
        img1 = findViewById(R.id.ivVar1);
        img2 = findViewById(R.id.ivVar2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int num1 = random.nextInt(6);
                int num2 = random.nextInt(6);
                int dice[] = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                        R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};


                if (num1 < num2) {
                    textView.setText("WINNER : Player");
                } else if (num2 == num1) {
                    textView.setText("WINNER : Draw");
                } else {
                    textView.setText("WINNER : CPU");
                }
                img1.setImageResource(dice[num1]);
                img2.setImageResource(dice[num2]);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num1 = random.nextInt(6);
                int num2 = random.nextInt(6);

                setImageFunction(num1,num2);


            }
        });

    }

    public void setImageFunction(int num1, int num2) {

        final int dice[] = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        if (num1 > num2) {
            textView.setText("WINNER : Player");
        } else if (num2 == num1) {
            textView.setText("WINNER : Draw");
        } else {
            textView.setText("WINNER : CPU");
        }
        img1.setImageResource(dice[num1]);
        img2.setImageResource(dice[num2]);
    }
}