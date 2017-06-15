package com.example.tipsung.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.CollationElementIterator;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String name = intent.getStringExtra("yourName");
        TextView textName = (TextView) findViewById(R.id.textView2);
        textName.setText(name);

        String LastName = intent.getStringExtra("LastName");
        TextView textLastName = (TextView) findViewById(R.id.textView3);
        textLastName.setText(LastName);

        String Age = intent.getStringExtra("Age");
        TextView textAge = (TextView) findViewById(R.id.textView4);
        textAge.setText(Age);

    }

}
