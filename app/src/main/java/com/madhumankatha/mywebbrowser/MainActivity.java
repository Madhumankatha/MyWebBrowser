package com.madhumankatha.mywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //First, Creating objects for the components
    private EditText edUrl;
    private Button btnGo;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the objects & Bind to the UI
        edUrl = findViewById(R.id.edUrl);
        btnGo = findViewById(R.id.btnGo);
        webView = findViewById(R.id.webView);

        //setting a webclient
        webView.setWebViewClient(new WebViewClient());

        // add click for button
        btnGo.setOnClickListener(v -> {
            // get the url from the edittext
            String url = edUrl.getText().toString();

            // default settings to webview
            webView.getSettings().setLoadsImagesAutomatically(true);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

            //load url method
            webView.loadUrl(url);
        });
    }
}