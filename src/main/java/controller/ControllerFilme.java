package main.java.controller;

import java.util.ArrayList;

import main.java.entity.Filmes;
import main.java.model.ModelFilmes;

public class ControllerFilme {

    public static void criar(Filmes filme) {
        ModelFilmes.criar(filme);
    }

    public static ArrayList<Filmes> listarRegistros() {
        return ModelFilmes.listarRegistros();
    }

    public static Filmes listarRegistroPorId(String id) {
        return ModelFilmes.listarRegistroPorId(id);
    }

    public static void atualizarRegistro(String id, Filmes filme) {
        ModelFilmes.atulizarRegistro(id, filme);
    }

    public static void apagarRegistro(String id) {
        ModelFilmes.apagarRegistro(id);
    }

}
