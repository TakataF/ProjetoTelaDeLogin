package com.takata.projetotelalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);
    }
}