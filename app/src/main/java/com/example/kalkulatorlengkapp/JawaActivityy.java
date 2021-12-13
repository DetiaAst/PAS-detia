package com.example.kalkulatorlengkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JawaActivityy extends AppCompatActivity {
    Button btnNextjw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_activityy);
        btnNextjw = (Button) findViewById(R.id.btn_nextjw);
        btnNextjw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahJawa = new Intent(JawaActivityy.this,jw.class);
                startActivity(pindahJawa);
            }
        });
    }
}