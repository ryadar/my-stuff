package com.example.hcladm.myapplication.registration;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hcladm.myapplication.R;

public class CountriesViewHolder extends RecyclerView.ViewHolder {
    public TextView countryName;

    public CountriesViewHolder(@NonNull View view) {
        super(view);
        countryName =  view.findViewById(R.id.countryName);
    }
}
