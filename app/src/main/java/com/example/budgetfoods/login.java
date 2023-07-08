package com.example.budgetfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private EditText USERNAME;
    private EditText PASSWORD;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        USERNAME = findViewById(R.id.username);
        PASSWORD = findViewById(R.id.password);


        Login = findViewById(R.id.loginbtn);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tent = new Intent(login.this, home.class);
                startActivity(tent);

            }

            });
            }


            }
