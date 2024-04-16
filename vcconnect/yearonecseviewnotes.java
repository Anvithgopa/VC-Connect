package com.example.vcconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class yearonecseviewnotes extends AppCompatActivity {
    String iotmod1,iotmod2,iotmod3,iotmod4,iotmod5;
    ImageView back;
    WebView modview;
    Boolean booliotmod1=false,booliotmod2=false,booliotmod3=false,booliotmod4=false,booliotmod5=false;
    ProgressBar progress;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearonecseviewnotes);
        iotmod1="https://drive.google.com/file/d/1-uh_pqkrAOwUSOpyn1Wg20PWS4jFk0e0/view?usp=sharing/view";
        iotmod2="https://drive.google.com/file/d/1-lvLLcS-ds24Te3TbEeyA4qYtpl3TNfK/view?usp=sharing";
        iotmod3="https://drive.google.com/file/d/1-TCIi82CEPJ9d_lopNj1I8Sk2V13O7wK/view?usp=sharing";
        iotmod4="https://drive.google.com/file/d/1-traw6itMImgzSuqgsFAcFhv_ZugNUAW/view?usp=sharing";
        iotmod5="https://drive.google.com/file/d/1-NDWMTo6Mr8isYf0tCdkdaUy4K3g3b7s/view?usp=drive_link";
        progress=findViewById(R.id.progressBardr);
        back=findViewById(R.id.backbt);
        progress.setVisibility(View.VISIBLE);

        modview=findViewById(R.id.driveone);

        WebSettings webSettings=modview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        modview.setWebViewClient(new WebViewClient());
        booliotmod1=getIntent().getBooleanExtra("booliotmod1",false);
        booliotmod2=getIntent().getBooleanExtra("booliotmod2",false);
        booliotmod3=getIntent().getBooleanExtra("booliotmod3",false);
        booliotmod4=getIntent().getBooleanExtra("booliotmod4",false);
        booliotmod5=getIntent().getBooleanExtra("booliotmod5",false);
        if(booliotmod1){
            progress.setVisibility(View.GONE);
            modview.loadUrl(iotmod1);
        } else if (booliotmod2) {
            progress.setVisibility(View.GONE);
            modview.loadUrl(iotmod2);
        }else if (booliotmod3) {
            progress.setVisibility(View.GONE);
            modview.loadUrl(iotmod3);
        }else if (booliotmod4) {
            progress.setVisibility(View.GONE);
            modview.loadUrl(iotmod4);
        }else if (booliotmod5) {
            progress.setVisibility(View.GONE);
            modview.loadUrl(iotmod5);
        }else {
            progress.setVisibility(View.GONE);
            super.onBackPressed();
        }
        back.setOnClickListener(v -> {
            onBackPressed();
        });

    }
    private static class CustomWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            String url = request.getUrl().toString();

            // Disable download button by intercepting URL requests
            if (url.contains("drive.google.com")) {
                view.loadUrl(url);
                return true;
            }

            return false;
        }
    }
}