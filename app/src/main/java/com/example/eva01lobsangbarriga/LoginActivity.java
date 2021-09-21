package com.example.eva01lobsangbarriga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnSendLoginForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSendLoginForm = findViewById(R.id.activity_login_btn_confirm_login);

        btnSendLoginForm.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.activity_login_txt_toast_confirm_login, Toast.LENGTH_SHORT);
            toast.show();
            finish();
        });
    }
}