package com.example.number;

import static com.example.number.MainActivity.edit;
import static com.example.number.MainActivity.sp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
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

    TextView complete, con, menu;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_win_page);

        con = findViewById(R.id.con);
        complete = findViewById(R.id.complete);
        menu = findViewById(R.id.menu);

        i = getIntent().getIntExtra("level", 0);

        complete.setText(" LEVEL  " + i + "  COMPLETED ");

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WinPage.this , Continue.class).putExtra("level", i));
                finish();



            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(WinPage.this, MainActivity.class));
            }
        });


    }
}