package com.example.budgetfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Authentication extends AppCompatActivity {
    private Button Login;
    private Button SIGN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        SIGN = findViewById(R.id.btn_Sign);
        SIGN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        Intent intent = new Intent(Authentication.this, signup.class);
        startActivity(intent);

            }
        });

        Login = findViewById(R.id.btn_Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tent = new Intent(Authentication.this, login.class);
                startActivity(tent);
            }
        });

    }
}


