package com.shyn.zyot.wind.viewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioButtonDemoActivity extends AppCompatActivity {

    private RadioGroup rgChoice;
    private RadioButton rbChoice1;
    private RadioButton rbChoice2;
    private RadioButton rbChoice3;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_demo);

        rgChoice = findViewById(R.id.rgChoice);
        rbChoice1 = findViewById(R.id.rbChoice1);
        rbChoice2 = findViewById(R.id.rbChoice2);
        rbChoice3 = findViewById(R.id.rbChoice3);
        tvResult = findViewById(R.id.tvResult);

        rgChoice = findViewById(R.id.rgChoice);

        rgChoice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rbChoice1:{
                        tvResult.setText(rbChoice1.getText().toString());
                        break;
                    }
                    case R.id.rbChoice2:{
                        tvResult.setText(rbChoice2.getText().toString());
                        break;
                    }
                    case R.id.rbChoice3:{
                        tvResult.setText(rbChoice3.getText().toString());
                        break;
                    }
                }
            }
        });
    }
}
