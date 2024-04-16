package com.example.vcconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Yearone extends AppCompatActivity {
ImageView back,ainotes,csenotes,civnotes,ecnotes,mechnotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearone);
        back=findViewById(R.id.backbt);
        ainotes=findViewById(R.id.ainotes);
        csenotes=findViewById(R.id.cse);
        civnotes=findViewById(R.id.civi);
        ecnotes=findViewById(R.id.EC);
        mechnotes=findViewById(R.id.mech);
        ainotes.setOnClickListener(v -> {
            Intent intent=new Intent(Yearone.this,Yearonenotescse.class);
            startActivity(intent);
        });
        csenotes.setOnClickListener(v -> {
            Intent intent=new Intent(Yearone.this,Yearonenotescse.class);
            startActivity(intent);
        });
        civnotes.setOnClickListener(v -> {
            Intent intent=new Intent(Yearone.this,Yearonenotescse.class);
            startActivity(intent);
        });
        ecnotes.setOnClickListener(v -> {
            Intent intent=new Intent(Yearone.this,Yearonenotescse.class);
            startActivity(intent);
        });
        mechnotes.setOnClickListener(v -> {
            Intent intent=new Intent(Yearone.this,Yearonenotescse.class);
            startActivity(intent);
        });
        back.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}