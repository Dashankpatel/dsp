package com.example.number;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class Myclass extends BaseAdapter {

    String[] array;
    levels levels;
    int h;

    public Myclass(String[] array, com.example.number.levels levels, int h) {
        this.array = array;
        this.levels = levels;
        this.h = h;
    }

    @Override
    public int getCount() {
        return array.length;
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

        convertView = LayoutInflater.from(levels).inflate(R.layout.activity_levels, parent, false);

        return convertView;
    }
}
