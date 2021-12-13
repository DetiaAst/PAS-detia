package com.example.kalkulatorlengkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mn extends AppCompatActivity {
    Button btnKmblmn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mn);
        btnKmblmn = (Button) findViewById(R.id.btn_kmblmn);
        btnKmblmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahbalikminang= new Intent(mn.this,MainActivity.class);
                startActivity(pindahbalikminang);
            }
        });
    }
}