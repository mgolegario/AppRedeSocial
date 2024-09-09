package com.example.appredesocial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView descRec;
    List<HomeModel> homeModelList;
    HomeAdapter homeAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        descRec = v.findViewById(R.id.rec_descubra);
        homeModelList = new ArrayList<>();
        homeAdapter = new HomeAdapter(getActivity(), homeModelList);
        descRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        descRec.setAdapter(homeAdapter);

        homeModelList.add(new HomeModel("caralegal", "Há 5 minutos", 384, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fcursinhoparamedicina.com.br%2Fblog%2Fgeografia%2Fpaisagem-em-geografia%2F&psig=AOvVaw3QwkjtgIsyHH8kGuECZELo&ust=1726010629460000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJi6v-WAt4gDFQAAAAAdAAAAABAE"));
        homeAdapter.notifyDataSetChanged();
        return v;
    }
}