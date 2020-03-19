package com.example.hershsheti.BNB_Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hershsheti.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BajarFragment extends Fragment {

    public BajarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_bajar, container, false);

        return view;
    }
}
