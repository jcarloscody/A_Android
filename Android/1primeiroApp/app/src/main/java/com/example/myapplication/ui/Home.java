package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.dao.Dao;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Home extends AppCompatActivity {
    ListView listaView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Lista");



         listaView = findViewById(R.id.lista_item);


        FloatingActionButton add = findViewById(R.id.floatingActionButton);
        add.setOnClickListener(view -> {
            startActivity( new Intent(this, Cadastro.class));
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<String> alunos = Dao.values;
        listaView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos));
    }
}