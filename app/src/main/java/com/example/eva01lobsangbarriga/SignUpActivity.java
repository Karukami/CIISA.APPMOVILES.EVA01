package com.example.eva01lobsangbarriga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private Button btnSendSignUpForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSendSignUpForm = findViewById(R.id.activity_sign_up_btn_confirm_sign_up);

        btnSendSignUpForm.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.activity_sign_up_txt_toast_confirm_sign_up, Toast.LENGTH_SHORT);
            toast.show();
            finish();
        });
    }
}