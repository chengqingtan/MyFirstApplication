package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapplication.MESSAGE";

    private Button send_message_button;
    private EditText message_edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        send_message_button = (Button) findViewById(R.id.main_activity_send_button);
        message_edittext = (EditText) findViewById(R.id.main_activity_edit_text);
        send_message_button.setOnClickListener(this);
    }

    public void send_Message(){
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE,message_edittext.getText().toString());
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.main_activity_send_button)
            send_Message();
    }
}