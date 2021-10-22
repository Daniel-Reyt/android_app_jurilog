package com.lightning.jurilog.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.lightning.jurilog.R;

public class RdvAvocatActivity extends AppCompatActivity {
    private TextView RdvAvocatTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdv_avocat);

        this.RdvAvocatTextView = findViewById(R.id.textViewAvocatRdv);
    }
}