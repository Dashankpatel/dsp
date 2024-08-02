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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_levels);

        list = findViewById(R.id.list);


        Myclass ns = new Myclass(levels.this);
        list.setAdapter(ns);





    }
}


















// Assuming MainActivity.sp is your SharedPreferences object
//SharedPreferences.Editor editor = MainActivity.sp.edit();
//String key = "key" + position;
//String value = MainActivity.sp.getString(key, "");
//

//// Check if current level is completed
//if (value.equals(MainActivity.com))
// {
//        txt.setBackgroundResource(R.drawable.tick);
//    txt.setText("" + (position + 1));

//    Unlock the next level
//   String nextKey = "key" + (position + 1);

//    if (MainActivity.sp.getString(nextKey, "").equals(""))
//    {
//        editor.putString(nextKey, MainActivity.unlock); // Assuming "unlock" is the state for an unlocked level
//        editor.apply();
//    }
// }

//     else if (value.equals(MainActivity.skip))
//      {
//        txt.setText("" + (position + 1));
//      }

//     else
//      {
//         txt.setBackgroundResource(R.drawable.lock);
//      }
