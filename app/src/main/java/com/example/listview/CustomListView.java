package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListView extends BaseAdapter {
    String[] nameList;
    String[] numberList;
    Context context;
    int[] imageList;

    public CustomListView(int[] imageList, String[] nameList, String[] numberList, Context context) {
        this.context = context;
        this.nameList = nameList;
        this.numberList = numberList;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return nameList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_list_item, null);
            TextView name = convertView.findViewById(R.id.name);
            name.setText(nameList[position]);
            TextView number = convertView.findViewById(R.id.number);
            number.setText(numberList[position]);
            ImageView img = convertView.findViewById(R.id.img);
            img.setImageResource(imageList[position]);
        }
        return convertView;
    }
}
