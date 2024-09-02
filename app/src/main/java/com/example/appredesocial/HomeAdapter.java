package com.example.appredesocial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{

        private Context context;
        private List<HomeModel> homeModelList;

    public HomeAdapter(Context context, List<HomeModel> homeModelList) {
            this.context = context;
            this.homeModelList = homeModelList;

        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.nome.setText(homeModelList.get(position).getNome());
            holder.likes.setText(homeModelList.get(position).getLikes());
            holder.tempo.setText(homeModelList.get(position).getTempo());
            holder.img.setImageResource(homeModelList.get(position).getImg());

        }

        @Override
        public int getItemCount() {
            return homeModelList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder{
            ImageView img;
            TextView nome, tempo, likes;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                nome = itemView.findViewById(R.id.tv_nome);
                likes = itemView.findViewById(R.id.tv_likes);
                tempo = itemView.findViewById(R.id.tv_tempo);
                img = itemView.findViewById(R.id.img);



            }
        }
    }