package com.bca6sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent i = getIntent();
        TextView emailTv = findViewById(R.id.emailTv);
        emailTv.setText(i.getStringExtra("EmailId"));
        TextView passwordTV = findViewById(R.id.passwordTv);
        passwordTV.setText(i.getStringExtra("passwordId"));
        Button button=findViewById(R.id.goback);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("message","Login CallBack");
                setResult(2,intent);
                finish();
            }
        });
    }

}