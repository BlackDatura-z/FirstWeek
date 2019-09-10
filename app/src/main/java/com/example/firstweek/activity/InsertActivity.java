package com.example.firstweek.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.firstweek.R;

public class InsertActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        Yes.findViewById(R.id.yes);
        Yes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
