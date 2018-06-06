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
    //Global variable for determining whether final question is correct
    int finalQuestionRight;
    //global variable for quantity of points wagered
    int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method increases the amount of points wagered.
    //The maximum amount of points wagered is 10.
    //A toast is displayed if user tries to add more than 10.
    public void increment(View view) {

        if (quantity >= 10) {
            Toast.makeText(this, getString(R.string.max), Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);

    }


    //This method decreases the amount of points wagered
    //The minimum amount of points is 0
    //A toast is displayed if user tries to subtract from zero
    public void decrement(View view) {

        if (quantity < 1) {
            Toast.makeText(this, getString(R.string.min), Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);

    }

    //This method displays the given quantity value on the screen.
    private void displayQuantity(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(number);
    }


    //This method displays the final question once the wager is submitted
    public void displayFinalQuestion(View view) {
        TextView fq_text_view = findViewById(R.id.fq_text_view);
        fq_text_view.setVisibility(View.VISIBLE);
    }

    // This method is called when the submit Button is clicked
    public void scoreButtonClicked(View view) {

        // Scoring for Question 1, which is a radio button
        RadioButton q1RightAnswer = findViewById(R.id.radio_q1c3);
        if (q1RightAnswer.isChecked()) {
            score = score + 1;
        }

        // Scoring for Question 3, which is a radio button
        RadioButton q3RightAnswer = findViewById(R.id.radio_q3c1);
        if (q3RightAnswer.isChecked()) {
            score = score + 1;
        }


        // Scoring for Question 6, which is a radio button
        RadioButton q6RightAnswer = findViewById(R.id.radio_q6c3);
        if (q6RightAnswer.isChecked()) {
            score = score + 1;
        }

        // Scoring for Question 8, which is a radio button
        RadioButton q8RightAnswer = findViewById(R.id.radio_q8c1);
        if (q8RightAnswer.isChecked()) {
            score = score + 1;
        }

        //Scoring for question 4, which is check boxes
        CheckBox CheckBoxRightOne = findViewById(R.id.q2c1_checkbox);
        CheckBox CheckBoxRightTwo = findViewById(R.id.q2c2checkbox);
        CheckBox CheckBoxWrong = findViewById(R.id.q2c3checkbox);
        CheckBox CheckBoxRightThree = findViewById(R.id.q2c4checkbox);
        if (CheckBoxRightOne.isChecked() && CheckBoxRightTwo.isChecked() && CheckBoxRightThree.isChecked() && !CheckBoxWrong.isChecked()) {
            score = score + 1;
        }

        EditText answerQuestion4 = findViewById(R.id.q4AnswerField);
        String answerOfQuestion4 = answerQuestion4.getText().toString();
        if (answerOfQuestion4.equalsIgnoreCase(getString(R.string.q4a))) {
            score = score + 1;
        }

        //Scoring for question 5, which is text-input
        EditText answerQuestion5 = findViewById(R.id.q5AnswerField);
        String answerOfQuestion5 = answerQuestion5.getText().toString().trim();
        if (answerOfQuestion5.equalsIgnoreCase(getString(R.string.q5a))) {
            score = score + 1;
        }

        //Scoring for question 7, which is text-input
        EditText answerQuestion7 = findViewById(R.id.q7AnswerField);
        String answerOfQuestion7 = answerQuestion7.getText().toString().trim();
        if (answerOfQuestion7.equalsIgnoreCase(getString(R.string.q7a))) {
            score = score + 1;
        }
        //Scoring for question 9, which is text-input
        EditText answerQuestion9 = findViewById(R.id.q9AnswerField);
        String answerOfQuestion9 = answerQuestion9.getText().toString().trim();
        if (answerOfQuestion9.equalsIgnoreCase(getString(R.string.q9a))) {
            score = score + 1;
        }

        //Scoring for question nine, which is text-input
        EditText answerQuestion10 = findViewById(R.id.q10AnswerField);
        String answerOfQuestion10 = answerQuestion10.getText().toString().trim();
        if (answerOfQuestion10.equalsIgnoreCase(getString(R.string.q10a))) {
            score = score + 1;
        }


        //Scoring for the mystery round, which are text-input
        EditText answerQuestionmr1 = findViewById(R.id.mr1AnswerField);
        String answerOfQuestionmr1 = answerQuestionmr1.getText().toString().trim();
        if (answerOfQuestionmr1.equalsIgnoreCase(getString(R.string.mr1a))) {
            score = score + 2;
        }

        EditText answerQuestionmr2 = findViewById(R.id.mr2AnswerField);
        String answerOfQuestionmr2 = answerQuestionmr2.getText().toString().trim();
        if (answerOfQuestionmr2.equalsIgnoreCase(getString(R.string.mr2a))) {
            score = score + 2;
        }

        EditText answerQuestionmr3 = findViewById(R.id.mr3AnswerField);
        String answerOfQuestionmr3 = answerQuestionmr3.getText().toString().trim();
        if (answerOfQuestionmr3.equalsIgnoreCase(getString(R.string.mr3a))) {
            score = score + 2;
        }

        EditText answerQuestionmr4 = findViewById(R.id.mr4AnswerField);
        String answerOfQuestionmr4 = answerQuestionmr4.getText().toString().trim();
        if (answerOfQuestionmr4.equalsIgnoreCase(getString(R.string.mr4a))) {
            score = score + 2;
        }
        //scoring for final question
        EditText answerFinalQuestion1 = findViewById(R.id.fqAnswerField1);
        String answerOfFinalQuestion1 = answerFinalQuestion1.getText().toString().trim();
        EditText answerFinalQuestion2 = findViewById(R.id.fqAnswerField2);
        String answerOfFinalQuestion2 = answerFinalQuestion2.getText().toString().trim();
        if (answerOfFinalQuestion1.equalsIgnoreCase(getString(R.string.fqRightAnswer1))) {
            finalQuestionRight = 1;
        } else if (answerOfFinalQuestion1.equalsIgnoreCase(getString(R.string.fqRightAnswer2))) {
            finalQuestionRight = 1;
        } else if (answerOfFinalQuestion1.equalsIgnoreCase(getString(R.string.fqRightAnswer3))) {
            finalQuestionRight = 1;
        } else if (answerOfFinalQuestion1.equalsIgnoreCase(getString(R.string.fqRightAnswer4)))
            finalQuestionRight = 1;

        if (answerOfFinalQuestion2.equalsIgnoreCase(getString(R.string.fqRightAnswer1))) {
            finalQuestionRight = finalQuestionRight + 1;
        } else if (answerOfFinalQuestion2.equalsIgnoreCase(getString(R.string.fqRightAnswer2))) {
            finalQuestionRight = finalQuestionRight + 1;
        } else if (answerOfFinalQuestion2.equalsIgnoreCase(getString(R.string.fqRightAnswer3))) {
            finalQuestionRight = finalQuestionRight + 1;
        } else if (answerOfFinalQuestion2.equalsIgnoreCase(getString(R.string.fqRightAnswer4)))
            finalQuestionRight = finalQuestionRight + 1;

        if (finalQuestionRight >= 2) {
            score = score + quantity;
        } else

        {
            score = score - quantity;
        }
        // Toast that shows the score achieved on the screen
        Toast.makeText(this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
        // We call this method to show the score and a message on the screen
        displayScore(createScoreMessage(score));
        // Reset the score after it has been displayed.
        score = 0;

    }

    //Populates and displays the score message
    // @param score the current state of the score
    private String createScoreMessage(int score) {
        String scoremessage;
        EditText playerNameField = findViewById(R.id.nameField);
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

    //This method displays the score value and message on the screen.
    private void displayScore(String message) {
        TextView scoreTextView = findViewById(R.id.score_text_view);
        scoreTextView.setText(message);
    }

    //This method clears all answers and scrolls the view to the top
    public void resetButton(View view) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        startActivity(i);
    }
}

