package main.java.model;

import java.util.ArrayList;

import main.java.database.BancoDeDados;
import main.java.entity.Filmes;

public class ModelFilmes {

    public ModelFilmes() {

    }

    public static void criar(Filmes filme) {
        String id = filme.getId();
        String titulo = filme.getTitulo();
        String genero = filme.getGenero();
        String classificacao = filme.getClassificacao();

        String dados = id + ";" + titulo + ";" + genero + ";" + classificacao + ";";

        BancoDeDados.salvarNovoRegistro("filmes.csv", dados);

    }

    public static ArrayList<Filmes> listarRegistros() {
        ArrayList<String[]> registros = BancoDeDados.lerListaDeRegistros("filmes.csv");
        ArrayList<Filmes> filmes = new ArrayList<>();

        for (String[] registro : registros) {
            filmes.add(new Filmes(
                    registro[0], registro[1], registro[2], registro[3]));
        }

        return filmes;
    }

    public static Filmes listarRegistroPorId(String id) {
        ArrayList<String[]> registros = BancoDeDados.lerListaDeRegistros("filmes.csv");

        for (String[] registro : registros) {
            if (registro[0].equals(id)) {
                return new Filmes(
                        registro[0], registro[1], registro[2], registro[3]);
            }
        }

        return null;
    }

    public static void atulizarRegistro(String id, Filmes filme) {

        String titulo = filme.getTitulo();
        String genero = filme.getGenero();
        String classificacao = filme.getClassificacao();

        String dados = id + ";" + titulo + ";" + genero + ";" + classificacao + ";";

        BancoDeDados.atualizarRegistro("filmes.csv", id, dados);
    }

    public static void apagarRegistro(String id) {
        BancoDeDados.deletarRegistro("filmes.csv", id);
    }

}
