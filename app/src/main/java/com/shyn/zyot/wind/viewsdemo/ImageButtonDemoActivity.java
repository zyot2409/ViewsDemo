package com.shyn.zyot.wind.viewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ImageButtonDemoActivity extends AppCompatActivity {

    private ImageButton imbtnSetSRC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button_demo);

        imbtnSetSRC = findViewById(R.id.imbtnSetSRC);
        imbtnSetSRC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imbtnSetSRC.setImageResource(R.mipmap.ic_launcher);
                imbtnSetSRC.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
    }
}
