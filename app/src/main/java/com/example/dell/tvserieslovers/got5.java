package com.example.dell.tvserieslovers;

import android.os.CountDownTimer;
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

public class got5 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    CountDownTimer ct,c1;
    int c;
    int i=0;
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(got5.this, MainActivity.class));
        finish();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        c = intent.getIntExtra("int_value", 0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.got5);
        b1 = (Button) findViewById(R.id.noa);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (i == 0) {
                            c++;
                            i++;
                            b1.setBackgroundColor(Color.GREEN);
                            if (ct != null) {
                                ct.cancel();
                                ct = null;
                            }
                            c1 = new CountDownTimer(2000, 1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    TextView tv_result = (TextView) findViewById(R.id.tv_countdown);
                                    tv_result.setText("Right Answer");
                                }

                                @Override
                                public void onFinish() {
                                    Intent intent = new Intent(got5.this, shuffle2.class);
                                    intent.putExtra("int_value",c);
                                    startActivity(intent);
                                }
                            };
                            c1.start();
                        }

                    }
                });
        b2=(Button) findViewById(R.id.mc);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (i == 0) {
                            c--;
                            i++;
                            b2.setBackgroundColor(Color.RED);
                            if (ct != null) {
                                ct.cancel();
                                ct = null;
                            }
                            c1 = new CountDownTimer(2000, 1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    TextView tv_result = (TextView) findViewById(R.id.tv_countdown);
                                    tv_result.setText("Wrong Answer");
                                }

                                @Override
                                public void onFinish() {
                                    Intent intent = new Intent(got5.this,shuffle2.class);
                                    intent.putExtra("int_value", c);
                                    startActivity(intent);
                                }
                            };
                            c1.start();

                        }
                    }
                });
        b3=(Button) findViewById(R.id.cl);

        b3.setOnClickListener(
                new View.OnClickListener()

                {

                    @Override
                    public void onClick(View v) {
                        if (i == 0) {
                            c--;
                            i++;
                            TextView tv_result = (TextView) findViewById(R.id.tv_countdown);
                            tv_result.setText("Wrong Answer");
                            b3.setBackgroundColor(Color.RED);
                            if (ct != null) {
                                ct.cancel();
                                ct = null;
                            }
                            c1 = new CountDownTimer(2000, 1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    TextView tv_result = (TextView) findViewById(R.id.tv_countdown);
                                    tv_result.setText("Wrong Answer");
                                }

                                @Override
                                public void onFinish() {
                                    Intent intent = new Intent(got5.this,shuffle2.class);
                                    intent.putExtra("int_value", c);
                                    startActivity(intent);
                                }
                            };
                            c1.start();
                        }
                    }

                });
        b4=(Button) findViewById(R.id.st);

        b4.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {
                        if (i == 0) {
                            c--;
                            i++;
                            TextView tv_result = (TextView) findViewById(R.id.tv_countdown);
                            tv_result.setText("Wrong Answer");
                            b4.setBackgroundColor(Color.RED);
                            if (ct != null) {
                                ct.cancel();
                                ct = null;
                            }
                            c1 = new CountDownTimer(2000, 1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    TextView tv_result = (TextView) findViewById(R.id.tv_countdown);
                                    tv_result.setText("Wrong Answer");
                                }

                                @Override
                                public void onFinish() {
                                    Intent intent = new Intent(got5.this,shuffle2.class);
                                    intent.putExtra("int_value", c);
                                    startActivity(intent);
                                }
                            };
                            c1.start();
                        }
                    }

                });
        ct=new CountDownTimer(10000,1000) {
            @Override
            public void onTick ( long millisUntilFinished){
                TextView tv_result = (TextView) findViewById(R.id.tv_countdown);
                tv_result.setText("Time Left:" + String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish () {
                Intent intent = new Intent(got5.this,end.class);
                intent.putExtra("int_value", c);
                startActivity(intent);
                TextView tv_result = (TextView) findViewById(R.id.tv_countdown);
                tv_result.setText("Times Up");
            }
        };
        ct.start();
    }
}