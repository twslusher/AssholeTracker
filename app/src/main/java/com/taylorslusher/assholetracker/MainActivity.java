package com.taylorslusher.assholetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;


import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EncounterClicked(View view){

        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText("THIS IS A MOTHERFUCKIN TEST");

    }
}
