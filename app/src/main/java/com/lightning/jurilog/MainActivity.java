package com.lightning.jurilog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lightning.jurilog.Activities.AvocatLogin;
import com.lightning.jurilog.Activities.ClientLogin;

public class MainActivity extends AppCompatActivity {
    private TextView welcome;
    private Button btnLoginCLient;
    private Button btnLoginAvocat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.welcome = findViewById(R.id.welcome);
        this.btnLoginCLient = findViewById(R.id.btnLoginClient);
        this.btnLoginAvocat = findViewById(R.id.btnLoginAvocat);

        this.btnLoginAvocat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AvocatLogin.class);
                startActivity(intent);
            }
        });
        this.btnLoginCLient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClientLogin.class);
                startActivity(intent);
            }
        });
    }
}