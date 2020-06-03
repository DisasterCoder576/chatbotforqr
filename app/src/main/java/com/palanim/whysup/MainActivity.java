package com.palanim.whysup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
//import android.widget.EditText;
//import android.widget.TextView;
import android.widget.*;
public class MainActivity extends AppCompatActivity {



    boolean SignUpmode= false;

    public void changeMode(View view){
        TextView changeMode = (TextView) findViewById(R.id.changeMode);
        Button start = (Button) findViewById(R.id.start);

        if (SignUpmode == false){
            changeMode.setText("or, Login");
            start.setText("Sign Up");
            SignUpmode =true;
        }
        else
        {
            changeMode.setText("or, Sign Up");
            start.setText("Login");
            SignUpmode =false;
        }


    }

    public void startButton(View view){
        EditText userName = (EditText) findViewById(R.id.usernameEdit);
        EditText passWord = (EditText) findViewById(R.id.passwordEdit);
        if(userName.getText().toString().matches("") || passWord.getText().toString().matches("")){
            Log.i("Empty", "empty");
            Toast.makeText(getApplicationContext(),"Either field can not be empty",Toast.LENGTH_LONG).show();
        }
        else {
            Log.i("not Empty", "not empty");
            Intent chatActivityintent = new Intent(MainActivity.this, chatActivity.class);
            MainActivity.this.startActivity(chatActivityintent);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    





}
