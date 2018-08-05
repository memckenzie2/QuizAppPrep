package com.example.mmcke.quizappprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Score related variables
    int score;
    int percentCorrect;
    int numQuestions;

    //Question 1 and Scoring related varaibles
    //Create a radio button object, correct RadioButton response, and selected Radio Button.
    RadioGroup q1Radio;
    RadioButton selectedOpt;
    RadioButton q1Ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize score variables
        numQuestions = 3;
        percentCorrect = 0;
        score =0;
        //Q1 Correct response
        q1Ans = (RadioButton) findViewById(R.id.q1_radio_opt3);
        //Radio Group for Question One
        q1Radio = (RadioGroup) findViewById(R.id.q1_radio);

    }

    //This method runs when the @id/submit button is pressed
    public void onSubmit(View v){
        scoreQuiz();
        //q1Score();
        //Create a Toast message that displays long enough for user to see final score
        Toast.makeText(getApplicationContext(), "Your score is " + score + ". That is " + percentCorrect + "% correct!", Toast.LENGTH_LONG).show();
    }

    public boolean q1Score(){

        //Determine if q1 is correct
        int selectedId = q1Radio.getCheckedRadioButtonId();
        RadioButton selectedOpt = (RadioButton) findViewById(selectedId);

        //Check if selected RadioButtons id is equal to the correct answer RadioButton id for q1
        if(q1Ans == selectedOpt){
            return true;
        }

        return false;
    }

    public void scoreQuiz(){
        //Set score to 0 since re-scoring
        score = 0;

        //Score a point if q1 is correct
        if(q1Score() == true){
            score += 1;
        }

        //Find percent correct: take total correct/number of questions
        percentCorrect = (int)(score*100/numQuestions);
    }


}
