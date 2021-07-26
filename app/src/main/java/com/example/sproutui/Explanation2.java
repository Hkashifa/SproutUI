package com.example.sproutui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explanation2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation2);

        Button Take_Survey=findViewById(R.id.take_survey);
        Take_Survey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent2;
                intent2 = new Intent(Explanation2.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}