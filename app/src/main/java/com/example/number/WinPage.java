package com.example.number;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WinPage extends AppCompatActivity {

    TextView complete,con,menu;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_win_page);
        con = findViewById(R.id.con);
        complete = findViewById(R.id.complete);
        menu = findViewById(R.id.menu);

        int h = getIntent().getIntExtra("ds", 0);

        complete.setText(" LEVEL  " + h + "  COMPLETED ");

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(WinPage.this, Continue.class).putExtra("ds", h));
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(WinPage.this, MainActivity.class).putExtra("ds", h));
            }
        });


    }
}