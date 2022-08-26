package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    private static DecimalFormat df = new DecimalFormat("0.00");
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        image = findViewById(R.id.imageView);

        Intent intent = getIntent();
    }

    public void convertPounds(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double pounds = (num1 * 0.85);

            String result = df.format(pounds);

            /* All ImageView code (lines 25 and the repeated two lines below)
             * learned from https://developer.android.com/reference/android/widget/ImageView
             */
            https://developer.android.com/reference/android/widget/ImageView
            image.setImageResource(R.drawable.pound);
            numberSumTV.setText(result + " Pounds");
        } catch (Exception e){
            numberSumTV.setText("Input a valid number!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void convertEuros(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double conversion = (num1 * 1.01);

            String result = df.format(conversion);

            image.setImageResource(R.drawable.euro);
            numberSumTV.setText(result + " Euros");
        } catch (Exception e){
            numberSumTV.setText("Input a valid number!");
        }
        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void convertRenminbi(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double conversion = (num1 * 6.87);

            String result = df.format(conversion);

            image.setImageResource(R.drawable.renminbi);
            numberSumTV.setText(result + " Yuan");
        } catch (Exception e){
            numberSumTV.setText("Input a valid number!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void convertCAD(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double conversion = (num1 * 1.30);

            String result = df.format(conversion);

            image.setImageResource(R.drawable.cad);
            numberSumTV.setText(result + " CAD");
        } catch (Exception e){
            numberSumTV.setText("Input a valid number!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void convertRupees(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double conversion = (num1 * 79.78);

            String result = df.format(conversion);

            image.setImageResource(R.drawable.rupee);
            numberSumTV.setText(result + " Rupees");
        } catch (Exception e){
            numberSumTV.setText("Input a valid number!");
        }

        //Keyboard close on button click below from https://stackoverflow.com/a/27228592
        try {
            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void convertKRW(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double conversion = (num1 * 1342.46);

            String result = df.format(conversion);

            image.setImageResource(R.drawable.krw);
            numberSumTV.setText(result + " Won");
        } catch (Exception e){
            numberSumTV.setText("Input a valid number!");
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