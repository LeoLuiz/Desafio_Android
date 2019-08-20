package com.example.friendlist.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.friendlist.Model.FriendModel;
import com.example.friendlist.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
   public static class ViewHolder extends RecyclerView.ViewHolder{

       private TextView name,status;
       ImageView picture;

       public ViewHolder(View itemView){
           super(itemView);
           name = (TextView)itemView.findViewById(R.id.name);
           status = (TextView)itemView.findViewById(R.id.stats);
           picture = (ImageView)itemView.findViewById(R.id.img);
       }
   }

    public List<FriendModel> friendlist;

    public RecyclerViewAdapter(List<FriendModel> friendlist) {
        this.friendlist = friendlist;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friends,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(friendlist.get(position).getName());
        holder.status.setText(friendlist.get(position).getStatus());
        holder.picture.setImageResource(friendlist.get(position).getPicture());
    }

    @Override
    public int getItemCount() {

        return friendlist.size();
    }
}

