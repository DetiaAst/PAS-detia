package com.example.kalkulatorlengkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jw extends AppCompatActivity {
    Button btnKmbljw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jw);
        btnKmbljw = (Button) findViewById(R.id.btn_kmbljw);
        btnKmbljw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBalikjawa = new Intent(jw.this,MainActivity.class);
                startActivity(pindahBalikjawa);
            }
        });
    }
}