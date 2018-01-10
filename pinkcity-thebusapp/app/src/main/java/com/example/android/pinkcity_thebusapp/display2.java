package com.example.android.pinkcity_thebusapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by chirayu jain on 05-01-2018.
 */

public class display2 extends display1 {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display2);
    }

    public void onButtonClickTime1(View v)
    {
        if(v.getId()==R.id.but3)
        {
            Intent i = new Intent(display2.this,displaytime1.class);
            startActivity(i);
        }

    }

    public void onButtonClickinfo(View v)
    {
        if(v.getId()==R.id.but2)
        {
            Intent i = new Intent(display2.this,displayinfo.class);
            startActivity(i);
        }

    }
}
