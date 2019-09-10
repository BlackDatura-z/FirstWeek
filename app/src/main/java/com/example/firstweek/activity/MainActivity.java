package com.example.sqlitedemoapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.firstweek.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Add;
    private Button Modify;
    private Button Delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Add.findViewById(R.id.add);
        Modify.findViewById(R.id.modify);
        Delete.findViewById(R.id.delete);
        Add.setOnClickListener(this);
        Delete.setOnClickListener(this);
        Modify.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
