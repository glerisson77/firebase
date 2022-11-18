package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.FirebaseDatabase;

public class startActivity extends AppCompatActivity {

    private Button register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        register = findViewById(R.id.register);
        login = findViewById(R.id.login);

        FirebaseDatabase.getInstance().getReference().child("teste").child("Android").setValue("abcd");
    }

    public void loginScreen(View v){
        Intent intent = new Intent(startActivity.this, loginActivity.class);
        startActivity(intent);
    }
    public void registerScreen(View v){
        Intent intent = new Intent(startActivity.this, registerActivity.class);
        startActivity(intent);
    }

    public void openDataScreen(View v){
        Intent intent = new Intent(startActivity.this, MainActivityData.class);
        startActivity(intent);
    }
}