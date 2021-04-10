package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/* This is a class that contains variables and methods*/
public class MainActivity extends AppCompatActivity {
    /*Global variable*/
    int score;
    /*int mountains = 1, parks = 1, castles = 1;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*name field*
    Where the method is CALLED*/
    public void submit(View view) {
        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        /*Question 1*/
        RadioButton redRadioButton = findViewById(R.id.red);
        boolean hasRed = redRadioButton.isChecked();
        if (hasRed) {
            score = 0;
        }
        RadioButton deadRadioButton = findViewById(R.id.dead);
        boolean hasDead = deadRadioButton.isChecked();
        if (hasDead) {
            score = 1;
        }
        RadioButton blackRadioButton = findViewById(R.id.black);
        boolean hasBlack = blackRadioButton.isChecked();
        if (hasBlack) {
            score = 0;
        }

        /*question 2*/
        EditText jordan = findViewById(R.id.jordan);
        String answer = jordan.getText().toString();
        if (answer.equalsIgnoreCase("Jordan")) {
            score++;
        }

        /*question 3*/
        CheckBox mountainsCheckBox = findViewById(R.id.mountains);
        boolean hasMountains = mountainsCheckBox.isChecked();

        CheckBox parksCheckBox = findViewById(R.id.parks);
        boolean hasParks = parksCheckBox.isChecked();

        CheckBox castlesCheckBox = findViewById(R.id.castles);
        boolean hasCastles = castlesCheckBox.isChecked();
        if (hasMountains) {
            score++;
        }
        if (hasParks) {
            score++;
        }
        if (hasCastles) {
            score++;
        }

        /*question 4*/
        EditText salar = findViewById(R.id.salar);
        String answerB = salar.getText().toString();
        if (answerB.equalsIgnoreCase("Salar de Uyuni")) {
            score++;
        }

        /*question 5*/
        CheckBox chinuaCheckBox = findViewById(R.id.chinua);
        boolean hasChinua = chinuaCheckBox.isChecked();

        CheckBox ngugiCheckBox = findViewById(R.id.ngugi);
        boolean hasNgugi = ngugiCheckBox.isChecked();

        CheckBox kwameCheckBox = findViewById(R.id.kwame);
        boolean hasKwame = kwameCheckBox.isChecked();

        CheckBox chimamandaCheckBox = findViewById(R.id.chimamanda);
        boolean hasChimamanda = chimamandaCheckBox.isChecked();

        if (hasChinua) {
            score++;
        }
        if (hasNgugi) {
            score++;
        }
        if (hasKwame) {
            score++;
        }
        if (hasChimamanda) {
            score++;
        }
        /*question 6*/
        RadioButton pythonRadioButton = findViewById(R.id.python);
        boolean hasPython = pythonRadioButton.isChecked();
        if (hasPython) {
            score = 0;
        }
        RadioButton kotlinRadioButton = findViewById(R.id.kotlin);
        boolean hasKotlin = kotlinRadioButton.isChecked();
        if (hasKotlin) {
            score = 0;
        }
        RadioButton javaRadioButton = findViewById(R.id.java);
        boolean hasJava = javaRadioButton.isChecked();
        if (hasJava) {
            score++;
        }

        /*question 7*/
        EditText nobel = findViewById(R.id.nobel);
        String answerC = nobel.getText().toString();
        if (answerC.equalsIgnoreCase("Wangari Maathia | Ellen Johnson Sirleaf | Leymah Gbowee")) {
            score++;
        }

        /*question 8*/
        RadioButton banskyRadioButton = findViewById(R.id.bansky);
        boolean hasBansky = banskyRadioButton.isChecked();
        if (hasBansky) {
            score = 0;
        }
        RadioButton tavarRadioButton = findViewById(R.id.tavar);
        boolean hasTaver = tavarRadioButton.isChecked();
        if (hasTaver) {
            score++;
        }
        RadioButton spyRadioButton = findViewById(R.id.spy);
        boolean hasSpy = spyRadioButton.isChecked();
        if (hasSpy) {
            score = 0;
        }

        if (score == 13) {
            Toast.makeText(this, "13/13 Excellent!", Toast.LENGTH_SHORT).show();
        }
        if (score == 12) {
            Toast.makeText(this, "12/13 Great Job!", Toast.LENGTH_SHORT).show();
        }
        if (score == 11) {
            Toast.makeText(this, "11/13 Great Job!", Toast.LENGTH_SHORT).show();
        }
        if (score == 10) {
            Toast.makeText(this, "10/13 Good Job!", Toast.LENGTH_SHORT).show();
        }
        if (score == 9) {
            Toast.makeText(this, "9/13 Good Job!", Toast.LENGTH_SHORT).show();
        }
        if (score == 8) {
            Toast.makeText(this, "8/13 You Can DO This!", Toast.LENGTH_SHORT).show();
        }
        if (score == 7) {
            Toast.makeText(this, "7/13 You Got This!", Toast.LENGTH_SHORT).show();
        }
        if (score == 6) {
            Toast.makeText(this, "6/13 Try Again!", Toast.LENGTH_SHORT).show();
        }
        if (score == 5) {
            Toast.makeText(this, "5/13 Try Again!", Toast.LENGTH_SHORT).show();
        }
        if (score == 4) {
            Toast.makeText(this, "4/13 Try Harder!", Toast.LENGTH_SHORT).show();
        }
        if (score == 3) {
            Toast.makeText(this, "3/13 Don't give up, try again!", Toast.LENGTH_SHORT).show();
        }
        if (score == 2) {
            Toast.makeText(this, "2/13 Try extra hard!", Toast.LENGTH_SHORT).show();
        }
        if (score == 1) {
            Toast.makeText(this, "1/13 Keep Trying!", Toast.LENGTH_SHORT).show();
        }
        if (score == 0) {
            Toast.makeText(this, "0/13 Just Google It :-)", Toast.LENGTH_SHORT).show();
        }
        score = 0;
    }
    public void reset (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

            Toast.makeText(this,"Correct Answers \n1.Dead Sea \n2.Jordan \n3.Select all \n4.Salar de Uyuni" +
                    "\n5.Select all \n6.Java \n7.Wangari Maathia,Ellen Johnson Sirleaf and Leymah Gbowee \n8.Tavar Zawacki",Toast.LENGTH_LONG).show();
    }

}

