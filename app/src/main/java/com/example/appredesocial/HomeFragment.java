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

        homeModelList.add(new HomeModel("caralegal", "Há 5 minutos", 384, "salve tropaaaa novo aqui e vcs"));
        homeModelList.add(new HomeModel("Alexandre de Moraes", "Há 44 minutos", 43928, "👀"));
        homeModelList.add(new HomeModel("Calleri", "Há 1 minuto", 3844324, "São Paulo pra sempre! Chupa Corinthians!"));
        homeModelList.add(new HomeModel("Luciano", "Há 2 segundos", 5345, "Calleri muito engraçado 🤣🤣🤣"));
        homeModelList.add(new HomeModel("Mario", "Há 34 minutos", 14325, "Pelo menos tem uma nova rede pra twettar."));
        homeModelList.add(new HomeModel("Usuario Desconhecido", "Há 51 minutos", 5436, "Testando por aqui..."));
        homeModelList.add(new HomeModel("tododiaumafrasesobreocorinthians", "Há 57 minutos", 43242356, "O corinthians é o menor time do mundo"));
        homeModelList.add(new HomeModel("FlowPodcast", "Há 12 minutos", 899564, "Já já episódio com Mario, nosso novo presidente!"));
        homeModelList.add(new HomeModel("caralegal", "Há 16 minutos", 8765, "teste teste teste teste"));

        homeAdapter.notifyDataSetChanged();
        return v;
    }
}