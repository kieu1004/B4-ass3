package com.example.b4ass3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView textMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        textMsg = findViewById(R.id.textMsg);
        Intent intent = getIntent();
        String text = intent.getStringExtra("msg");
        textMsg.setText(text);
    }
}