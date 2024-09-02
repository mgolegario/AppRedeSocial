package com.example.appredesocial;

import android.widget.ImageView;

public class HomeModel {
    String nome, tempo;
    Integer likes;
    Integer img;

     public HomeModel() {
     }


    public HomeModel(String nome, String tempo, Integer likes, Integer img) {
        this.nome = nome;
        this.tempo = tempo;
        this.likes = likes;
        this.img = img;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
