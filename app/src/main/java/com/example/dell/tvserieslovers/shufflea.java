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
public class shufflea extends AppCompatActivity {
    static Class activityToShow;
    Button b1;
    int c;
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(shufflea.this, MainActivity.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shufflea);
        Intent intent = getIntent();
        c = intent.getIntExtra("int_value", 0);
        b1 = (Button) findViewById(R.id.shu);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent(shufflea.this, activityToShow);
                        i.putExtra("int_value", c);
                        startActivity(i);
                    }
                });
    }
}
