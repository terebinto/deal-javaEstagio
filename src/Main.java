import main.java.database.BancoDeDados;
import main.java.entity.Clientes;
import main.java.entity.Genero;
import main.java.model.ModelGenero;

public class Main {

    public static void main(String[] args) {
        ModelGenero.criar(new Genero("01", "Terror"));
    }

}
