package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = findViewById(R.id.list);
        ArrayList<list_class> arr = new ArrayList<>();

        arr.add(new list_class(R.drawable.ic_launcher_background,"name"));
        arr.add(new list_class(R.drawable.ic_launcher_background,"name"));
        arr.add(new list_class(R.drawable.ic_launcher_background,"name"));
        arr.add(new list_class(R.drawable.ic_launcher_background,"name"));
        arr.add(new list_class(R.drawable.ic_launcher_background,"name"));
        arr.add(new list_class(R.drawable.ic_launcher_background,"name"));
        arr.add(new list_class(R.drawable.ic_launcher_background,"name"));

        listAdapter adapter = new listAdapter(arr,this);
        list.setAdapter(adapter);

     }





}




