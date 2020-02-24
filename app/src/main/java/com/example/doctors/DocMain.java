package com.example.doctors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.doctors.Models.User;

import java.util.ArrayList;
import java.util.List;

public class DocMain extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserAdapter adapter;

    List<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_main);

        userList.add(new User("Jahid","jahid@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));
        userList.add(new User("Enamul","enamul@gmail.com"));

        adapter = new UserAdapter(this,userList);

        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }
}
