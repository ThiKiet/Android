package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.login);
        TextView username = findViewById(R.id.username);
        TextView pass = findViewById(R.id.password);

        final Intent myIntent = this.getIntent();
        String email = myIntent.getStringExtra("email");
        String password = myIntent.getStringExtra("password");

        username.setText(email);
        pass.setText(password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_OK, myIntent);
                finish();
            }
        });
    }
}
