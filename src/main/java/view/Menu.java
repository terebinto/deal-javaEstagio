package main.java.view;

import java.util.Scanner;

import main.java.controller.ControllerClientes;
import main.java.entity.Clientes;

public class Menu {

    Scanner scan = new Scanner(System.in);

    public void MenuGeral() {

        Boolean parada = false;

        while (!parada) {

            System.out.println("Selecione uma opção");
            System.out.println("1 - Menu Cliente");
            System.out.println("2 - Menu Filme");
            System.out.println("3 - Menu Gênero");
            System.out.println("4 - Sair do programa");

            int op = scan.nextInt();

            switch (op) {
                case 1:
                    this.MenuCliente();
                    break;

                default:
                    break;
            }
        }
    }

    public void MenuCliente() {

        ControllerClientes controller = new ControllerClientes();

        System.out.println("Menu Cliente - Selecione uma opção");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Listar clientes cadastrados");
        System.out.println("3 - Atualizar dados cliente");
        System.out.println("4 - Excluir cliente cadastrado");
        System.out.println("5 - Voltar para o menu principal");

        int opCliente = scan.nextInt();

        switch (opCliente) { 
            case 1:

                System.out.println("Informe o id do cliente");
                int idCliente = scan.nextInt();
                System.out.println("Informe o nome do cliente");
                String nomeCliente = scan.next();
                System.out.println("Informe o rg do cliente");
                String rgCliente = scan.next();
                System.out.println("Informe o cpf do cliente");
                String cpfCliente = scan.next();

                Clientes cliente = new Clientes(nomeCliente, rgCliente, cpfCliente, idCliente);

                controller.salvar(cliente);

                break;
            case 2:

                

                break;

            default:
                break;
        }

    }

    public void MenuFilme() {

    }

    public void MenuGenero() {

    }

}
