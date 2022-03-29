package main.java.entity;

import java.util.UUID;

public class Cliente {

    private String id;
    private String nome;
    private String rg;
    private String cpf;

    public Cliente(String id, String nome, String rg, String cpf) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Cliente(String nome, String rg, String cpf) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
