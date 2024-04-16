package com.example.vcconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Yeartwo extends AppCompatActivity {
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeartwo);
        back=findViewById(R.id.backbt);
        back.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}