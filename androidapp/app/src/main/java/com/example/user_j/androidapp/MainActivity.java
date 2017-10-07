package com.example.user_j.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private Button btnDo;
    private TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDo = (Button) findViewById(R.id.button1);
        txtShow = (TextView) findViewById(R.id.textView1);
        btnDo.setOnClickListener(btnDoListener);
    }

    private Button.OnClickListener btnDoListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtShow.setText("操你的案到我很痛");
        }
    };
}
