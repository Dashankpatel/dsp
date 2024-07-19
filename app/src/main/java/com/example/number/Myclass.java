package com.example.number;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Myclass extends BaseAdapter {
    Continue aContinue;
    int[] imagearray;

    public Myclass(Continue aContinue, int[] imagearray) {
        this.aContinue = aContinue;
        this.imagearray = imagearray;
    }

    @Override
    public int getCount() {
        return imagearray.length;
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

        ImageView img;
        convertView = LayoutInflater.from(aContinue).inflate(R.layout.activity_continue,parent,false);


        img = convertView.findViewById(R.id.que);
        img.setBackgroundResource(imagearray[position]);


        return convertView;
    }
}
