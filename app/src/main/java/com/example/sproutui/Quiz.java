package com.example.sproutui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button take_survey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
           take_survey.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(Quiz, Explanation2.class);
                   startActivity(intent);
               }

               }
           }
           );
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rarely:
                if (checked)
                      Toast toast = Toast.makeText(getApplicationContext(), "you choose rarely",Toast.LENGTH_LONG).show();

                    // TODO:add the firebase/firestore related code here
                    break;
            case R.id.sometimes:
                if (checked)
                    Toast toast = Toast.makeText(getApplicationContext(), "you choose sometimes",Toast.LENGTH_LONG).show();
                    // TODO:add the firebase/firestore related code here
                    break;
            case R.id.oftens:
                if (checked)
                    Toast toast = Toast.makeText(getApplicationContext(), "you choose often",Toast.LENGTH_LONG).show();
                    // TODO:add the firebase/firestore related code here
                    break;
            case R.id.all:
                if (checked)
                    Toast toast = Toast.makeText(getApplicationContext(), "you choose all",Toast.LENGTH_LONG).show();
                    // TODO:add the firebase/firestore related code here
                    break;
    }

}
