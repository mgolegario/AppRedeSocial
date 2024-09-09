package com.example.appredesocial;

import android.widget.ImageView;

public class HomeModel {
    String nome, tempo;
    Integer likes;
    String msg;

     public HomeModel() {
     }


    public HomeModel(String nome, String tempo, Integer likes, String msg) {
        this.nome = nome;
        this.tempo = tempo;
        this.likes = likes;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String img) {
        this.msg = img;
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
