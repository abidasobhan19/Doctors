package com.example.doctors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class item_activity extends AppCompatActivity {

    TextView tx1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_activity);

        tx1 = findViewById(R.id.name);
        txt2= findViewById(R.id.email);

    }
}
