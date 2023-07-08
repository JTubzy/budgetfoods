package com.example.budgetfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    private EditText lname;
    private EditText password2;
    private EditText fname;
    private EditText phone;
    private EditText mail;
    private EditText DOB;

    private Button Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        DOB = findViewById(R.id.dob);
        mail = findViewById(R.id.mail);
        phone = findViewById(R.id.phone);
        password2 = findViewById(R.id.password2);
        Sign = findViewById(R.id.signupbtn);
        Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(signup.this, home.class);
                startActivity(intent);

            }

        });
    }
}
