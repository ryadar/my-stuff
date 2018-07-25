package com.example.hcladm.myapplication.registration;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.hcladm.myapplication.core.BaseFragment;
import com.example.hcladm.myapplication.R;

public class CountrySelectionFragment extends BaseFragment {
    RecyclerView recyclerView;
    LinearLayout searchView;
    SearchView searchView1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_country_selection, null, false);
        recyclerView = view.findViewById(R.id.country_list);
        searchView = view.findViewById(R.id.parent_layout);
        searchView1 = view.findViewById(R.id.simpleSearchView);

        searchView1.setIconifiedByDefault(false);

        searchView1.setQueryHint("Search Here");

        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(mLinearLayoutManager);
        CountryAdapter adapter = new CountryAdapter(getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}
