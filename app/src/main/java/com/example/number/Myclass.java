package com.example.number;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Myclass extends BaseAdapter {

    levels levels;

    public Myclass( com.example.number.levels levels) {
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(levels).inflate(R.layout.leve, parent, false);

        TextView txt;

        txt = convertView.findViewById(R.id.txt);
        txt.setBackgroundResource(R.drawable.lock);

        return convertView;
    }
}
