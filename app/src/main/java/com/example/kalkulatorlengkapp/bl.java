package com.example.kalkulatorlengkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bl extends AppCompatActivity {
    Button btnKmblbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bl);
        btnKmblbl = (Button) findViewById(R.id.btn_kmblbl);
        btnKmblbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBalikbali = new Intent(bl.this,MainActivity.class);
                startActivity(pindahBalikbali);
            }
        });
    }
}