package com.example.dell.tvserieslovers;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by DELL on 22-Jun-16.
 */
public class shuffle extends AppCompatActivity {
    static ArrayList<Class> activities = new ArrayList<>();
    static Class activityToShow;
    Button b1;
    int c;
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(shuffle.this, MainActivity.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shuffle);
        Intent intent = getIntent();
        c = intent.getIntExtra("int_value", 0);
        b1 = (Button) findViewById(R.id.shu);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        activities.add(got1.class);
                        activities.add(got2.class);
                        activities.add(got3.class);
                        activities.add(got4.class);
                        activities.add(got5.class);
                        activities.add(got6.class);
                        activities.add(got7.class);
                        activities.add(got8.class);
                        activities.add(got9.class);
                        activities.add(got10.class);
                        Collections.shuffle(activities);
                        activityToShow = activities.get(0);
                        activities.remove(0);
                        Intent i = new Intent(shuffle.this, activityToShow);
                        i.putExtra("int_value", c);
                        startActivity(i);
                    }
                });
    }
}
