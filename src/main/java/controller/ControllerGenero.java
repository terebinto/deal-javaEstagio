package main.java.controller;

import java.util.ArrayList;

import main.java.entity.Genero;
import main.java.model.ModelGenero;

public class ControllerGenero {

    public static void salvar(Genero nome) {
        ModelGenero.criar(nome);
    }

    public static ArrayList<Genero> listarRegistros() {
        return ModelGenero.listar();
    }

    public static void atualizarRegistro(String id, Genero nome) {
        ModelGenero.atualizar(id, nome);
    }

    public static void apagarRegistro(String id) {
        ModelGenero.apagarRegistro(id);
    }

}
