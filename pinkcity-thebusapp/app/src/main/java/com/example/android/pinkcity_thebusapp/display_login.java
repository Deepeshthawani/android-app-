package com.example.android.pinkcity_thebusapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by chirayu jain on 08-01-2018.
 */

public class display_login extends displayinfo {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_login);
        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);
        Info.setText("No of attempts remaining is 5");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClickLogin2(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void onButtonClickLogin2(String userName, String userPassword)
    {
        if ((userName.equals("Admin"))&&(userPassword.equals("1234")))
        {
            Intent i = new Intent(display_login.this, display_personal.class);
            startActivity(i);
        }
        else
        {
            counter--;
            Info.setText("No of incorrect attempts remaining : "+ String.valueOf(counter));
            if(counter==0)
            {
                Login.setEnabled(false);
            }
        }
    }

}
