package com.example.hershsheti.BNB_Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.hershsheti.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BajarFragment extends Fragment {

    private Button btnBay,btnSale;
    private Spinner spItemChoise;
    private ArrayList<String> itemList;
    private ArrayAdapter<String> adapter;
    private String selected_Item;

    public BajarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_bajar, container, false);

        btnSale=(Button)view.findViewById(R.id.btnSale);
        btnBay=(Button)view.findViewById(R.id.btnBay);
        spItemChoise=(Spinner)view.findViewById(R.id.spItemCoise);
        itemList=new ArrayList<>();

        itemList.add("पर्याय निवडा");
        itemList.add("गहू");
        itemList.add("बाजरी");
        itemList.add("ज्वारी");
        itemList.add("मेथी");
        itemList.add("कोथांबीर");
        itemList.add("फ्लावर");
        itemList.add("आंबा");
        itemList.add("चिकू");
        itemList.add("केली");

        adapter=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,itemList);

        spItemChoise.setAdapter(adapter);

        spItemChoise.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                selected_Item=itemList.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // This onClick methode user going to choises saling opetion
        btnSale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"तुम्ही निवडलेला पर्याय "+selected_Item,Toast.LENGTH_LONG).show();

            }
        });

        btnBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"तुम्ही निवडलेला पर्याय "+selected_Item,Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
