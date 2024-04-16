package com.example.vcconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Yearonenotescse extends AppCompatActivity {
    TextView iotphymod,matmod,phymod,princmod,sammod,ieemod;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearonenotescse);
        iotphymod=findViewById(R.id.iotphyfy);
        back=findViewById(R.id.backbt);
        matmod=findViewById(R.id.matcse);
        phymod=findViewById(R.id.phycse);
        princmod=findViewById(R.id.ppc);
        sammod=findViewById(R.id.sumkan);
        ieemod=findViewById(R.id.iee);
        back.setOnClickListener(v -> {
            onBackPressed();
        });
        iotphymod.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Iotphymodules.class);
            startActivity(intent);
        });
        matmod.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Iotphymodules.class);
            startActivity(intent);
        });
        phymod.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Iotphymodules.class);
            startActivity(intent);
        });
        princmod.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Iotphymodules.class);
            startActivity(intent);
        });
        sammod.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Iotphymodules.class);
            startActivity(intent);
        });
        ieemod.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Iotphymodules.class);
            startActivity(intent);
        });
    }
}