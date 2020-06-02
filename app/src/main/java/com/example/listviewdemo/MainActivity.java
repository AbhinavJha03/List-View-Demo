package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.myListView);
        textView=findViewById(R.id.textView);
        textView.setTypeface(null,Typeface.BOLD);
        textView.setText("Main");




        final ArrayList<String> list = new ArrayList<String>(asList("Mark", "James"));
        list.add("Abish");
        list.add("Kanan");
        list.add("Mathews");
        list.add("Gill");
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.row, list);


      listView.setAdapter(arrayAdapter);
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
              Log.i("Button Pressed", arrayAdapter.getItem(i));
              Toast.makeText(MainActivity.this, "Name is "+ arrayAdapter.getItem(i), Toast.LENGTH_LONG).show();

          }
      });


    }
}
