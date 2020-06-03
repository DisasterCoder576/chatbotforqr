package com.palanim.whysup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class chatActivity extends AppCompatActivity {

    ArrayList<String> usersList = new ArrayList<>();

    ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setTitle("Users to Chat with");


        ListView userListTool = (ListView) findViewById(R.id.chatList);


        userListTool.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent msgViewintent = new Intent(chatActivity.this, viewMsg.class);
                chatActivity.this.startActivity(msgViewintent);
            }



        }

        );



        usersList.add("User 1");
        usersList.add("User 2");
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, usersList);
        userListTool.setAdapter(arrayAdapter);


    }
}
