package com.bca6sem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView itemsLv = findViewById(R.id.itemsLv);

        String names[] = {"Nayan", "Sangam", "Sugam", "karan", "parash", "dhiraj"};

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, R.layout.list_view_items, R.id.namesTv, names);

        itemsLv.setAdapter(adapter);
    }
}