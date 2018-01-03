package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int points = 0;
    int quizComplete = 0;

    /**
     * The method checks if the answer for first question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ1() {
        CheckBox q1_a1 = (CheckBox) findViewById(R.id.question_1_a1);
        CheckBox q1_a2 = (CheckBox) findViewById(R.id.question_1_a2);
        CheckBox q1_a3 = (CheckBox) findViewById(R.id.question_1_a3);
        CheckBox q1_a4 = (CheckBox) findViewById(R.id.question_1_a4);
        if (q1_a3.isChecked() == true) {
            points += 10;
        } else if (q1_a1.isChecked() == true) {
            q1_a1.setTextColor(Color.parseColor("#FF0000"));
        } else if (q1_a2.isChecked() == true) {
            q1_a2.setTextColor(Color.parseColor("#FF0000"));
        } else {
            q1_a4.setTextColor(Color.parseColor("#FF0000"));
        }
        q1_a3.setTextColor(Color.parseColor("#4CAF50"));
    }

    /**
     * The method checks if the answer for second question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ2() {
        CheckBox q2_a1 = (CheckBox) findViewById(R.id.question_2_a1);
        CheckBox q2_a2 = (CheckBox) findViewById(R.id.question_2_a2);
        CheckBox q2_a3 = (CheckBox) findViewById(R.id.question_2_a3);
        CheckBox q2_a4 = (CheckBox) findViewById(R.id.question_2_a4);
        if (q2_a3.isChecked() == true) {
            points += 10;
        } else if (q2_a1.isChecked() == true) {
            q2_a1.setTextColor(Color.parseColor("#FF0000"));
        } else if (q2_a2.isChecked() == true) {
            q2_a2.setTextColor(Color.parseColor("#FF0000"));
        } else {
            q2_a4.setTextColor(Color.parseColor("#FF0000"));
        }
        q2_a3.setTextColor(Color.parseColor("#4CAF50"));
    }

    /**
     * The method checks if the answer for third question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ3() {
        CheckBox q3_a1 = (CheckBox) findViewById(R.id.question_3_a1);
        CheckBox q3_a2 = (CheckBox) findViewById(R.id.question_3_a2);
        CheckBox q3_a3 = (CheckBox) findViewById(R.id.question_3_a3);
        CheckBox q3_a4 = (CheckBox) findViewById(R.id.question_3_a4);
        if (q3_a1.isChecked() == true) {
            points += 10;
        } else if (q3_a2.isChecked() == true) {
            q3_a2.setTextColor(Color.parseColor("#FF0000"));
        } else if (q3_a3.isChecked() == true) {
            q3_a3.setTextColor(Color.parseColor("#FF0000"));
        } else {
            q3_a4.setTextColor(Color.parseColor("#FF0000"));
        }
        q3_a1.setTextColor(Color.parseColor("#4CAF50"));
    }

    /**
     * The method checks if the answer for fourth question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ4() {
        EditText ans = (EditText) findViewById(R.id.question_4);
        if (ans.getText().toString().equalsIgnoreCase("France")) {
            points += 10;
        }
        TextView correctAnswer = (TextView) findViewById(R.id.correct_ans_q4);
        correctAnswer.setText(getResources().getString(R.string.correct_ans_4));
    }

    /**
     * The method checks if the answer for fifth question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ5() {
        RadioButton q5_a1 = (RadioButton) findViewById(R.id.question_5_a1);
        RadioButton q5_a2 = (RadioButton) findViewById(R.id.question_5_a2);
        if (q5_a1.isChecked() == true) {
            points += 10;
        } else {
            q5_a2.setTextColor(Color.parseColor("#FF0000"));
        }
        q5_a1.setTextColor(Color.parseColor("#4CAF50"));
    }

    /**
     * The method checks if the answer for sixth question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ6() {
        CheckBox q6_a1 = (CheckBox) findViewById(R.id.question_6_a1);
        CheckBox q6_a2 = (CheckBox) findViewById(R.id.question_6_a2);
        CheckBox q6_a3 = (CheckBox) findViewById(R.id.question_6_a3);
        CheckBox q6_a4 = (CheckBox) findViewById(R.id.question_6_a4);
        if (q6_a1.isChecked() == true) {
            points += 10;
        } else if (q6_a2.isChecked() == true) {
            q6_a2.setTextColor(Color.parseColor("#FF0000"));
        } else if (q6_a3.isChecked() == true) {
            q6_a3.setTextColor(Color.parseColor("#FF0000"));
        } else {
            q6_a4.setTextColor(Color.parseColor("#FF0000"));
        }
        q6_a1.setTextColor(Color.parseColor("#4CAF50"));
    }

    /**
     * The method checks if the answer for seventh question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ7() {
        CheckBox q7_a1 = (CheckBox) findViewById(R.id.question_7_a1);
        CheckBox q7_a2 = (CheckBox) findViewById(R.id.question_7_a2);
        CheckBox q7_a3 = (CheckBox) findViewById(R.id.question_7_a3);
        CheckBox q7_a4 = (CheckBox) findViewById(R.id.question_7_a4);
        if (q7_a2.isChecked() == true) {
            points += 10;
        } else if (q7_a1.isChecked() == true) {
            q7_a1.setTextColor(Color.parseColor("#FF0000"));
        } else if (q7_a3.isChecked() == true) {
            q7_a3.setTextColor(Color.parseColor("#FF0000"));
        } else {
            q7_a4.setTextColor(Color.parseColor("#FF0000"));
        }
        q7_a2.setTextColor(Color.parseColor("#4CAF50"));
    }

    /**
     * The method checks if the answer for eighth question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ8() {
        CheckBox q8_a1 = (CheckBox) findViewById(R.id.question_8_a1);
        CheckBox q8_a2 = (CheckBox) findViewById(R.id.question_8_a2);
        CheckBox q8_a3 = (CheckBox) findViewById(R.id.question_8_a3);
        CheckBox q8_a4 = (CheckBox) findViewById(R.id.question_8_a4);
        if (q8_a3.isChecked() == true) {
            points += 10;
        } else if (q8_a1.isChecked() == true) {
            q8_a1.setTextColor(Color.parseColor("#FF0000"));
        } else if (q8_a2.isChecked() == true) {
            q8_a2.setTextColor(Color.parseColor("#FF0000"));
        } else {
            q8_a4.setTextColor(Color.parseColor("#FF0000"));
        }
        q8_a3.setTextColor(Color.parseColor("#4CAF50"));
    }

    /**
     * The method checks if the answer for ninth question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ9() {
        CheckBox q9_a1 = (CheckBox) findViewById(R.id.question_9_a1);
        CheckBox q9_a2 = (CheckBox) findViewById(R.id.question_9_a2);
        CheckBox q9_a3 = (CheckBox) findViewById(R.id.question_9_a3);
        CheckBox q9_a4 = (CheckBox) findViewById(R.id.question_9_a4);
        if (q9_a2.isChecked() == true) {
            points += 10;
        } else if (q9_a1.isChecked() == true) {
            q9_a1.setTextColor(Color.parseColor("#FF0000"));
        } else if (q9_a3.isChecked() == true) {
            q9_a3.setTextColor(Color.parseColor("#FF0000"));
        } else {
            q9_a4.setTextColor(Color.parseColor("#FF0000"));
        }
        q9_a2.setTextColor(Color.parseColor("#4CAF50"));
    }

    /**
     * The method checks if the answer for tenth question is correct.
     * It will also highlight the correct answer.
     */

    public void isCorrectQ10() {
        RadioButton q10_a1 = (RadioButton) findViewById(R.id.question_10_a1);
        RadioButton q10_a2 = (RadioButton) findViewById(R.id.question_10_a2);
        if (q10_a1.isChecked() == true) {
            points += 10;
        } else {
            q10_a2.setTextColor(Color.parseColor("#FF0000"));
        }
        q10_a1.setTextColor(Color.parseColor("#4CAF50"));
    }

    /**
     * Checks the number of answers for question 1.
     *
     * @return The number of answers.
     */

    public int question1Input() {
        int check_count = 0;
        CheckBox q1_a1 = (CheckBox) findViewById(R.id.question_1_a1);
        CheckBox q1_a2 = (CheckBox) findViewById(R.id.question_1_a2);
        CheckBox q1_a3 = (CheckBox) findViewById(R.id.question_1_a3);
        CheckBox q1_a4 = (CheckBox) findViewById(R.id.question_1_a4);
        if (q1_a1.isChecked()) check_count += 1;
        if (q1_a2.isChecked()) check_count += 1;
        if (q1_a3.isChecked()) check_count += 1;
        if (q1_a4.isChecked()) check_count += 1;
        return check_count;
    }

    /**
     * Checks the number of answers for question 2.
     *
     * @return The number of answers.
     */

    public int question2Input() {
        int check_count = 0;
        CheckBox q2_a1 = (CheckBox) findViewById(R.id.question_2_a1);
        CheckBox q2_a2 = (CheckBox) findViewById(R.id.question_2_a2);
        CheckBox q2_a3 = (CheckBox) findViewById(R.id.question_2_a3);
        CheckBox q2_a4 = (CheckBox) findViewById(R.id.question_2_a4);
        if (q2_a1.isChecked()) check_count += 1;
        if (q2_a2.isChecked()) check_count += 1;
        if (q2_a3.isChecked()) check_count += 1;
        if (q2_a4.isChecked()) check_count += 1;
        return check_count;
    }

    /**
     * Checks the number of answers for question 3.
     *
     * @return The number of answers.
     */

    public int question3Input() {
        int check_count = 0;
        CheckBox q3_a1 = (CheckBox) findViewById(R.id.question_3_a1);
        CheckBox q3_a2 = (CheckBox) findViewById(R.id.question_3_a2);
        CheckBox q3_a3 = (CheckBox) findViewById(R.id.question_3_a3);
        CheckBox q3_a4 = (CheckBox) findViewById(R.id.question_3_a4);
        if (q3_a1.isChecked()) check_count += 1;
        if (q3_a2.isChecked()) check_count += 1;
        if (q3_a3.isChecked()) check_count += 1;
        if (q3_a4.isChecked()) check_count += 1;
        return check_count;
    }

    /**
     * Checks the number of answers for question 5.
     *
     * @return The number of answers.
     */

    public int question5Input() {
        int check_count = 0;
        RadioButton q5_a1 = (RadioButton) findViewById(R.id.question_5_a1);
        RadioButton q5_a2 = (RadioButton) findViewById(R.id.question_5_a2);
        if (q5_a1.isChecked()) check_count += 1;
        if (q5_a2.isChecked()) check_count += 1;
        return check_count;
    }

    /**
     * Checks the number of answers for question 6.
     *
     * @return The number of answers.
     */

    public int question6Input() {
        int check_count = 0;
        CheckBox q6_a1 = (CheckBox) findViewById(R.id.question_6_a1);
        CheckBox q6_a2 = (CheckBox) findViewById(R.id.question_6_a2);
        CheckBox q6_a3 = (CheckBox) findViewById(R.id.question_6_a3);
        CheckBox q6_a4 = (CheckBox) findViewById(R.id.question_6_a4);
        if (q6_a1.isChecked()) check_count += 1;
        if (q6_a2.isChecked()) check_count += 1;
        if (q6_a3.isChecked()) check_count += 1;
        if (q6_a4.isChecked()) check_count += 1;
        return check_count;
    }

    /**
     * Checks the number of answers for question 7.
     *
     * @return The number of answers.
     */

    public int question7Input() {
        int check_count = 0;
        CheckBox q7_a1 = (CheckBox) findViewById(R.id.question_7_a1);
        CheckBox q7_a2 = (CheckBox) findViewById(R.id.question_7_a2);
        CheckBox q7_a3 = (CheckBox) findViewById(R.id.question_7_a3);
        CheckBox q7_a4 = (CheckBox) findViewById(R.id.question_7_a4);
        if (q7_a1.isChecked()) check_count += 1;
        if (q7_a2.isChecked()) check_count += 1;
        if (q7_a3.isChecked()) check_count += 1;
        if (q7_a4.isChecked()) check_count += 1;
        return check_count;
    }

    /**
     * Checks the number of answers for question 8.
     *
     * @return The number of answers.
     */

    public int question8Input() {
        int check_count = 0;
        CheckBox q8_a1 = (CheckBox) findViewById(R.id.question_8_a1);
        CheckBox q8_a2 = (CheckBox) findViewById(R.id.question_8_a2);
        CheckBox q8_a3 = (CheckBox) findViewById(R.id.question_8_a3);
        CheckBox q8_a4 = (CheckBox) findViewById(R.id.question_8_a4);
        if (q8_a1.isChecked()) check_count += 1;
        if (q8_a2.isChecked()) check_count += 1;
        if (q8_a3.isChecked()) check_count += 1;
        if (q8_a4.isChecked()) check_count += 1;
        return check_count;
    }

    /**
     * Checks the number of answers for question 9.
     *
     * @return The number of answers.
     */

    public int question9Input() {
        int check_count = 0;
        CheckBox q9_a1 = (CheckBox) findViewById(R.id.question_9_a1);
        CheckBox q9_a2 = (CheckBox) findViewById(R.id.question_9_a2);
        CheckBox q9_a3 = (CheckBox) findViewById(R.id.question_9_a3);
        CheckBox q9_a4 = (CheckBox) findViewById(R.id.question_9_a4);
        if (q9_a1.isChecked()) check_count += 1;
        if (q9_a2.isChecked()) check_count += 1;
        if (q9_a3.isChecked()) check_count += 1;
        if (q9_a4.isChecked()) check_count += 1;
        return check_count;
    }

    /**
     * Checks the number of answers for question 10.
     *
     * @return The number of answers.
     */

    public int question10Input() {
        int check_count = 0;
        RadioButton q10_a1 = (RadioButton) findViewById(R.id.question_10_a1);
        RadioButton q10_a2 = (RadioButton) findViewById(R.id.question_10_a2);
        if (q10_a1.isChecked()) check_count += 1;
        if (q10_a2.isChecked()) check_count += 1;
        return check_count;
    }

    public void displayScore(View view) {
        if (question1Input() == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q1_0), Toast.LENGTH_SHORT).show();
            return;
        } else if (question1Input() != 1) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q1_m), Toast.LENGTH_SHORT).show();
            return;
        }
        if (question2Input() == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q2_0), Toast.LENGTH_SHORT).show();
            return;
        } else if (question2Input() != 1) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q2_m), Toast.LENGTH_SHORT).show();
            return;
        }
        if (question3Input() == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q3_0), Toast.LENGTH_SHORT).show();
            return;
        } else if (question3Input() != 1) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q3_m), Toast.LENGTH_SHORT).show();
            return;
        }
        EditText ans = (EditText) findViewById(R.id.question_4);
        if (ans.getText().toString().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q4_0), Toast.LENGTH_SHORT).show();
            return;
        }
        if (question5Input() == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q5_0), Toast.LENGTH_SHORT).show();
            return;
        }
        if (question6Input() == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q6_0), Toast.LENGTH_SHORT).show();
            return;
        } else if (question6Input() != 1) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q6_m), Toast.LENGTH_SHORT).show();
            return;
        }
        if (question7Input() == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q7_0), Toast.LENGTH_SHORT).show();
            return;
        } else if (question7Input() != 1) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q7_m), Toast.LENGTH_SHORT).show();
            return;
        }
        if (question8Input() == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q8_0), Toast.LENGTH_SHORT).show();
            return;
        } else if (question8Input() != 1) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q8_m), Toast.LENGTH_SHORT).show();
            return;
        }
        if (question9Input() == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q9_0), Toast.LENGTH_SHORT).show();
            return;
        } else if (question9Input() != 1) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q9_m), Toast.LENGTH_SHORT).show();
            return;
        }
        if (question10Input() == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.q10_0), Toast.LENGTH_SHORT).show();
            return;
        }
        quizComplete = 1;
        points = 0;
        isCorrectQ1();
        isCorrectQ2();
        isCorrectQ3();
        isCorrectQ4();
        isCorrectQ5();
        isCorrectQ6();
        isCorrectQ7();
        isCorrectQ8();
        isCorrectQ9();
        isCorrectQ10();
        TextView score = (TextView) findViewById(R.id.score_text_view);
        score.setText(getResources().getString(R.string.text_box) + " " + points + " " + getResources().getString(R.string.text_box_2));
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.text_box) + " " + points + " " + getResources().getString(R.string.text_box_2), Toast.LENGTH_SHORT).show();
    }

    /**
     * Method used to share the score.
     */
    public void shareScore(View view) {
        if (quizComplete == 0) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.no_intent), Toast.LENGTH_SHORT).show();
            return;
        }
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, getResources().getString(R.string.intent_1) + " " + points + " " + getResources().getString(R.string.intent_2));
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
