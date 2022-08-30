package com.takata.projetotelalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }
}