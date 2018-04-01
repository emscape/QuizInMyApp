package com.example.android.quizinmyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Global variable to hold the score
    int score;

    {
        score = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This is for reading the name and storing it in a variable
     */
    private EditText nameView;
    String nameInput;

    public void getName(View view) {
        EditText nameField = (EditText) findViewById(R.id.nameField);
        nameInput = nameField.getText().toString();
    }

    /**
     * Radio button of question one
     * Calculates the score depending on right or wrong button checked
     */
    public void onRadioButtonQ1Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_q1c1:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
            case R.id.radio_q1c2:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
            case R.id.radio_q1c3:
                if (checked)
                    score = score + 1;
                // Right answer adds one point to the score
            case R.id.radio_q1c4:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
        }
    }

    /**
     * Radio button of question three
     * Calculates the score depending on right or wrong button checked
     */
    public void onRadioButtonQ3Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_q3c1:
                if (checked)
                    score = score + 1;
                // Right answer adds one point to the score
                break;
            case R.id.radio_q3c2:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
            case R.id.radio_q3c3:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
            case R.id.radio_q3c4:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
        }
    }

    /**
     * Radio button of question six
     * Calculates the score depending on right or wrong button checked
     */
    public void onRadioButtonQ6Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_q6c1:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
            case R.id.radio_q6c2:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
            case R.id.radio_q6c3:
                if (checked)
                    score = score + 1;
                // Right answer adds one point to the score
            case R.id.radio_q6c4:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
        }
    }

    /**
     * Radio button of question eight
     * Calculates the score depending on right or wrong button checked
     */
    public void onRadioButtonQ8Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_q8c1:
                if (checked)
                    score = score + 1;
                // Right answer adds one point to the score
                break;
            case R.id.radio_q8c2:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
            case R.id.radio_q8c3:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
            case R.id.radio_q8c4:
                if (checked)
                    score = score;
                // Wrong answer adds zero points to the score
                break;
        }
    }
    //global variable for quantity
    int quantity;
    /**
     * This method increases the amount of points wagered
     */
    public void increment(View view) {

        if (quantity >= 10) {
            Toast.makeText(this,getString(R.string.max) , Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);

    }

    /*
    This method decreases the amount of points wagered
     */
    public void decrement(View view) {


        if (quantity < 1) {
            Toast.makeText(this,getString(R.string.min) , Toast.LENGTH_SHORT).show();
            return; }
        quantity = quantity - 1;
        displayQuantity(quantity);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the final question once the wager is submitted
     */
    public void displayFinalQuestion(View view) {
        TextView fq_text_view = (TextView) findViewById(R.id.fq_text_view);
        fq_text_view.setVisibility(View.VISIBLE);
    }

    int finalQuestionRight;
    /**
     * This method is called when the score Button in clicked
     */
    public void scoreButtonClicked(View view) {
        CheckBox CheckBoxRightOne = (CheckBox) findViewById(R.id.q2c1_checkbox);
        CheckBox CheckBoxRightTwo = (CheckBox) findViewById(R.id.q2c2checkbox);
        CheckBox CheckBoxWrong = (CheckBox) findViewById(R.id.q2c3checkbox);
        CheckBox CheckBoxRightThree = (CheckBox) findViewById(R.id.q2c4checkbox);
        boolean hasOneRightAnswer;
        boolean hasTwoRightAnswer;
        boolean hasThreeRightAnswers;
        boolean hasWrongAnswer;
        if (!(!(hasOneRightAnswer = CheckBoxRightOne.isChecked()) ||
                !(hasTwoRightAnswer = CheckBoxRightTwo.isChecked()) ||
                !(hasThreeRightAnswers = CheckBoxRightThree.isChecked())
                        && (hasWrongAnswer = CheckBoxWrong.isChecked() == false))) {
            score = score + 1;
        } else {
            score = score;
        }
        //Scoring for question 4, which is text-input
        EditText answerQuestion4 = (EditText) findViewById(R.id.q4AnswerField);
        String answerOfQuestion4 = answerQuestion4.getText().toString();
        if (answerOfQuestion4.equals(getString(R.string.q4a))) {
            score = score + 1;
        } else {
            score = score;
        }
        {
            score = score;
        }
        //Scoring for question 5, which is text-input
        EditText answerQuestion5 = (EditText) findViewById(R.id.q5AnswerField);
        String answerOfQuestion5 = answerQuestion5.getText().toString();
        if (answerOfQuestion5.equals(getString(R.string.q5a))) {
            score = score + 1;
        } else {
            score = score;
        }
        {
            score = score;
        }
        //Scoring for question seven, which is text-input
        EditText answerQuestion7 = (EditText) findViewById(R.id.q7AnswerField);
        String answerOfQuestion7 = answerQuestion7.getText().toString();
        if (answerOfQuestion7.equals(getString(R.string.q7a))) {
            score = score + 1;
        } else {
            score = score;
        }
        {
            score = score;
        }
        //Scoring for question nine, which is text-input
        EditText answerQuestion9 = (EditText) findViewById(R.id.q9AnswerField);
        String answerOfQuestion9 = answerQuestion9.getText().toString();
        if (answerOfQuestion9.equals(getString(R.string.q9a))) {
            score = score + 1;
        } else {
            score = score;
        }
        {
            score = score;
        }
        //Scoring for question nine, which is text-input
        EditText answerQuestion10 = (EditText) findViewById(R.id.q10AnswerField);
        String answerOfQuestion10 = answerQuestion10.getText().toString();
        if (answerOfQuestion10.equals(getString(R.string.q10a))) {
            score = score + 1;
        } else {
            score = score;
        }
        {
            score = score;
        }

        //Scoring for the mystery round, which are text-input
        EditText answerQuestionmr1 = (EditText) findViewById(R.id.mr1AnswerField);
        String answerOfQuestionmr1 = answerQuestionmr1.getText().toString();
        if (answerOfQuestionmr1.equals(getString(R.string.mr1a))) {
            score = score + 2;
        } else {
            score = score;
        }
        {
            score = score;
        }
        EditText answerQuestionmr2 = (EditText) findViewById(R.id.mr2AnswerField);
        String answerOfQuestionmr2 = answerQuestionmr2.getText().toString();
        if (answerOfQuestionmr2.equals(getString(R.string.mr2a))) {
            score = score + 2;
        } else {
            score = score;
        }
        {
            score = score;
        }
        EditText answerQuestionmr3 = (EditText) findViewById(R.id.mr3AnswerField);
        String answerOfQuestionmr3 = answerQuestionmr3.getText().toString();
        if (answerOfQuestionmr3.equals(getString(R.string.mr3a))) {
            score = score + 2;
        } else {
            score = score;
        }
        {
            score = score;
        }
        EditText answerQuestionmr4 = (EditText) findViewById(R.id.mr4AnswerField);
        String answerOfQuestionmr4 = answerQuestionmr4.getText().toString();
        if (answerOfQuestionmr4.equals(getString(R.string.mr4a))) {
            score = score + 2;
        } else {
            score = score;
        }
        //scoring for final question
        EditText answerFinalQuestion1 = (EditText) findViewById(R.id.fqAnswerField1);
        String answerOfFinalQuestion1 = answerFinalQuestion1.getText().toString();
        EditText answerFinalQuestion2 = (EditText) findViewById(R.id.fqAnswerField2);
        String answerOfFinalQuestion2 = answerFinalQuestion2.getText().toString();
        //int finalQuestionRight;
        if (answerOfFinalQuestion1.equals(getString(R.string.fqRightAnswer1))) {
            finalQuestionRight = 1;
        } else if (answerOfFinalQuestion1.equals(getString(R.string.fqRightAnswer2))) {
            finalQuestionRight = 1;
        } else if (answerOfFinalQuestion1.equals(getString(R.string.fqRightAnswer3))) {
            finalQuestionRight = 1;
        } else if (answerOfFinalQuestion1.equals(getString(R.string.fqRightAnswer4)))
            finalQuestionRight = 1;

        if (answerOfFinalQuestion2.equals(getString(R.string.fqRightAnswer1))) {
            finalQuestionRight = finalQuestionRight + 1 ;
        } else if (answerOfFinalQuestion2.equals(getString(R.string.fqRightAnswer2))) {
            finalQuestionRight = finalQuestionRight + 1 ;
        } else if (answerOfFinalQuestion2.equals(getString(R.string.fqRightAnswer3))) {
            finalQuestionRight = finalQuestionRight + 1 ;
        } else if (answerOfFinalQuestion2.equals(getString(R.string.fqRightAnswer4)))
            finalQuestionRight = finalQuestionRight + 1 ;

        if (finalQuestionRight >= 2) {
       score = score + quantity;
        } else

    {
        score = score - quantity;
    }

        Toast.makeText(this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
        // Toast that shows the score achieved on the screen
        displayScore(createScoreMessage(score));
        // We call this method to show the score and a message on the screen
    }

    /**
     * Populates and displays the score message
     *
     * @param score the current state of the score
     */
    private String createScoreMessage(int score) {
        String scoremessage;
        EditText playerNameField = (EditText) findViewById(R.id.nameField);
        String nameOfPlayer = playerNameField.getText().toString();
        if (score >= 10) {
            scoremessage = "Excellent work " + nameOfPlayer + "," +
                    "\nYour score is: " + this.score;
            return scoremessage;
        }
        if (score >= 5) {
            scoremessage = "Meh, " + nameOfPlayer +
                    "\nYou could probably do better" +
                    " \nYour score is: " + this.score;
            return scoremessage;
        } else {
            scoremessage = "Uh-oh " + nameOfPlayer + "! " +
                    " \nYour score is: " + this.score;
            return scoremessage;
        }
    }

    /**
     * This method displays the score value and message on the screen.
     */
    private void displayScore(String message) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText(message);
    }

    /**
     * This method restart or "reset" the App.
     */
    public void resetButton(View view) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        startActivity(i);
    }
}

