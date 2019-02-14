package com.shyn.zyot.wind.viewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditTextDemoActivity extends AppCompatActivity {

    private EditText etInput1;
    private TextView tvInput1;
    private EditText etInput2;
    private TextView tvInput2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_demo);

        etInput1 = findViewById(R.id.etInput1);
        tvInput1 = findViewById(R.id.tvInput1);
        etInput2 = findViewById(R.id.etInput2);
        tvInput2 = findViewById(R.id.tvInput2);

        // way 1
        etInput1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text = editable.toString();
                if (text.isEmpty())
                    tvInput1.setText("No Input");
                else tvInput1.setText(text);
            }
        });

        // way 2
        etInput2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_DONE) {
                    String text = textView.getText().toString();
                    if (text.isEmpty())
                        tvInput2.setText("No Input");
                    else tvInput2.setText(text);
                    return true;
                }
                return false;
            }
        });
    }
}
