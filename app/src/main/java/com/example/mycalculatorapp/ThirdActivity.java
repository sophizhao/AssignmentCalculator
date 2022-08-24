package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double pounds = (num1 * 0.85);

        String result = df.format(pounds);

        image.setImageResource(pounds);
        numberSumTV.setText(result + " Pounds");

    }

    public void convertEuros(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double conversion = (num1 * 1.01);

        String result = df.format(conversion);

        numberSumTV.setText(result + " Euros");
    }

    public void convertRenminbi(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double conversion = (num1 * 6.87);

        String result = df.format(conversion);

        numberSumTV.setText(result + " Yuan");
    }

    public void convertCAD(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double conversion = (num1 * 1.30);

        String result = df.format(conversion);

        numberSumTV.setText(result + " CAD");
    }

    public void convertRupees(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double conversion = (num1 * 79.78);

        String result = df.format(conversion);

        numberSumTV.setText(result + " Rupees");
    }

    public void convertKRW(View view){
        EditText number1ET = findViewById(R.id.num1Currency);
        TextView numberSumTV = findViewById(R.id.resultCurrency);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double conversion = (num1 * 1342.46);

        String result = df.format(conversion);

        numberSumTV.setText(result + " Won");
    }

}