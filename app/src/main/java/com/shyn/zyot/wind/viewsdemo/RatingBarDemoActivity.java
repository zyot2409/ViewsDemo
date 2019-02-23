package com.shyn.zyot.wind.viewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingBarDemoActivity extends AppCompatActivity {

    private RatingBar rbTest;
    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_demo);

        rbTest = findViewById(R.id.rbTest);
        tvTest = findViewById(R.id.tvTest);

        rbTest.setStepSize(0.1f);
        rbTest.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (fromUser){
                    tvTest.setText("Rate : " + rating + "/" + ratingBar.getNumStars());
                }
            }
        });
    }
}
