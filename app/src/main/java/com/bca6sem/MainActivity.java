package com.bca6sem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton calcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcBtn = findViewById(R.id.calculateBtn);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Calculate Number");

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_dialog, null);
        builder.setView(view);

        EditText firstEt = view.findViewById(R.id.firstEt);
        EditText secondEt = view.findViewById(R.id.secondEt);
        MaterialButton calcBtn = view.findViewById(R.id.calBtn);
        TextView resultTv = view.findViewById(R.id.resultTv);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second, result;
                first = Integer.parseInt(firstEt.getText().toString());
                second = Integer.parseInt(secondEt.getText().toString());
                result = first + second;

                resultTv.setText(String.valueOf(result));

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}