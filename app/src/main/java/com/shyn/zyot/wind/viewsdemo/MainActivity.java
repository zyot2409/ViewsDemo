package com.shyn.zyot.wind.viewsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnTextView;
    private Button btnEditText;
    private Button btnImageView;
    private Button btnCheckBox;
    private Button btnRadioButton;
    private Button btnToggleButton;
    private Button btnButton;
    private Button btnSwitch;
    private Button btnImageButton;
    private Button btnSeekBar;
    private Button btnProgressBar;
    private Button btnRatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find View by ID
        btnTextView = findViewById(R.id.btnTextView);
        btnEditText = findViewById(R.id.btnEditText);
        btnImageView = findViewById(R.id.btnImageView);
        btnCheckBox = findViewById(R.id.btnCheckBox);
        btnRadioButton = findViewById(R.id.btnRadioButton);
        btnToggleButton = findViewById(R.id.btnToggleButton);
        btnButton = findViewById(R.id.btnButton);
        btnSwitch = findViewById(R.id.btnSwitch);
        btnImageButton = findViewById(R.id.btnImageButton);
        btnSeekBar = findViewById(R.id.btnSeekBar);
        btnProgressBar = findViewById(R.id.btnProgressBar);
        btnRatingBar = findViewById(R.id.btnRatingBar);

        // set OnClickListener
        btnTextView.setOnClickListener(this);
        btnButton.setOnClickListener(this);
        btnCheckBox.setOnClickListener(this);
        btnEditText.setOnClickListener(this);
        btnImageButton.setOnClickListener(this);
        btnProgressBar.setOnClickListener(this);
        btnRadioButton.setOnClickListener(this);
        btnRatingBar.setOnClickListener(this);
        btnSeekBar.setOnClickListener(this);
        btnSwitch.setOnClickListener(this);
        btnToggleButton.setOnClickListener(this);
        btnImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTextView:{
                Intent intent = new Intent(getBaseContext(),TextViewDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnEditText:{
                Intent intent = new Intent(getBaseContext(),EditTextDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnImageView:{
                Intent intent = new Intent(getBaseContext(),ImageViewDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnCheckBox:{
                Intent intent = new Intent(getBaseContext(),CheckBoxDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnRadioButton:{
                break;
            }
            case R.id.btnToggleButton:{
                break;
            }
            case R.id.btnButton:{
                break;
            }
            case R.id.btnSwitch:{
                break;
            }
            case R.id.btnImageButton:{
                break;
            }
            case R.id.btnSeekBar:{
                break;
            }
            case R.id.btnRatingBar:{
                break;
            }
            case R.id.btnProgressBar:{
                break;
            }
        }
    }
}
