package com.example.test;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int contador = 0;

    private TextView tvContador;
    private TextView btnSumar;
    private TextView btnReiniciar;

    private static final String claveContador = "contador";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvContador = findViewById(R.id.tvContador);
        btnSumar = findViewById(R.id.btnSumar);
        btnReiniciar = findViewById(R.id.btnReiniciar);

        if (savedInstanceState != null) {
            contador = savedInstanceState.getInt("contador");
        }

        tvContador.setText(String.valueOf(contador));


        btnSumar.setOnClickListener(v -> {
            contador = contador + 1;
            tvContador.setText(String.valueOf(contador));
        });


        btnReiniciar.setOnClickListener(v -> {
            contador = 0;
            tvContador.setText(String.valueOf(contador));
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("contador", contador);
    }
}