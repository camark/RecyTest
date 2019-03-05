package com.example.gongming.recytest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FruitRecyAdapter extends RecyclerView.Adapter<FruitRecyAdapter.ViewHolder> {
    public static final class ViewHolder extends RecyclerView.ViewHolder{

        public final TextView tv_fruitName;

        public ViewHolder(View view){
            super(view);
            tv_fruitName=view.findViewById(R.id.fruit_name);
        }
    }
    private List<String> fruits;

    public  FruitRecyAdapter(List<String> items){
        fruits=items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fruit_item_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tv_fruitName.setText(fruits.get(i));
    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }
}
