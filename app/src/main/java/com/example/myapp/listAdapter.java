package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class listAdapter extends ArrayAdapter<list_class>{

    public ArrayList<list_class> mlist;
    Context context;

    public listAdapter(ArrayList<list_class> list, Context context){
        super(context,0,list);
        mlist = list;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        list_class list = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.object_layout, parent, false);

        }
        ImageView mImage = convertView.findViewById(R.id.img);
        TextView mText = convertView.findViewById(R.id.txt);

        mText.setText(list.getmName());
        mImage.setImageResource(list.getmImg());

        return  convertView;
    }
}
