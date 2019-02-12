package com.shyn.zyot.wind.viewsdemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class TextViewDemoActivity extends AppCompatActivity {

    private TextView tvTruncate;
    private TextView tvUsingHTML;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_demo);

        tvTruncate = findViewById(R.id.tvTruncate);
        tvUsingHTML = findViewById(R.id.tvUsingHTML);

        tvTruncate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvTruncate.getMaxLines() == 2)
                    tvTruncate.setMaxLines(Integer.MAX_VALUE);
                else tvTruncate.setMaxLines(2);
            }
        });

        // sample of html text
        String formattedText = "This <i>is</i> a <b>test</b> of <a href='http://foo.com'>html</a>";


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) { // SDK >= 24(Nougat)
            tvUsingHTML.setText(Html.fromHtml(formattedText, Html.FROM_HTML_MODE_LEGACY));
        } else {
            tvUsingHTML.setText(Html.fromHtml(formattedText));
        }
    }
}
