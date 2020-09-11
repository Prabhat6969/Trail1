package com.example.trail1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void btn_reg(View v) {
        Intent i = new Intent(login.this, registration.class);
        startActivity(i);
    }
    public void btn_log(View v) {
        Intent i = new Intent(login.this, authenticate.class);
        startActivity(i);
    }
}