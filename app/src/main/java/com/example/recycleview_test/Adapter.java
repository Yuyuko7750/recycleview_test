
package com.example.recycleview_test;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.InnerHolder> {
    private ArrayList<Text> data;
    public Adapter(ArrayList<Text> data){
        this.data=data;
    }
    @NonNull
    @Override
    public Adapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new
    InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {
        holder.name.setText(data.get(position).getName());
        holder.time.setText(data.get(position).getTime());
        holder.message.setText(data.get(position).getMessage());
    }
    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class InnerHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView time;
        TextView message;
        ImageView picture;
        public InnerHolder(@NonNull View itemView){
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            message = (TextView)itemView.findViewById(R.id.message);
            time = (TextView)itemView.findViewById(R.id.time);

        }
    }
}
