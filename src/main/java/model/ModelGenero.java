package main.java.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import main.java.database.BancoDeDados;
import main.java.entity.Genero;


public class ModelGenero {

    public static void criar(Genero genero){
        String id = genero.getId();
        String nome = genero.getNome();

        String dados = id+";"+nome;

        BancoDeDados.salvarNovoRegistro("genero.csv", dados);

    }

    public static ArrayList<Genero> listarRegistros(){
        ArrayList<String[]> registros = BancoDeDados.lerListaDeRegistros("genero.csv");
        ArrayList<Genero> nome = new ArrayList<>();

        for (String[] registro : registros) {
            nome.add(new Genero(
                registro[0], registro[1]));
        }

        return nome;
    }

   public static void atualizarRegistro(String id, Genero genero){

        String nome = genero.getNome();

        String registro = id+";"+nome;

        BancoDeDados.atualizarRegistro("genero.csv", id, registro);
    }

    public static void apagarRegistro(String id){
        BancoDeDados.deletarRegistro("genero.csv", id);
    }

}