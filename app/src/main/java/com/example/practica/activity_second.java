package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_second extends AppCompatActivity {
    private EditText editTextNumberOne;
    private EditText editTextNumberTwo;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //references
        editTextNumberOne = findViewById(R.id.editTextNumberOne);
        editTextNumberTwo = findViewById(R.id.editTextNumberTwo);
        textViewResult = findViewById(R.id.textViewResult);

    }

    public  void onClickSumar(View view){
        String numberOne = editTextNumberOne.getText().toString();
        String numberTwo = editTextNumberTwo.getText().toString();

        int a=Integer.parseInt(numberOne);
        int b=Integer.parseInt(numberTwo);
        long add = a+b;

        String result = String.valueOf(add);
        textViewResult.setText(result);
    }

    public  void  onClickRestar(View view){
        String numberOne = editTextNumberOne.getText().toString();
        String numberTwo = editTextNumberTwo.getText().toString();

        int a=Integer.parseInt(numberOne);
        int b=Integer.parseInt(numberTwo);
        long add = a-b;

        String result = String.valueOf(add);
        textViewResult.setText(result);
    }

    public void onClickMultiplicar(View view){
        String numberOne = editTextNumberOne.getText().toString();
        String numberTwo = editTextNumberTwo.getText().toString();

        int a=Integer.parseInt(numberOne);
        int b=Integer.parseInt(numberTwo);
        long add = a*b;

        String result = String.valueOf(add);
        textViewResult.setText(result);
    }

    public  void onClickSecondActivity(View view){
        Intent intent = new Intent(this, activity_first.class);
        startActivity(intent);
    }
}