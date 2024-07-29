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

    String array[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_levels);

        list = findViewById(R.id.list);

        int h = getIntent().getIntExtra("ds", 0);

        Myclass ns = new Myclass(levels.this);
        list.setAdapter(ns);





    }
}