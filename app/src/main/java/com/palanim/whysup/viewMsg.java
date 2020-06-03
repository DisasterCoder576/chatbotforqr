package com.palanim.whysup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class viewMsg extends AppCompatActivity {

    public String message= "";
    ArrayList<String> chatList = new ArrayList<>();

    ArrayAdapter arrayAdapter;

    public void send(View v){
        ListView chatListTool = (ListView) findViewById(R.id.msgs);
        EditText message =findViewById(R.id.editchat);
        chatList.add(message.getText().toString());
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, chatList);
        chatListTool.setAdapter(arrayAdapter);
        message.setText("");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_msg);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setTitle("Chat");
        ListView chatListTool = (ListView) findViewById(R.id.msgs);

        //testing REMOVE LATER
        chatList.add("this is message 1");
        chatList.add("this is message 2");
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, chatList);
        chatListTool.setAdapter(arrayAdapter);

    }
}
