package com.example.dell.tvserieslovers;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import java.lang.Runnable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Handler;
public class MainActivity extends AppCompatActivity  {
    Button game,arrow;
   static int k =0;
    int i = 1;
    int y=0;
    public static int c;
    Handler handler = new Handler();
    int[] img = new int[9];
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=0;
        iv = (ImageView) findViewById(R.id.g);
        img[0] = R.drawable.game;
        img[1] = R.drawable.arrow;
        img[2]= R.drawable.images;
        img[3]= R.drawable.sherlock;
        img[4]= R.drawable.flash;
        img[5]=R.drawable.house;
        img[6]=R.drawable.suits1_e;
        img[7]=R.drawable.gotham;
        img[8]=R.drawable.quantico;

        handler.postDelayed(r,3000);
        got();
        arrow();
    }
    Runnable r = new Runnable(){
        public void run(){
            iv.setImageResource(img[y]);
            y++;
            if(y >= img.length){
                y = 0;
            }
            handler.postDelayed(this, 3000); //set to go off again in 3 seconds.
        }
    };


    public void got() {
        game = (Button) findViewById(R.id.got);
        game.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(MainActivity.this, shuffle.class);
                        intent.putExtra("int_value", c);
                        startActivity(intent);
                    }
                }
        );
    }
    public void arrow(){
      arrow = (Button) findViewById(R.id.arrow);
        arrow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(MainActivity.this, shuffle.class);
                        intent.putExtra("int_value", c);
                        startActivity(intent);
                    }
                }
        );
    }


}

