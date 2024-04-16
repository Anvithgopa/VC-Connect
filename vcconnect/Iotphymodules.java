package com.example.vcconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Iotphymodules extends AppCompatActivity {
    Button modv1,modv2,modv3,modv4,modv5;
    ImageView back;
    Boolean booliotmod1=false,booliotmod2=false,booliotmod3=false,booliotmod4=false,booliotmod5=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iotphymodules);
        modv1=findViewById(R.id.mod1);
        modv2=findViewById(R.id.mod2);
        modv3=findViewById(R.id.mod3);
        modv4=findViewById(R.id.mod4);
        modv5=findViewById(R.id.mod5);
        back=findViewById(R.id.backbt);

        modv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Iotphymodules.this, yearonecseviewnotes.class);
                booliotmod1=true;
                intent.putExtra("booliotmod1",booliotmod1);
                startActivity(intent);
            }
        });
        modv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Iotphymodules.this, yearonecseviewnotes.class);
                booliotmod2=true;
                intent.putExtra("booliotmod2",booliotmod2);
                startActivity(intent);
            }
        });
        modv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Iotphymodules.this, yearonecseviewnotes.class);
                booliotmod3=true;
                intent.putExtra("booliotmod3",booliotmod3);
                startActivity(intent);
            }
        });
        modv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Iotphymodules.this, yearonecseviewnotes.class);
                booliotmod4=true;
                intent.putExtra("booliotmod4",booliotmod4);
                startActivity(intent);
            }
        });
        modv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Iotphymodules.this, yearonecseviewnotes.class);
                booliotmod5=true;
                intent.putExtra("booliotmod5",booliotmod5);
                startActivity(intent);
            }
        });
        back.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}