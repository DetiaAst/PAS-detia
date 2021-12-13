package com.example.kalkulatorlengkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MinangActivityy extends AppCompatActivity {
    Button btnNextmn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minang_activityy);
        btnNextmn = (Button) findViewById(R.id.btn_nextmn);
        btnNextmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahMinang = new Intent(MinangActivityy.this,mn.class);
                startActivity(pindahMinang);
            }
        });
    }
}