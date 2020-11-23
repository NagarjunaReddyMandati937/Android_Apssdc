package com.example.hello_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);

    }

    public void toastmsg(View view) {
        Toast.makeText(this, "Nagarjuna", Toast.LENGTH_SHORT).show();
    }

    public void countmsg(View view) {

        count++;
        tv.setText(""+count);
    }
}