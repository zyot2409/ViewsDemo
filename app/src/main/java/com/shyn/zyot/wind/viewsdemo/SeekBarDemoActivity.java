package com.shyn.zyot.wind.viewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarDemoActivity extends AppCompatActivity {

    private SeekBar sbTest;
    private SeekBar sbTest2;
    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_demo);

        sbTest = findViewById(R.id.sbTest);
        sbTest2 = findViewById(R.id.sbTest2);
        tvTest = findViewById(R.id.tvTest);

        tvTest.setText("Cover : 0/" + sbTest.getMax());
        sbTest.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sbTest2.setProgress(progress);
                tvTest.setText("Cover : " + progress + "/" + sbTest.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarDemoActivity.this, "Start", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarDemoActivity.this, "Stop", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
