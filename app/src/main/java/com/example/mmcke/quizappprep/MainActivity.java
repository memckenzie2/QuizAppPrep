package com.example.mmcke.quizappprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score;
    //Create a radio button object
    RadioGroup q1Radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize score to zero
        score =0;
        //
        q1Radio = (RadioGroup) findViewById(R.id.q1_radio);
    }

    //This method runs when the @id/submit button is pressed
    public void onSubmit(View v){
        q1Score();
        //Create a Toast message that displays long enough for user to see final score
        Toast.makeText(getApplicationContext(), "Your score is " + score, Toast.LENGTH_LONG).show();
    }

    public void q1Score(){

        //Determine if q1 is correct
        int selectedId = q1Radio.getCheckedRadioButtonId();
        RadioButton selectedOpt = (RadioButton) findViewById(selectedId);
        score += 1;
    }


}
