package com.example.eva01lobsangbarriga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class BmiSearchActivity extends AppCompatActivity {

    private Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_search);

        btnSearch = findViewById(R.id.activity_bmi_search_btn_search);

        btnSearch.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.activity_bmi_search_txt_toast_search, Toast.LENGTH_SHORT);
            toast.show();
            finish();
        });
    }
}