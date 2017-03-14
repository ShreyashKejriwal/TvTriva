package com.example.dell.tvserieslovers;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.app.AppCompatActivity;


import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by DELL on 10-Jun-16.
 */
public class end extends AppCompatActivity {
    Button b1, b2;
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(end.this, MainActivity.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);
        TextView textView = (TextView) findViewById(R.id.score);
        Intent intent = getIntent();
        int temp = intent.getIntExtra("int_value", 0);
        try {
            textView.setText("Score  " + String.valueOf(temp));
        } catch (NullPointerException ae) {

        }
        b1 = (Button) findViewById(R.id.btn);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(end.this, MainActivity.class);
                        startActivity(intent);


                    }


                });
        b2 = (Button) findViewById(R.id.btn1);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(end.this, shuffle.class);
                        startActivity(intent);


                    }


                });
    }
}

