package main.java.entity;

import java.util.UUID;

public class Filmes {

    private String id;
    private String titulo;
    private String genero;
    private String classificacao;

    public Filmes(String id, String titulo, String genero, String classificacao) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
    }

    public Filmes(String titulo, String genero, String classificacao) {
        this.id = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

}
