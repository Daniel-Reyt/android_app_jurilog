package com.lightning.jurilog.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lightning.jurilog.Models.Avocat;
import com.lightning.jurilog.Models.Client;
import com.lightning.jurilog.R;

import java.util.ArrayList;
import java.util.List;

public class ClientLogin extends AppCompatActivity {
    private EditText textUsername;
    private EditText textPassword;
    private Button btnLogin;
    private Button btnRegister;

    private List<Client> clientList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_login);

        this.textUsername = findViewById(R.id.inputUsernameLoginClient);
        this.textPassword = findViewById(R.id.inputPasswordLoginClient);
        this.btnLogin = findViewById(R.id.btnLogin);
        this.btnRegister = findViewById(R.id.btnRegister);

        CreateFakeList(10);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < clientList.size(); i++) {
                    if (textUsername.getText().toString().equals(clientList.get(i).getUsername()) || textPassword.getText().toString().equals(clientList.get(i).getPassword())) {
                        System.out.println("login client OK !!!");
                        Intent intent = new Intent(ClientLogin.this, RdvClientActivity.class);
                        startActivity(intent);
                    } else {
                        System.out.println("login client NO !!!");
                    }
                }
            }
        });
    }

    private void CreateFakeList(int iteration) {
        for (int i = 0; i < iteration; i++) {
            Client client = new Client("test_"+i, "test_"+i, "test_"+i, "test_"+i, 0);
            clientList.add(client);
        }
    }
}