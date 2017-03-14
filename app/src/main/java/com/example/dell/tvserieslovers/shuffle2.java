package com.example.dell.tvserieslovers;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by DELL on 22-Jun-16.
 */
public class shuffle2 extends AppCompatActivity {
    Class activityToShow;
    int c;
    Button b1;
    String[] fun = new String[30];
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(shuffle2.this, MainActivity.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shuffle2);
        Intent intent = getIntent();
        c = intent.getIntExtra("int_value", 0);
        fun[0] = "a";
        fun[1] = "GoT characters have been quite popular throughout the world which resulted in many people naming their kids “Khaleesi”, “Tyrion”, “Arya”, “Theon”";
        fun[2] = "In 2015, GoT set the record of winning most Emmys in a single year with 12 wins out of 24 nominations.";
        fun[3] = "The Red Wedding actually happened. Author George R.R. Martin has said that the inspiration for the betrayal is based on two dark events in Scottish history: the Black Dinner of 1440 and the Massacre of Glencoe from 1692.";
        fun[4] = "HBO spends nearly $60m on each season of GoT. That equals $6m per episode. Although, ‘Friends’ beats GoT here with an approximate cost of $10m per episode, making it the costliest TV show to be aired ever.";
        fun[5] = "GoT has been the most pirated TV show for straight 4 years i.e., from 2012 to 2015 with an estimated 14.4 million downloads in 2015 through BitTorrent alone.";
        fun[6] = "Peter Vaughn, the actor who plays the blind Maester Aemon of The Wall, is actually blind in real life.";
        fun[7] = "Emilia Clarke(Daenerys Targaryen) rejected the movie Fifty Shades of Grey, because of nudity in the script.";
        fun[8] = " ";
        fun[9] = " ";
        fun[10] = " ";
        fun[11] = " ";
        fun[12] = " ";
        fun[13] = " ";
        fun[14] = " ";
        fun[15] = " ";
        fun[16] = " ";
        fun[17] = " ";
        fun[18] = " ";
        fun[19] = " ";
        fun[20] = " ";
        fun[21] = " ";
        fun[22] = " ";
        fun[23] = " ";
        fun[24] = " ";
        fun[25] = " ";
        fun[26] = " ";
        fun[27] = " ";
        fun[28] = " ";
        fun[29] = " ";
        String x = "Well Done! You answered all. Lets check your score";
        String y = "Score";
        String z = "Next Question";
        TextView tv = (TextView) findViewById(R.id.tv);
        TextView tv2 = (TextView) findViewById(R.id.abcd);
        b1 = (Button) findViewById(R.id.shu);
        if (shuffle.activities.size() == 0) {
            try {
                tv.setText(x);
                b1.setText(y);
                tv2.setVisibility(View.GONE);
            } catch (NullPointerException cd) {
            }
        }
        else {
                try{
                tv.setText(fun[MainActivity.k]);
                b1.setText(z);
                    MainActivity.k++;
                }catch (NullPointerException qqq){}

        }
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (shuffle.activities.size() == 0) {
                            Intent i = new Intent(shuffle2.this, end.class);
                            i.putExtra("int_value", c);
                            startActivity(i);
                        } else {
                            Collections.shuffle(shuffle.activities);
                            activityToShow = shuffle.activities.get(0);
                            shuffle.activities.remove(0);
                                Intent i = new Intent(shuffle2.this, activityToShow);
                                i.putExtra("int_value", c);
                                startActivity(i);
                        }

                    }
                });


    }
}
