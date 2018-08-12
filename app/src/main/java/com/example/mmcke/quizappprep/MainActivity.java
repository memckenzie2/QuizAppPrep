package com.example.mmcke.quizappprep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

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
