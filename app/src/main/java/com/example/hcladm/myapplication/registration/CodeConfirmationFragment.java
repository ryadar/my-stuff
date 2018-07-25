package com.example.hcladm.myapplication.registration;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hcladm.myapplication.core.BaseFragment;
import com.example.hcladm.myapplication.R;

public class CodeConfirmationFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_registration_code,null,false);
        return  view;

    }
}
