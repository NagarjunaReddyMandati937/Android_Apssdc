package com.example.intent_taskdata_transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bt;
    EditText text1,text2,text3,text4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.submit);

        text1 = findViewById(R.id.name);
        text2 = findViewById(R.id.location);
        text3 = findViewById(R.id.email);
        text4 = findViewById(R.id.mobile);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                String data1 = text1.getText().toString();
                String data2 = text2.getText().toString();
                String data3 = text3.getText().toString();
                String data4 = text4.getText().toString();
                i.putExtra("nam",data1);
                i.putExtra("loc",data2);
                i.putExtra("mail",data3);
                i.putExtra("pho",data4);
                startActivity(i);
            }
        });
    }
}