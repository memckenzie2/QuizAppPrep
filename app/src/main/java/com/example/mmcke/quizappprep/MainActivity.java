package com.example.mmcke.quizappprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;package com.example.mmcke.quizappprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //
    /* */
     int score;
    RadioGroup q1Radio;
    RadioButton q1Ans;

    //THese are the checkboxes for Question 2
    CheckBox q2Opt1;
    CheckBox q2Opt2;
    CheckBox q2Opt3;
    CheckBox q2Opt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
        q1Radio = (RadioGroup) findViewById(R.id.q1_radio);
        q1Ans = (RadioButton) findViewById(R.id.q1_radio_opt3);

        //This is importing all the checkboxes for question 2

        q2Opt1 = (CheckBox) findViewById(R.id.q2_check_opt1);
        q2Opt2 = findViewById(R.id.q2_check_opt2);
        q2Opt3 = findViewById(R.id.q2_check_opt3);
        q2Opt4 = findViewById(R.id.q2_check_opt4);

    }

    public void onSubmit(View v){
        scoreQuiz();
        Toast.makeText(getApplicationContext(), "Your Score is " + score, Toast.LENGTH_LONG).show();

    }

    public void q1Score(){
        int selectedID = q1Radio.getCheckedRadioButtonId();
        RadioButton selectedOpt = (RadioButton) findViewById(selectedID);

        if(q1Ans == selectedOpt){
            //score = score + 1;
            score += 1;
        }
    }

    public void q2Score(){
        /* Below is the nested loop example. I commented it out because using such a complex loop is considered
           a bad coding practice. It is too complex for another person to easily decipher how the final decision is made.
        if(q2Opt1.isChecked() == true){
            if(q2Opt2.isChecked() == false){
                if(q2Opt3.isChecked() == false){
                    if(q2Opt4.isChecked() == true){
                        score = score +1;
                    }
                }
            }
        }*/

        //This is the exact same decision as the nested if-statement commented out above. Much cleaner code!
        if(q2Opt1.isChecked() && !q2Opt2.isChecked() && !q2Opt3.isChecked() && q2Opt4.isChecked()){
            score = score + 1;
        }
    }


    private void scoreQuiz(){
        score = 0;
        q1Score();
        q2Score();
    }

}


public class MainActivity extends AppCompatActivity {
    //Place app variables here


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    
    //
    public void onSubmit(View v){
        Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_LONG).show();
    }


}
