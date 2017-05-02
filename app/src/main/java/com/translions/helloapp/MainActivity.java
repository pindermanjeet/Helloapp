package com.translions.helloapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.editText);
    }
    public void mainClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("SOMEKEY", et.getText().toString());
        startActivity(intent);
    }
}
