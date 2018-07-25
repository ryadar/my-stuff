package com.example.hcladm.myapplication.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hcladm.myapplication.R;
import com.example.hcladm.myapplication.core.BaseFragment;

public class HomeFragment extends BaseFragment {

    SearchView searchView;

    Button buttonOpen;
    Button buttonClose;
    BottomSheetNavigation bottomSheetNavigation;

    public void setNavigation(BottomSheetNavigation navigation){
        bottomSheetNavigation=navigation;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null, false);
        searchView =view.findViewById(R.id.home_search_view);
        searchView.setIconifiedByDefault(false);
        searchView.setQueryHint(getString(R.string.home_search_hint));

        buttonOpen = view.findViewById(R.id.openBottomSheet);

        buttonClose = view.findViewById(R.id.closeBottomSheet);


        buttonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetNavigation.open();
            }
        });


        buttonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetNavigation.close();
            }
        });

        return view;
    }

    public interface BottomSheetNavigation{
        void close();
        void open();
    }
}
