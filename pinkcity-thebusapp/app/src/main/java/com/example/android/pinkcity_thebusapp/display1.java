package com.example.android.pinkcity_thebusapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by chirayu jain on 05-01-2018.
 */

public class display1 extends Activity {@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.display1);
}
    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.button1)
        {
            Intent i = new Intent(display1.this,display2.class);
            startActivity(i);
        }

    }

    public void onButtonClick2(View v)
    {
        if(v.getId()==R.id.button2)
        {
            Intent i = new Intent(display1.this,display3.class);
            startActivity(i);
        }

    }

    public void onButtonClick3(View v)
    {
        if(v.getId()==R.id.button3)
        {
            Intent i = new Intent(display1.this,display4.class);
            startActivity(i);
        }

    }

    public void onButtonClick4(View v)
    {
        if(v.getId()==R.id.button4)
        {
            Intent i = new Intent(display1.this,display5.class);
            startActivity(i);
        }

    }

    public void onButtonClick5(View v)
    {
        if(v.getId()==R.id.button5)
        {
            Intent i = new Intent(display1.this,display6.class);
            startActivity(i);
        }

    }

    public void onButtonClick6(View v)
    {
        if(v.getId()==R.id.button6)
        {
            Intent i = new Intent(display1.this,display7.class);
            startActivity(i);
        }

    }

    public void onButtonClick7(View v)
    {
        if(v.getId()==R.id.button7)
        {
            Intent i = new Intent(display1.this,display8.class);
            startActivity(i);
        }

    }


}
