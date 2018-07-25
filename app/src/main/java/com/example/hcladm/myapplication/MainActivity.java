package com.example.hcladm.myapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.example.hcladm.myapplication.home.HomeFragment;
import com.example.hcladm.myapplication.navigationdrawer.NavigationDrawerAdapter;

public class MainActivity extends AppCompatActivity implements HomeFragment.BottomSheetNavigation{


    RecyclerView recyclerView;

    BottomSheetBehavior sheetBehavior;
    LinearLayout layoutBottomSheet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        layoutBottomSheet = findViewById(R.id.bottom_sheet);

        sheetBehavior = BottomSheetBehavior.from(layoutBottomSheet);

        HomeFragment fragment = new HomeFragment();
        fragment.setNavigation(this);

        transaction.add(R.id.content_frame, fragment, "TAG").commit();


        recyclerView = findViewById(R.id.nav_drawer_list);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        NavigationDrawerAdapter adapter = new NavigationDrawerAdapter(getApplicationContext());
        recyclerView.setAdapter(adapter);


        sheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState) {
                    case BottomSheetBehavior.STATE_HIDDEN:
                        break;
                    case BottomSheetBehavior.STATE_EXPANDED: {
                        //btnBottomSheet.setText("Close Sheet");
                    }
                    break;
                    case BottomSheetBehavior.STATE_COLLAPSED: {
                        //btnBottomSheet.setText("Expand Sheet");
                    }
                    break;
                    case BottomSheetBehavior.STATE_DRAGGING:
                        break;
                    case BottomSheetBehavior.STATE_SETTLING:
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
    }

    @Override
    public void close() {

    }

    @Override
    public void open() {

    }
}

