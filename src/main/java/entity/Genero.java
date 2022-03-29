package main.java.entity;

import java.util.UUID;

public class Genero {

    private String id;
    private String nome;

    public Genero(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Genero(String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
