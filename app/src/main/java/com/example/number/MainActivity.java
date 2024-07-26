package com.example.number;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txt1,txt2,txt3;
    int h= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.ctnew);
        txt2 = findViewById(R.id.pzl);
        txt3 = findViewById(R.id.pro);

        h = getIntent().getIntExtra("ds", 0);



        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent d =new Intent(MainActivity.this,Continue.class);

                d.putExtra("ds",h);
                startActivity(d);
            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, levels.class).putExtra("ds",h));

            }
        });






    }
}