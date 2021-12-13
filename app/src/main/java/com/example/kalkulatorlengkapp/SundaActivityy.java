package com.example.kalkulatorlengkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SundaActivityy extends AppCompatActivity {
    Button btnNextsn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunda_activityy);
        btnNextsn = (Button) findViewById(R.id.btn_nextsn);
        btnNextsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahSunda = new Intent(SundaActivityy.this,sn.class);
                startActivity(pindahSunda);
            }
        });
    }
}