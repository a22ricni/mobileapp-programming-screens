package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SubmitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        TextView submitText = findViewById(R.id.submitText);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");

            submitText.setText(name);
        }

    }
}