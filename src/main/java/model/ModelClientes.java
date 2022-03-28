package main.java.model;

import java.util.ArrayList;
import main.java.entity.Clientes;
import main.java.database.BancoDeDados;

public class ModelClientes {

    private final String arquivo = "clientes.csv";

    public String getArquivo() {
        return arquivo;
    }

    public void salvar(Clientes cliente) {
        String linha = String
                .valueOf(cliente.getid() + ";" + cliente.getNome() + ";" + cliente.getCpf() + ";" + cliente.getRg());
        BancoDeDados.salvarNovoRegistro(getArquivo(), linha);

    }

    public void listar() {
        ArrayList<String[]> registros = BancoDeDados.lerListaDeRegistros(getArquivo());
        for (String[] registro : registros) {
            String cliente = registro[0] + " " + registro[1] + " " + registro[2] + " " + registro[3];
            System.out.println(cliente);

        }
    }

}
