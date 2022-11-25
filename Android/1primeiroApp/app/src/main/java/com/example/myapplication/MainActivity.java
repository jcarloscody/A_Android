package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> alunos = new ArrayList<>(Arrays.asList("Josue", "Jose"));

        ListView listaView = findViewById(R.id.lista_item);
        listaView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos));
    }
}