package com.example.doctors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.doctors.Models.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



CardView cardone, cardtwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//cardone = findViewById(R.id.card_one);
cardtwo = findViewById(R.id.card_two);


cardtwo.setOnClickListener(this);
//cardone.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v==cardtwo) {
            Intent intent = new Intent(MainActivity.this, DocMain.class);
            startActivity(intent);
        }else if(v==cardone){
            Toast.makeText(this, "This Is On Under Constraction", Toast.LENGTH_SHORT).show();
        }
    }
}
