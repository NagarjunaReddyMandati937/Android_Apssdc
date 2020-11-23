package com.example.implicit_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.ed_text);
    }

    public void dail(View view) {
        String s = editText.getText().toString();
        Intent in = new Intent(Intent.ACTION_DIAL);
        in.setData(Uri.parse("tel:"+s));
        startActivity(in);
    }

    public void share(View view) {
        String s = editText.getText().toString();
        ShareCompat.IntentBuilder.from(this) //place
                .setType("text/plane") //type of data
                .setChooserTitle("select one app")
                .setText(s) //share data
                .startChooser();
    }

    public void whatsapp(View view) {
        Intent i = getPackageManager()
                .getLaunchIntentForPackage("com.whatsapp");
        startActivity(i);
    }

    public void site(View view) {
        String s = editText.getText().toString();
       // String url = "http://www.google.com";
        Intent in = new Intent(Intent.ACTION_VIEW);
        in.setData(Uri.parse("http://www."+s+".com"));
        startActivity(in);
    }
}