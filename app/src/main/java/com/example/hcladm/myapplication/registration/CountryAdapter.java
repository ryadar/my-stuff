package com.example.hcladm.myapplication.registration;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hcladm.myapplication.R;

public class CountryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public CountryAdapter(Context context) {

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.country_selection, viewGroup, false);
        return new CountriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        Country country = Countries.COUNTRIES.get(position);
        CountriesViewHolder holder = (CountriesViewHolder) viewHolder;
        holder.countryName.setText(country.getName());
    }

    @Override
    public int getItemCount() {
        return Countries.COUNTRIES.size();
    }
}
