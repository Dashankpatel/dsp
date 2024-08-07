package com.example.number;

import static com.example.number.MainActivity.edit;
import static com.example.number.MainActivity.lock;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Myclass extends BaseAdapter {

    levels levels;

    public Myclass(com.example.number.levels levels) {
        this.levels = levels;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(levels).inflate(R.layout.leve, parent, false);

        TextView txt;
        txt = convertView.findViewById(R.id.txt);

        if (MainActivity.sp.getString("key" + position, "").equals(MainActivity.com))
        {
            txt.setBackgroundResource(R.drawable.tick);
            txt.setText("" + (position + 1));

        }
        else if (MainActivity.sp.getString("key" + position, "").equals(lock) &&
                MainActivity.sp.getString("key" + (position-1), "").equals(MainActivity.com))
        {
            txt.setText("" + (position + 1));
        }
        else if (MainActivity.sp.getString("key" + position, "").equals(MainActivity.skip))
        {
            txt.setText("" + (position + 1));
        }
        else
        {
            txt.setBackgroundResource(R.drawable.lock);
        }

        // lock mate : -
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!MainActivity.sp.getString("key" + position, "").equals(MainActivity.lock) ||
                        MainActivity.sp.getString("key" + (position-1), "").equals(MainActivity.com) )
                {
                    Intent i = new Intent(levels, Continue.class);
                    i.putExtra("level", position);
                    levels.startActivity(i);
                }
            }
        });


        return convertView;
    }
}
