package com.example.android.pinkcity_thebusapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv  = (TextView) findViewById(R.id.text1);
        tv.setSelected(true);
    }
    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.home_button)
        {
            Intent i = new Intent(MainActivity.this,display1.class);
            startActivity(i);
        }

    }
    public void onButtonClickMap(View v)
    {
        if(v.getId()==R.id.home_button2)
        {
            Intent i = new Intent(MainActivity.this,displaymap.class);
            startActivity(i);
        }

    }
    public void onButtonClickLogin(View v)
    {
        if(v.getId()==R.id.home_button3)
        {
            Intent i = new Intent(MainActivity.this,display_login.class);
            startActivity(i);
        }

    }
}
