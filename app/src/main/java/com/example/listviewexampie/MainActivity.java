package com.example.listviewexampie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;
String month[]={"Айдай","Таалай","Жаркын","Алтын","Айжан"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.montlist);

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,month);
        listView.setAdapter(arrayAdapter);
     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
             String select = listView.getItemAtPosition(i).toString();
             Intent intent = new Intent(MainActivity.this,MonthDetail.class);
             intent.putExtra("selact",select);
             startActivity(intent);
         }
     });
    }
}