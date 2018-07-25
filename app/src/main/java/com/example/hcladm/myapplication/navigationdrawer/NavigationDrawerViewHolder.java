package com.example.hcladm.myapplication.navigationdrawer;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hcladm.myapplication.R;

public class NavigationDrawerViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public ImageView imageView;


    public NavigationDrawerViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.nav_item_name);
        imageView = itemView.findViewById(R.id.nav_image_view);

    }
}
