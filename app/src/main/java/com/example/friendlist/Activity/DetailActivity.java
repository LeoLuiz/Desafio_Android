package com.example.friendlist.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import java.util.*;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.friendlist.Model.FriendModel;
import com.example.friendlist.R;

public class DetailActivity extends AppCompatActivity {
    private Button button_back;
    private ImageView picture;
    private TextView textName, description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        button_back = findViewById(R.id.button_back);
        picture = findViewById(R.id.profile);
        textName = findViewById(R.id.name);
        description = findViewById(R.id.description);

        //Recuperando os dados
        Bundle data = getIntent().getExtras();
        FriendModel friend = (FriendModel) data.getSerializable("obj");
        textName.setText(friend.getName());
        description.setText(friend.getDescription());
        picture.setImageResource(friend.getPicture());

        //Evento de clique para o botão
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}

