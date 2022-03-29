package main.java.model;

import java.util.ArrayList;
import main.java.entity.Cliente;
import main.java.database.BancoDeDados;

public class ModelCliente {
    public static void criar(Cliente cliente) {
        String id = cliente.getId();
        String nome = cliente.getNome();
        String rg = cliente.getRg();
        String cpf = cliente.getCpf();

        String dados = id + ";" + nome + ";" + rg + ";" + cpf;

        BancoDeDados.salvarNovoRegistro("clientes.csv", dados);

    }

    public static ArrayList<Cliente> listar() {
        ArrayList<String[]> registros = BancoDeDados.lerListaDeRegistros("clientes.csv");
        ArrayList<Cliente> clientes = new ArrayList<>();

        for (String[] registro : registros) {
            clientes.add(new Cliente(
                    registro[0], registro[1], registro[2], registro[3]));
        }

        return clientes;
    }

    public static void alterar(String id, Cliente cliente) {

        String nome = cliente.getNome();
        String rg = cliente.getRg();
        String cpf = cliente.getCpf();

        String dados = id + ";" + nome + ";" + rg + ";" + cpf;

        BancoDeDados.atualizarRegistro("clientes.csv", id, dados);
    }

    public static void delete(String id) {
        BancoDeDados.deletarRegistro("clientes.csv", id);
    }
}
