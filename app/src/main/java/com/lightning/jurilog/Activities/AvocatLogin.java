package com.lightning.jurilog.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lightning.jurilog.Models.Avocat;
import com.lightning.jurilog.R;

import java.util.ArrayList;
import java.util.List;

public class AvocatLogin extends AppCompatActivity {
    private EditText textUsername;
    private EditText textPassword;
    private Button btnLogin;
    private Button btnRegister;

    private List<Avocat> avocatsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avocat_login);

        this.textUsername = findViewById(R.id.inputUsernameLoginAvocat);
        this.textPassword = findViewById(R.id.inputPasswordLoginAvocat);
        this.btnLogin = findViewById(R.id.btnLogin);
        this.btnRegister = findViewById(R.id.btnRegister);

        CreateFakeList(10);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < avocatsList.size(); i++) {
                    if (textUsername.getText().toString().equals(avocatsList.get(i).getUsername()) || textPassword.getText().toString().equals(avocatsList.get(i).getPassword())) {
                        System.out.println("login avocat OK !!!");
                        Intent intent = new Intent(AvocatLogin.this, RdvAvocatActivity.class);
                        startActivity(intent);
                    } else {
                        System.out.println("login avocat NO !!!");
                    }
                }
            }
        });
    }

    private void CreateFakeList(int iteration) {
        for (int i = 0; i < iteration; i++) {
            Avocat avocat = new Avocat("test_"+i, "test_"+i, "test_"+i, "test_"+i, 0);
            avocatsList.add(avocat);
        }
    }
}