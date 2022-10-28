package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private TextView message_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message_layout);

        message_textview = (TextView) findViewById(R.id.display_message_activity_message_textview);

        Intent parentIntent = getIntent();
        String message = parentIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        message_textview.setText(message);
    }
}