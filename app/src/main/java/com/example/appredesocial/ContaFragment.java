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

public class ContaFragment extends Fragment {
    RecyclerView descRec;
    List<HomeModel> homeModelList;
    HomeAdapter homeAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v = inflater.inflate(R.layout.fragment_conta, container, false);
        descRec = v.findViewById(R.id.rec_descubra);
        homeModelList = new ArrayList<>();
        homeAdapter = new HomeAdapter(getActivity(), homeModelList);
        descRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        descRec.setAdapter(homeAdapter);


        homeModelList.add(new HomeModel("Fabrizio Romano", "Há 25 minutos", 34284, "Here we go! Memphis Depay to Corinthians!"));
        homeModelList.add(new HomeModel("Globo", "Há 2 minutos", 321, "Mario é eleito presidente do Brasil após desistência de Lula."));
        homeModelList.add(new HomeModel("Estadao", "Há 10 minutos", 512, "Após vitória incrível Mario também é eleito presidente dos EUA."));
        homeModelList.add(new HomeModel("caralegal", "Há 51 minutos", 6456, "Alunos de todas Etec vão as ruas protestar contra Bolsa Android de Mario."));
        homeModelList.add(new HomeModel("New York Times", "Há 25 minutos", 43234, "Mario is our president now!"));
        homeModelList.add(new HomeModel("Etec Ermelinda", "Há 5 segundos", 3245, "Nosso docente Mario, após ser eleito presidente também da Irlanda do Norte, não pode mais exercer seu papel de professor."));
        homeModelList.add(new HomeModel("Fabrizio Romano", "Há 5 horas", 2351, "Here we go! Mario to São Paulo!"));
        homeModelList.add(new HomeModel("F1", "Há 1 dia", 899, "Our new pilot of Mercedes is Mario! We wish good ones to him!"));
        homeModelList.add(new HomeModel("UOL", "Há 1 segundo", 567, "Entenda como Mario consquistou o coração do mundo e é o novo presidente global."));



        return v;
    }
}