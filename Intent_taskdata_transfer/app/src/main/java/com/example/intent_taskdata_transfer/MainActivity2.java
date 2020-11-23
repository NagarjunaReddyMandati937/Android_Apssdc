package com.example.intent_taskdata_transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text1,text2,text3,text4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        Bundle bundle = getIntent().getExtras();
//        String valueReceived1 = bundle .getString("nam");
//        String valueReceived2 = bundle .getString("loc");

        text1=findViewById(R.id.name);
        text2=findViewById(R.id.location);
        text3=findViewById(R.id.email);
        text4=findViewById(R.id.phone);
        String s1 = getIntent().getStringExtra("nam");
        String s2 = getIntent().getStringExtra("loc");
        String s3 = getIntent().getStringExtra("mail");
        String s4 = getIntent().getStringExtra("pho");
        text1.setText("Name : "+s1);
        text2.setText("Location : "+s2);
        text3.setText("Email : "+s3);
        text4.setText("Phone : "+s4);


    }
}