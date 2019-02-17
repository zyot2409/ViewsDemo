package com.shyn.zyot.wind.viewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ToggleButton;

public class ToggleButtonDemoActivity extends AppCompatActivity {

    private ToggleButton tgbSetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_demo);

        tgbSetText = findViewById(R.id.tgbSetText);
        tgbSetText.setTextOff("I'm Free");
        tgbSetText.setTextOn("I'm Busy");
        tgbSetText.setChecked(false);
    }
}
