package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_click(View v) {
        TextView tv_msg = findViewById(R.id.msg);
        counter++;
        tv_msg.setText("Welcome to my App! counter: " + counter);

    }
    public void Toast_click(View v) {
        Toast.makeText(MainActivity.this, "Keep clicking increment button!", Toast.LENGTH_SHORT).show();
    }
}