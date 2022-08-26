package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        double sum;

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            sum = num1 + num2;
            String strResult = ""+ sum;
            // Integer check from https://stackoverflow.com/a/9909417
            // Reasoning: If a double mod 1 gives a remainder of 0, it means
            // 1 fits into the number, so it is an integer.
            if(num1 % 1 == 0 && num2 % 1 == 0){
                strResult = strResult.substring(0,strResult.length()-2);
            }
            numberSumTV.setText(strResult);
        } catch (Exception e){
            numberSumTV.setText("Input valid numbers!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        double difference;

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            difference = num1 - num2;
            String strResult = ""+ difference;
            // Integer check from https://stackoverflow.com/a/9909417
            // Reasoning: If a double mod 1 gives a remainder of 0, it means
            // 1 fits into the number, so it is an integer.
            if(num1 % 1 == 0 && num2 % 1 == 0){
                strResult = strResult.substring(0,strResult.length()-2);
            }
            numberSumTV.setText(strResult);
        } catch (Exception e){
            numberSumTV.setText("Input valid numbers!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double product;

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            product = num1 * num2;
            String strResult = ""+ product;
            // Integer check from https://stackoverflow.com/a/9909417
            // Reasoning: If a double mod 1 gives a remainder of 0, it means
            // 1 fits into the number, so it is an integer.
            if(num1 % 1 == 0 && num2 % 1 == 0){
                strResult = strResult.substring(0,strResult.length()-2);
            }
            numberSumTV.setText(strResult);
        } catch (Exception e){
            numberSumTV.setText("Input valid numbers!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        double quotient;

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            quotient = num1 / num2;
            String strResult = ""+ quotient; //still double because int division can be double
            numberSumTV.setText(strResult);
        } catch (Exception e){
            numberSumTV.setText("Input valid numbers!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void findRemainder(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int mod;

        try{
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            mod = num1 % num2;
            numberSumTV.setText("" + mod);
        } catch (Exception e){
            numberSumTV.setText("Input integers only!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void findExponent(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int exponent;

        try{
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            exponent = (int) Math.pow(num1, num2);

            numberSumTV.setText("" + exponent);
        } catch (Exception e){
            numberSumTV.setText("Input integers only!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}