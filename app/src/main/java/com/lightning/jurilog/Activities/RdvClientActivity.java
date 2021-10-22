package com.lightning.jurilog.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.lightning.jurilog.R;

public class RdvClientActivity extends AppCompatActivity {
    private TextView RdvClientTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdv_client);

        this.RdvClientTextView = findViewById(R.id.textViewClientRdv);
    }
}