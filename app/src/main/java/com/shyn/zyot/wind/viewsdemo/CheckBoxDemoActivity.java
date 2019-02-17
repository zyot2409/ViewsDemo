package com.shyn.zyot.wind.viewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class CheckBoxDemoActivity extends AppCompatActivity {

    private CheckBox cbTitle;
    private CheckBox cbChoice1;
    private CheckBox cbChoice2;
    private CheckBox cbChoice3;
    private CheckBox cbChoice4;
    private CheckBox cbChoice5;
    private TextView tvResult;
    private boolean checked[] = new boolean[5];
    private boolean actived;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_demo);

        cbTitle = findViewById(R.id.cbTitle);
        cbChoice1 = findViewById(R.id.cbChoice1);
        cbChoice2 = findViewById(R.id.cbChoice2);
        cbChoice3 = findViewById(R.id.cbChoice3);
        cbChoice4 = findViewById(R.id.cbChoice4);
        cbChoice5 = findViewById(R.id.cbChoice5);
        tvResult = findViewById(R.id.tvResult);

        cbChoice1.setOnCheckedChangeListener(checkedListener);
        cbChoice2.setOnCheckedChangeListener(checkedListener);
        cbChoice3.setOnCheckedChangeListener(checkedListener);
        cbChoice4.setOnCheckedChangeListener(checkedListener);
        cbChoice5.setOnCheckedChangeListener(checkedListener);
        cbTitle.setOnCheckedChangeListener(checkedListener);
        actived = true;


    }

    CompoundButton.OnCheckedChangeListener checkedListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            //compoundButton is CheckBox
            switch (compoundButton.getId()) {
                case R.id.cbChoice1: {
                    if (!actived) break;
                    String result = "";
                    checked[0] = b ? true : false;
                    for (int i = 0; i < 5; i++) {
                        if (checked[i])
                            result += "Choice " + (i + 1) + ", ";
                    }
                    String finalResult = "";
                    if (result.isEmpty())
                        finalResult = "No choice!";
                    else
                        finalResult = result.substring(0, result.length() - 2);

                    tvResult.setText(finalResult);
                    break;
                }
                case R.id.cbChoice2: {
                    if (!actived) break;
                    String result = "";
                    checked[1] = b ? true : false;
                    for (int i = 0; i < 5; i++) {
                        if (checked[i])
                            result += "Choice " + (i + 1) + ", ";
                    }
                    String finalResult = "";
                    if (result.isEmpty())
                        finalResult = "No choice!";
                    else
                        finalResult = result.substring(0, result.length() - 2);

                    tvResult.setText(finalResult);
                    break;
                }
                case R.id.cbChoice3: {
                    if (!actived) break;
                    String result = "";
                    checked[2] = b ? true : false;
                    for (int i = 0; i < 5; i++) {
                        if (checked[i])
                            result += "Choice " + (i + 1) + ", ";
                    }
                    String finalResult = "";
                    if (result.isEmpty())
                        finalResult = "No choice!";
                    else
                        finalResult = result.substring(0, result.length() - 2);

                    tvResult.setText(finalResult);
                    break;
                }
                case R.id.cbChoice4: {
                    if (!actived) break;
                    String result = "";
                    checked[3] = b ? true : false;
                    for (int i = 0; i < 5; i++) {
                        if (checked[i])
                            result += "Choice " + (i + 1) + ", ";
                    }
                    String finalResult = "";
                    if (result.isEmpty())
                        finalResult = "No choice!";
                    else
                        finalResult = result.substring(0, result.length() - 2);

                    tvResult.setText(finalResult);
                    break;
                }
                case R.id.cbChoice5: {
                    if (!actived) break;
                    String result = "";
                    checked[4] = b ? true : false;
                    for (int i = 0; i < 5; i++) {
                        if (checked[i])
                            result += "Choice " + (i + 1) + ", ";
                    }
                    String finalResult = "";
                    if (result.isEmpty())
                        finalResult = "No choice!";
                    else
                        finalResult = result.substring(0, result.length() - 2);

                    tvResult.setText(finalResult);
                    break;
                }
                case R.id.cbTitle: {
                    actived = b ? true : false;
                    if (b) {
                        tvResult.setText("Active");
                    } else {
                        for (int i = 0; i < 5; i++) {
                            checked[i] = false;
                        }
                        tvResult.setText("Non-active");
                    }

                    cbChoice1.setChecked(false);
                    cbChoice2.setChecked(false);
                    cbChoice3.setChecked(false);
                    cbChoice4.setChecked(false);
                    cbChoice5.setChecked(false);
                    break;
                }
            }
        }
    };
}
