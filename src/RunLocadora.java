import java.io.*;
import java.util.Scanner;

/**
 * Exemplo de como fazer a leitura e escrita em arquivos texto com Java

 */
public class RunLocadora {


    /**
     * Escreve uma String em um arquivo texto, cujo nome fora passado via parâmetro
     * @param nome nome do arquivo texto
     * @param linha linha a ser escrita no arquivo texto
     */
    public static void abrirArquivoParaEscrita(String nome, String linha) {
        FileWriter fwArquivo;
        BufferedWriter bwArquivo;
        try {
            File arquivo = new File(nome);

            //Se o arquivo já existir, então abrir para concatenação, caso contrário criar novo arquivo
            fwArquivo = new FileWriter(arquivo, arquivo.exists());
            bwArquivo = new BufferedWriter(fwArquivo);


            // escrevendo String no arquivo e adicionando caracter para criar nova linha
            bwArquivo.write(linha + '\n');


            // fechando o arquivo
            bwArquivo.close();
            fwArquivo.close();

        } catch (IOException e) {
            System.err.println("Erro ao tentar escrever no arquivo: " + e.toString());
        }
    }

    /**
     * Imprime no dispositivo de saída padrão o conteúdo do arquivo texto, cujo nome fora passado via parâmetro
     * @param nome nome do arquivo texto
     */
    public static void lerConteudoDeArquivo(String nome){
        File arquivo = new File(nome);

        try {
            Scanner leitor = new Scanner(arquivo);

            // varrendo o conteúdo do arquivo linha por linha
            while (leitor.hasNextLine()){
                System.out.println(leitor.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Erro ao tentar ler o arquivo: " + e.toString());
        }
    }


    public static void main(String[] args) {

        String nomeDoArquivo = "c:\\tmp\\java-arquivo.txt";

        // Escrevendo algumas linhas no arquivo

        System.out.println("Escrevendo no arquivo");

        abrirArquivoParaEscrita(nomeDoArquivo, "Olá mundo");
        abrirArquivoParaEscrita(nomeDoArquivo, "Segunda linha");
        abrirArquivoParaEscrita(nomeDoArquivo, "Fim do arquivo.");

        System.out.println("Fim da escrita!");


        // Fazendo a leitura das linhas do arquivo


        System.out.println("--------------------------");
        System.out.println("Lendo conteúdo do arquivo");

        lerConteudoDeArquivo(nomeDoArquivo);

        System.out.println("--------------------------");
        System.out.println("Fim da leitura!");

    }

}
