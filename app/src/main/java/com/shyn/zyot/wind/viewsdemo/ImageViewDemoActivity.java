package com.shyn.zyot.wind.viewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewDemoActivity extends AppCompatActivity {

    private ImageView imvSetImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_demo);

        imvSetImage = findViewById(R.id.imvSetImage);

        imvSetImage.setImageResource(R.drawable.ic_subscriptions_black_24dp);
    }
}
