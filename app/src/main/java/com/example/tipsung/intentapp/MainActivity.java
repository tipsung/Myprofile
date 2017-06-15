package com.example.tipsung.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String yourName;
    String LastName;
    String Age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void sendData(View view) {
        EditText editTextName = (EditText) findViewById(R.id.yourName);
        EditText editTextLastName = (EditText) findViewById(R.id.LastName);
        EditText editTextAge = (EditText) findViewById(R.id.Age);

        String yourName = editTextName.getText().toString();
        String LastName = editTextLastName.getText().toString();
        String Age = editTextAge.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("yourName", yourName);
        intent.putExtra("LastName", LastName);
        intent.putExtra("Age", Age);
        startActivity(intent);
    }
}

