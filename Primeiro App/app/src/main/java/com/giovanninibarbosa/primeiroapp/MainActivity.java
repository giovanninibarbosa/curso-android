package com.giovanninibarbosa.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto (View view) {
        TextView textView = findViewById(R.id.cliqueTxtViewMain);
        textView.setText("Texto alterado!");
    }

}