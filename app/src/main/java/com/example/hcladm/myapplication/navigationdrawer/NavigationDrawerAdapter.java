package com.example.hcladm.myapplication.navigationdrawer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hcladm.myapplication.R;


public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerViewHolder> {
    String[] list;

    public NavigationDrawerAdapter(Context context) {
        list = context.getResources().getStringArray(R.array.navigation_drawer_items);
    }

    @NonNull
    @Override
    public NavigationDrawerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.navigation_drawer_items, viewGroup, false);
        return new NavigationDrawerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NavigationDrawerViewHolder viewHolder, int position) {
        String name = list[position];
        viewHolder.name.setText(name);

    }

    @Override
    public int getItemCount() {
        return list.length;
    }

}
