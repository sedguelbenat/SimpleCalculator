package com.example.sedar.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button sumButton,subButton,mulButton,divButton;
    double number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //First we search for the Buttons in our layout and create an Object.
        sumButton = findViewById(R.id.calculateSumButton);
        subButton = findViewById(R.id.calculateDifferenceButton);
        mulButton = findViewById(R.id.calculateProductButton);
        divButton = findViewById(R.id.calculateQuotientButton);

        //Then we add an OnClickListener.
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumbers();
                calculateSum();
            }
        });


        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumbers();
                calculateDifference();
            }
        });


        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumbers();
                calculateProduct();
            }
        });


        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumbers();
                calculateQuotient();
            }
        });
    }

    public void readNumbers(){
        EditText number1EditText = findViewById(R.id.number1Text);
        EditText number2EditText = findViewById(R.id.number2Text);

        number1 = Double.parseDouble(number1EditText.getText().toString());
        number2 = Double.parseDouble(number2EditText.getText().toString());
    }

    private void calculateSum(){
        Double sum = number1 + number2;
        Toast.makeText(getApplicationContext(),sum + "",Toast.LENGTH_LONG).show();
    }

    private void calculateDifference(){
        Double difference = number1 - number2;
        Toast.makeText(getApplicationContext(),difference + "",Toast.LENGTH_LONG).show();
    }

    private void calculateProduct(){
        Double product = number1 * number2;
        Toast.makeText(getApplicationContext(),product + "",Toast.LENGTH_LONG).show();
    }

    private void calculateQuotient(){
        Double quotient = number1 / number2;
        Toast.makeText(getApplicationContext(),quotient + "",Toast.LENGTH_LONG).show();
    }
}