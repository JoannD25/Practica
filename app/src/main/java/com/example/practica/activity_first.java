package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activity_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void onClickNavegador(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public void onClickLlamada(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+593 998644578"));
        startActivity(intent);


    }
}