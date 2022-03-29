package main.java.database;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    static public ArrayList<String[]> lerListaDeRegistros(String nomeArquivo) {
        ArrayList<String[]> registers = new ArrayList<>();
        try {
            File file = new File(nomeArquivo);

            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                registers.add(data.split(";"));
            }
            fileReader.close();

        } catch (IOException e) {
            System.err.println("Erro ao tentar ler o arquivo: " + e.toString());
        }
        return registers;
    }

    static public void atualizarRegistro(String nomeArquivo, String registroID, String registro) {
        try {
            File file = new File(nomeArquivo);
            File tempFile = new File("temp" + nomeArquivo);

            FileWriter fwTempArquivo = new FileWriter(tempFile);
            BufferedWriter bwTempArquivo = new BufferedWriter(fwTempArquivo);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                if (data.split(";")[0].equals(registroID)) {
                    bwTempArquivo.write(registro + "\n");
                } else {
                    bwTempArquivo.write(data + "\n");
                }
            }

            bwTempArquivo.close();
            fwTempArquivo.close();
            fileReader.close();
            file.delete();
            tempFile.renameTo(file);

        } catch (IOException e) {
            System.err.println("Erro ao tentar modificar no arquivo: " + e.toString());
        }
    }

    static public void deletarRegistro(String nomeArquivo, String registroID) {
        try {
            File file = new File(nomeArquivo);
            File tempFile = new File("temp" + nomeArquivo);

            FileWriter fwTempArquivo = new FileWriter(tempFile);
            BufferedWriter bwTempArquivo = new BufferedWriter(fwTempArquivo);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                if (data.split(";")[0].equals(registroID)) {
                    continue;
                }
                bwTempArquivo.write(data + "\n");
            }
            bwTempArquivo.close();
            fwTempArquivo.close();
            fileReader.close();
            file.delete();
            tempFile.renameTo(file);

        } catch (IOException e) {
            System.err.println("Erro ao tentar deletar do arquivo: " + e.toString());
        }
    }

}