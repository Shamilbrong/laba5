package com.example.laba5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    RadioGroup rbtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        rbtn = findViewById(R.id.rbtn);
        rbtn.clearCheck();
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent();
        int selectedColor = getResources().getColor(R.color.green); // По умолчанию зеленый цвет
        int checkedId = rbtn.getCheckedRadioButtonId();
        if (checkedId == R.id.radioGreen) {
            selectedColor = getResources().getColor(R.color.green);
        } else if (checkedId == R.id.radioOrange) {
            selectedColor = getResources().getColor(R.color.orange);
        } else if (checkedId == R.id.radioYellow) {
            selectedColor = getResources().getColor(R.color.yellow);
        }
        intent.putExtra("selectedColor", selectedColor);
        setResult(RESULT_OK, intent);
        finish();
    }
}
