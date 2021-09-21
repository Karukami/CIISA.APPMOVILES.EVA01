package com.example.eva01lobsangbarriga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class BmiCreateActivity extends AppCompatActivity {

    private Button btnSaveBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_create);

        btnSaveBmi = findViewById(R.id.activity_bmi_create_btn_save);

        btnSaveBmi.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.activity_bmi_create_txt_toast_save, Toast.LENGTH_SHORT);
            toast.show();
            finish();
        });
    }
}