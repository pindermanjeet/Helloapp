package com.translions.helloapp;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
public TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String name = getIntent().getExtras().getString("SOMEKEY");
        setContentView(R.layout.activity_main2);
        tv = (TextView)findViewById(R.id.textView2);
        tv.setText(name);
    }
}
