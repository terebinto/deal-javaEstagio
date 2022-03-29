package main.java.view;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.controller.ControllerCliente;
import main.java.controller.ControllerFilme;
import main.java.controller.ControllerGenero;
import main.java.entity.Cliente;
import main.java.entity.Filme;
import main.java.entity.Genero;

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

            int op = Integer.parseInt(scan.nextLine());

            switch (op) {
                case 1:
                    this.MenuCliente();
                    break;
                case 2:
                    this.MenuFilme();
                    break;
                case 3:
                    this.MenuGenero();
                    break;
                case 4:
                    System.out.println("Programa finalizado!");
                    parada = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private void MenuCliente() {

        Boolean paradaCliente = false;

        while (!paradaCliente) {

            System.out.println("Menu Cliente - Selecione uma opção");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes cadastrados");
            System.out.println("3 - Atualizar dados cliente");
            System.out.println("4 - Excluir cliente cadastrado");
            System.out.println("5 - Voltar para o menu principal");

            int opCliente = Integer.parseInt(scan.nextLine());

            String nomeCliente;
            String rgCliente;
            String cpfCliente;
            String idCliente;

            switch (opCliente) {
                case 1:

                    System.out.println("Informe o nome do cliente");
                    nomeCliente = scan.nextLine();
                    System.out.println("Informe o rg do cliente");
                    rgCliente = scan.nextLine();
                    System.out.println("Informe o cpf do cliente");
                    cpfCliente = scan.nextLine();

                    Cliente novoCliente = new Cliente(nomeCliente, rgCliente, cpfCliente);

                    ControllerCliente.salvar(novoCliente);

                    break;
                case 2:

                    ControllerCliente.listar();

                    break;

                case 3:

                    System.out.println("Informe o id do cliente");
                    idCliente = scan.nextLine();
                    System.out.println("Informe o nome do cliente");
                    nomeCliente = scan.nextLine();
                    System.out.println("Informe o rg do cliente");
                    rgCliente = scan.nextLine();
                    System.out.println("Informe o cpf do cliente");
                    cpfCliente = scan.nextLine();

                    Cliente clienteAlteracao = new Cliente(nomeCliente, rgCliente, cpfCliente);

                    ControllerCliente.alterar(idCliente, clienteAlteracao);

                    break;

                case 4:

                    System.out.println("Informe o id do cliente");
                    idCliente = scan.nextLine();

                    ControllerCliente.delete(idCliente);
                    break;

                case 5:

                    paradaCliente = true;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }

    private void MenuFilme() {

        Boolean paradaFilme = false;

        while (!paradaFilme) {
            System.out.println("Menu Filme - Selecione uma opção");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes cadastrados");
            System.out.println("3 - Atualizar dados do filme");
            System.out.println("4 - Excluir filme cadastrado");
            System.out.println("5 - Voltar para o menu principal");

            int opFilme = Integer.parseInt(scan.nextLine());

            String idFilme;
            String tituloFilme;
            String generoFilme;
            String classificacaoFilme;
            Filme filme;

            switch (opFilme) {
                case 1:

                    System.out.println("Informe o nome do filme");
                    tituloFilme = scan.nextLine();

                    System.out.println("Informe o gênero do filme");
                    generoFilme = scan.nextLine();

                    System.out.println("Informe o classificação do filme");
                    classificacaoFilme = scan.nextLine();

                    ControllerFilme.salvar(new Filme(tituloFilme, generoFilme, classificacaoFilme));

                    break;
                case 2:
                    ArrayList<Filme> filmes = ControllerFilme.listarRegistros();

                    for (Filme fil : filmes) {
                        System.out.println("Titulo: " + fil.getTitulo());
                    }
                    break;
                case 3:
                    System.out.println("Informe o id do filme que vai ser alterado");
                    idFilme = scan.nextLine();

                    System.out.println("Informe o nome do filme");
                    tituloFilme = scan.nextLine();

                    System.out.println("Informe o gênero do filme");
                    generoFilme = scan.nextLine();

                    System.out.println("Informe o classificação do filme");
                    classificacaoFilme = scan.nextLine();

                    filme = new Filme(idFilme, tituloFilme, generoFilme, classificacaoFilme);

                    ControllerFilme.atualizarRegistro(filme.getId(), filme);

                    break;
                case 4:

                    System.out.println("Informe o id do filme");
                    idFilme = scan.nextLine();
                    ControllerFilme.apagarRegistro(idFilme);

                    break;

                case 5:
                    paradaFilme = true;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }

    }

    private void MenuGenero() {

        Boolean paradaGenero = false;

        while (!paradaGenero) {

            System.out.println("Menu Genero: Selecionar um opção");
            System.out.println("1 - Cadastrar Genero");
            System.out.println("2 - Listar Genero cadastrados");
            System.out.println("3 - Atualizar dados Genero do Filme");
            System.out.println("4 - Excluir Genero do filme cadastrado");
            System.out.println("5 - Voltar para o menu principal");

            int opcaoGenero = Integer.parseInt(scan.nextLine());

            String idGenero;
            String nomeGenero;

            switch (opcaoGenero) {
                case 1:
                    System.out.println("Informe o id do Genero que vai ser alterado");
                    idGenero = scan.nextLine();
                    System.out.println("Informe o nome do Genero do Filme");
                    nomeGenero = scan.nextLine();
                    ControllerGenero.salvar(new Genero(idGenero, nomeGenero));
                    break;
                case 2:
                    ArrayList<Genero> generos = ControllerGenero.listarRegistros();

                    for (Genero gen : generos) {
                        System.out.println("Genero: " + gen.getNome());
                    }
                    break;
                case 3:
                    System.out.println("Informe o id Genero do filme que vai ser alterado");
                    idGenero = scan.nextLine();
                    System.out.println("Informe o gênero do filme");
                    nomeGenero = scan.nextLine();

                    Genero genero = new Genero(idGenero, nomeGenero);

                    ControllerGenero.atualizarRegistro(genero.getId(), genero);

                    break;
                case 4:

                    System.out.println("Informe o id do genero");
                    idGenero = scan.nextLine();
                    ControllerGenero.apagarRegistro(idGenero);

                    break;

                case 5:
                    paradaGenero = true;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;

            }
            

        }
    }

}
