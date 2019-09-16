package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = findViewById(R.id.login);
        final EditText editUsername = findViewById(R.id.editUsername);
        final EditText editPassword = findViewById(R.id.editpassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editUsername.getText().toString();
                String password = editPassword.getText().toString();

                Intent loginIntent = new Intent(view.getContext(), MainActivity.class);
                loginIntent.putExtra("email", email);
                loginIntent.putExtra("password", password);
                startActivityForResult(loginIntent, 0);
            }
        });
    }}

