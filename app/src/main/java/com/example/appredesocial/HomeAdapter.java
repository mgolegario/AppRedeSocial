package com.example.appredesocial;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

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
            holder.msg.setText(homeModelList.get(position).getMsg());
            holder.likes.setText(homeModelList.get(position).getLikes().toString());
            holder.tempo.setText(homeModelList.get(position).getTempo());
        }

        @Override
        public int getItemCount() {
            return homeModelList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder{

            TextView nome, tempo, likes, msg;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                nome = itemView.findViewById(R.id.tv_nome);
                likes = itemView.findViewById(R.id.tv_likes);
                tempo = itemView.findViewById(R.id.tv_tempo);
                msg = itemView.findViewById(R.id.msg);



            }
        }
    }