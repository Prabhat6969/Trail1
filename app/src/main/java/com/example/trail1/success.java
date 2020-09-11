package com.example.trail1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
    }
    public void sendhome(View view){
        Intent startnew1 = new Intent(this,list.class);
        startActivity(startnew1);
    }
    public void exitbtn(View view){
        finish();
        moveTaskToBack(true);
    }
}