package com.example.eva01lobsangbarriga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity {

    private Button btnLoadSignUpActivity, btnLoadLoginActivity, btnLoadBmiCreate, btnLoadBmiSearch, btnExitApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnLoadSignUpActivity = findViewById(R.id.activity_main_menu_btn_sign_up);
        btnLoadLoginActivity = findViewById(R.id.activity_main_menu_btn_login);
        btnLoadBmiCreate = findViewById(R.id.activity_main_menu_btn_bmi_create);
        btnLoadBmiSearch = findViewById(R.id.activity_main_menu_btn_bmi_search);
        btnExitApp = findViewById(R.id.activity_main_menu_btn_exit_app);

        btnLoadSignUpActivity.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.activity_main_menu_txt_toast_sign_up, Toast.LENGTH_SHORT);
            toast.show();
            Intent i = new Intent(view.getContext(), SignUpActivity.class);
            startActivity(i);
        });

        btnLoadLoginActivity.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.activity_main_menu_txt_toast_login, Toast.LENGTH_SHORT);
            toast.show();
            Intent i = new Intent(view.getContext(), LoginActivity.class);
            startActivity(i);
        });

        btnLoadBmiCreate.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.activity_main_menu_txt_toast_bmi_create, Toast.LENGTH_SHORT);
            toast.show();
            Intent i = new Intent(view.getContext(), BmiCreateActivity.class);
            startActivity(i);
        });

        btnLoadBmiSearch.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.activity_main_menu_txt_toast_bmi_search, Toast.LENGTH_SHORT);
            toast.show();
            Intent i = new Intent(view.getContext(), BmiSearchActivity.class);
            startActivity(i);
        });

        btnExitApp.setOnClickListener(view -> {
            System.exit(0);
        });
    }
}