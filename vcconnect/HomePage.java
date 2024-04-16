package com.example.vcconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomePage extends AppCompatActivity {
    FirebaseAuth auth;
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageviewpf;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        auth=FirebaseAuth.getInstance();
        imageView5=findViewById(R.id.imageView3);
        user=auth.getCurrentUser();
        if(user==null){
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            finish();
        }
       /* imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });*/

        imageviewpf=findViewById(R.id.profileview);
        imageviewpf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Profileview.class);
                startActivity(intent);
            }
        });
        imageView1=findViewById(R.id.yearonehome);
        imageView1.setOnClickListener(v -> {
            // Launch the XML activity
            Intent intent = new Intent(HomePage.this, Yearone.class);
            startActivity(intent);
        });
        imageView2=findViewById(R.id.yeartwohome);
        imageView2.setOnClickListener(v -> {
            // Launch the XML activity
            Intent intent = new Intent(HomePage.this, Yeartwo.class);
            startActivity(intent);
        });
        imageView3=findViewById(R.id.yearthreehome);
        imageView3.setOnClickListener(v -> {
            // Launch the XML activity
            Intent intent = new Intent(HomePage.this, Yearthree.class);
            startActivity(intent);
        });
        imageView4=findViewById(R.id.yearfourhome);
        imageView4.setOnClickListener(v -> {
            // Launch the XML activity
            Intent intent = new Intent(HomePage.this, Yearfour.class);
            startActivity(intent);
        });
    }
}