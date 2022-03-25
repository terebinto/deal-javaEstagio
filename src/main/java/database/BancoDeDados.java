package main.java.database;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class BancoDeDados {
    
    static public void salvarNovoRegistro(String nomeArquivo, String texto) {
        try {
            FileWriter fwArquivo;
            BufferedWriter bwArquivo;
            File arquivo = new File(nomeArquivo);

            fwArquivo = new FileWriter(arquivo, arquivo.exists());
            bwArquivo = new BufferedWriter(fwArquivo);
            bwArquivo.write(texto + '\n');

            bwArquivo.close();
            fwArquivo.close();

        } catch (IOException e) {
            System.err.println("Erro ao tentar escrever no arquivo: " + e.toString());
        }
    }

    static public List<String[]> lerListaDeRegistros(String nomeArquivo) {
        List<String[]> registers = List.of();
        try {
            File file = new File(nomeArquivo);

            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                registers.add(data.split(";"));
                System.out.println(data);
            }
            fileReader.close();

        } catch (IOException e) {
            System.err.println("Erro ao tentar escrever no arquivo: " + e.toString());
        }
        return registers;
    }
    
}