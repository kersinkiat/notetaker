package com.example.newtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editusername,editpassword;
    private Button btnlogin;

    private String username="abc",password="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews(){
        editusername = findViewById(R.id.edit_username);
        editpassword = findViewById(R.id.edit_password);
        btnlogin = findViewById(R.id.btn_login);
    }

    private void setListeners(){
        btnlogin.setOnClickListener();
    }

}
