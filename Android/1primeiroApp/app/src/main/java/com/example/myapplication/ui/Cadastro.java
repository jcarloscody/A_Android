package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.dao.Dao;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Dao dao= new Dao();
        Button salvar = findViewById(R.id.button_cadastrar);
        EditText nome = findViewById(R.id.editTextTextPersonName);

        salvar.setOnClickListener(view -> {
            dao.salvar(nome.getText());
            Toast.makeText(this, nome.getText(), Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}