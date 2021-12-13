 package com.example.kalkulatorlengkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

 public class MainActivity extends AppCompatActivity {
    CircleImageView Bali, Minang, Sunda, Jawa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bali = (CircleImageView) findViewById(R.id.img_Bali);
        Jawa = (CircleImageView) findViewById(R.id.img_Jawa);
        Minang =(CircleImageView)  findViewById(R.id.img_Minang);
        Sunda = (CircleImageView)  findViewById(R.id.img_Sunda);



        Sunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahSunda = new Intent(MainActivity.this,SundaActivityy.class);
                startActivity(pindahSunda);
            }
        });


        Bali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBali = new Intent(MainActivity.this, BaliActivityy.class);
                startActivity(pindahBali);
            }
        });
        Minang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahMinang = new Intent(MainActivity.this, MinangActivityy.class);
                startActivity(pindahMinang);
            }
        });
        Jawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahJawa = new Intent(MainActivity.this, JawaActivityy.class);
                startActivity(pindahJawa);
            }
        });
    }}