import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);

        try {
            PrintWriter writer = new PrintWriter(new File("test.csv"));

            String str = "id; Name; Address\n101; John Doe; Las Vegas\n";

            // writer.println(str);
            writer.append(str);

            writer.close();
            System.out.println("done!");
            /*
             * File file = new File("arquivo.txt");
             * ObjectOutputStream output = new ObjectOutputStream(new
             * FileOutputStream(file));
             * 
             * output.writeObject(teste);
             * 
             * output.close();
             * System.out.println("Dados salvos com sucesso!");
             * File file = new File("arquivo.txt");
             * ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
             * 
             * String resultado = input.readLine();
             * 
             * input.close();
             * System.out.println(resultado);
             */
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
