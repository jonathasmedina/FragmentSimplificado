package com.example.jonathas.fragmentsimplificado;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //objeto encontrando o Fragment pelo ID definido no elemento dentro do XML principal (activity_main.xml)
        Fragment1 fragment1 = (Fragment1) fm.findFragmentById(R.id.fragmentElemento);
        Fragment2 fragment2 = (Fragment2) fm.findFragmentById(R.id.fragment2Element);

        fragment1.alteraTextView("Este é o Fragment 1");
        fragment2.alteraTextView("Este é o Fragment 2");


    }
}
