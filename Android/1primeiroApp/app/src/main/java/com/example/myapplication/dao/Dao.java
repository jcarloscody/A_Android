package com.example.myapplication.dao;

import android.text.Editable;

import java.util.ArrayList;

public class Dao {
    public static ArrayList<String> values = new ArrayList<>();
    public void salvar(Editable text) {
values.add(text.toString());
    }
}
