package com.shyn.zyot.wind.viewsdemo;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarDemoActivity extends AppCompatActivity {

    private ProgressBar pgbSpin;
    private ProgressBar pgbBar;
    private Button btnSpin;
    private Button btnLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_demo);

        pgbSpin = findViewById(R.id.pgbSpin);
        pgbBar = findViewById(R.id.pgbBar);
        btnLoad = findViewById(R.id.btnLoad);
        btnSpin = findViewById(R.id.btnSpin);

        btnSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pgbSpin.setVisibility(View.VISIBLE);
            }
        });

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 1;i <= 100;i++){
                    pgbBar.setProgress(i);
                }

            }
        });
    }
}
