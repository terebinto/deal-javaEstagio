package main.java.model;

import java.util.ArrayList;

import main.java.database.BancoDeDados;
import main.java.entity.Filme;

public class ModelFilme {

    public static void criar(Filme filme) {
        String id = filme.getId();
        String titulo = filme.getTitulo();
        String genero = filme.getGenero();
        String classificacao = filme.getClassificacao();

        String dados = id + ";" + titulo + ";" + genero + ";" + classificacao;

        BancoDeDados.salvarNovoRegistro("filmes.csv", dados);

    }

    public static ArrayList<Filme> listar() {
        ArrayList<String[]> registros = BancoDeDados.lerListaDeRegistros("filmes.csv");
        ArrayList<Filme> filmes = new ArrayList<>();

        for (String[] registro : registros) {
            filmes.add(new Filme(
                    registro[0], registro[1], registro[2], registro[3]));
        }

        return filmes;
    }

    public static Filme listarPorId(String id) {
        ArrayList<String[]> registros = BancoDeDados.lerListaDeRegistros("filmes.csv");

        for (String[] registro : registros) {
            if (registro[0].equals(id)) {
                return new Filme(
                        registro[0], registro[1], registro[2], registro[3]);
            }
        }

        return null;
    }

    public static void atualizar(String id, Filme filme) {

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
