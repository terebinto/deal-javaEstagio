import java.util.Scanner;


public class LeituraJava {
    public static void main(String[] args) {
        System.out.print("Digite uma mensagem: ");
        Scanner entrada = new Scanner(System.in);
        String linha = entrada.nextLine();
        System.out.println("Mensagem digitada: " + linha);
    }
}