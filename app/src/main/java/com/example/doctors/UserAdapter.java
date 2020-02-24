package com.example.doctors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctors.Models.User;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>  {

        private List<User> userList;
        private LayoutInflater inflater;
        private Context context;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.userList = new ArrayList<>(userList);
    }


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.activity_item_activity,parent,false);
        UserViewHolder userHolder = new UserViewHolder(view);
        return userHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        User user = userList.get(position);
        holder.bind(user);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        TextView tx1,tx2;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
          tx1 = itemView.findViewById(R.id.name);
          tx2 = itemView.findViewById(R.id.email);
        }

        public void bind(User user) {

            tx1.setText(user.getName());
            tx2.setText(user.getEmail());
        }
    }
}