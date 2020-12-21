package com.destinyapp.sipeta.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.sipeta.R;

public class RegisterActivity extends AppCompatActivity {
    LinearLayout login,daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        login = findViewById(R.id.linearLogin);
        daftar = findViewById(R.id.linearDaftar);
        OnClick();
    }
    private void OnClick(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Daftar();
            }
        });
    }
    private void Login(){
        onBackPressed();
    }
    private void Daftar(){
//        Intent intent = new Intent(RegisterActivity.this,RegisterActivity.class);
//        startActivity(intent);
    }
}