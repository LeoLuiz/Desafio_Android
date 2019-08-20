package com.example.friendlist.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.*;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.friendlist.Model.FriendModel;
import com.example.friendlist.R;
import com.example.friendlist.Adapter.RecyclerViewAdapter;
import com.example.friendlist.RecyclerItemClickListener;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewFriends;
    private RecyclerViewAdapter adaptadorFriends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        recyclerViewFriends =(RecyclerView) findViewById(R.id.RecyclerFriends);
        recyclerViewFriends.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFriends.setHasFixedSize(true);
        adaptadorFriends = new RecyclerViewAdapter(obtainFriends());
        recyclerViewFriends.setAdapter(adaptadorFriends);

        //Configurando eventos de clique

        recyclerViewFriends.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(), recyclerViewFriends, new RecyclerItemClickListener.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                }

                @Override
                public void onItemClick(View view, int position) {
                    FriendModel friend = obtainFriends().get(position);
                    Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
                    intent.putExtra("obj",friend);
                    intent.putExtra("name",friend.getName());
                    intent.putExtra("desc",friend.getDescription());
                    startActivity(intent);
                }
                @Override
                public void onLongItemClick(View view, int position) {

                }
            }
            )
        );
    }
    public List<FriendModel> obtainFriends() {
        List<FriendModel> friends = new ArrayList<>();
        friends.add(new FriendModel("Laura Maria da Silva","Online",R.drawable.i01,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque aliquet odio metus, et tempor nisl dignissim id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisis tempus tellus, non hendrerit elit gravida et. Suspendisse ac ligula a neque sodales placerat et nec nulla."));
        friends.add(new FriendModel("Ana Cristina","Offline",R.drawable.i02,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque aliquet odio metus, et tempor nisl dignissim id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisis tempus tellus, non hendrerit elit gravida et. Suspendisse ac ligula a neque sodales placerat et nec nulla."));
        friends.add(new FriendModel("Allan Felipe","Ocupado",R.drawable.i03,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque aliquet odio metus, et tempor nisl dignissim id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisis tempus tellus, non hendrerit elit gravida et. Suspendisse ac ligula a neque sodales placerat et nec nulla."));
        friends.add(new FriendModel("João da Silva","Offline",R.drawable.i04,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque aliquet odio metus, et tempor nisl dignissim id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisis tempus tellus, non hendrerit elit gravida et. Suspendisse ac ligula a neque sodales placerat et nec nulla."));
        friends.add(new FriendModel("Bryan Ruiz","Online",R.drawable.i05,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque aliquet odio metus, et tempor nisl dignissim id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisis tempus tellus, non hendrerit elit gravida et. Suspendisse ac ligula a neque sodales placerat et nec nulla."));
        friends.add(new FriendModel("Eduardo Luiz","Offline",R.drawable.i06,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque aliquet odio metus, et tempor nisl dignissim id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisis tempus tellus, non hendrerit elit gravida et. Suspendisse ac ligula a neque sodales placerat et nec nulla."));
        friends.add(new FriendModel("Camila Barbosa","Online",R.drawable.i07,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque aliquet odio metus, et tempor nisl dignissim id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisis tempus tellus, non hendrerit elit gravida et. Suspendisse ac ligula a neque sodales placerat et nec nulla."));
        return friends;
    }
}
