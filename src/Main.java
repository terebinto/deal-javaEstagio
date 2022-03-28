import main.java.database.BancoDeDados;

public class Main {

    public static void main(String[] args) {
        BancoDeDados.salvarNovoRegistro("Teste.csv", "Fun;cionou;");
        BancoDeDados.salvarNovoRegistro("Teste.csv", "Funcionou;denovo;");
        var res = BancoDeDados.lerListaDeRegistros("Teste.csv");
        for (var r : res) {
            for (var t : r) {
                System.out.println(t);
            }
        }
    }

}
