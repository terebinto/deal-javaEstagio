package main.java.controller;

import java.util.ArrayList;

import main.java.entity.Filme;
import main.java.model.ModelFilme;

public class ControllerFilme {

    public static void salvar(Filme filme) {
        ModelFilme.criar(filme);
    }

    public static ArrayList<Filme> listarRegistros() {
        return ModelFilme.listar();
    }

    public static Filme listarRegistroPorId(String id) {
        return ModelFilme.listarPorId(id);
    }

    public static void atualizarRegistro(String id, Filme filme) {
        ModelFilme.atualizar(id, filme);
    }

    public static void apagarRegistro(String id) {
        ModelFilme.apagarRegistro(id);
    }

}
