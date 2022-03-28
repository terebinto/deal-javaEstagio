import main.java.database.BancoDeDados;
import main.java.entity.Clientes;
import main.java.model.ModelClientes;

public class Main {

    public static void main(String[] args) {
        Clientes cliente = new Clientes("Julio", "375.456.893-1","948356091-01", 9);
        ModelClientes model = new ModelClientes();
        model.salvar(cliente);
        model.listar();
    }

}
