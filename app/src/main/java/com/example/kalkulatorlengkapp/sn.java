package com.example.kalkulatorlengkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sn extends AppCompatActivity {
    Button btnKmblsn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sn);
        btnKmblsn = (Button) findViewById(R.id.btn_kmblsn);
        btnKmblsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahbaliksunda= new Intent(sn.this,MainActivity.class);
                startActivity(pindahbaliksunda);
            }
        });

    }
}