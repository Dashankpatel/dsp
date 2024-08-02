package com.example.number;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt1, txt2, txt3;
    int i;

    static SharedPreferences sp;
    static SharedPreferences.Editor edit;
    static String com = "completed";
    static String lock = "lock";
    static String skip = "skip";
    static String unlock = "unlock";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        sp = getSharedPreferences("Mydata", MODE_PRIVATE);
        edit = sp.edit();

        txt1 = findViewById(R.id.ctnew);
        txt2 = findViewById(R.id.pzl);
        txt3 = findViewById(R.id.pro);

        i = sp.getInt("value", 0);

        for (int m = 0; m < 10; m++) {
            if (sp.getString("key" + m, "").equals(""))
            {
                edit.putString("key" + m, lock);
                edit.apply();
            }
        }


        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent d = new Intent(MainActivity.this, Continue.class);
                d.putExtra("level", i);
                startActivity(d);
                finish();

            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, levels.class));
                finish();
            }
        });


    }

}