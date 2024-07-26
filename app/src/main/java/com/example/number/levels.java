package com.example.number;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class levels extends AppCompatActivity {

    GridView list;

    String array[] = {"1","2","3","4","5","6","7","8","9","10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_levels);

        list = findViewById(R.id.list);

        int h = getIntent().getIntExtra("ds", 0);

        Myclass ns = new Myclass(array,levels.this,h);
        list.setAdapter(ns);





    }
}