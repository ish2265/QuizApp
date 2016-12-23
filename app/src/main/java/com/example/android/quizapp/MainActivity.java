package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // score for question 1
    public int scoreQ1 = 0;
    public void checkQuestion1(View view) {
        // to check button for the answer
        boolean checked = ((RadioButton) view).isChecked();

    }




    private void sumitQuizScore(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.submit_quizscore);
        quantityTextView.setText("" + number);
    }
}
