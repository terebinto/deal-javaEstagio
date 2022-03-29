package main.java.controller;

import main.java.model.ModelCliente;

import java.util.ArrayList;

import main.java.entity.Cliente;

public class ControllerCliente {

    public static void salvar(Cliente cliente) {
        ModelCliente.criar(cliente);
    }

    public static void listar() {
        ArrayList<Cliente> clientes = ModelCliente.listar();

        for (Cliente cliente : clientes) {
            System.out.println("Id: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("RG: " + cliente.getRg());
            System.out.println("CPF: " + cliente.getCpf());
        }
    }

    public static void alterar(String registroID, Cliente cliente) {
        ModelCliente.alterar(registroID, cliente);

    }

    public static void delete(String registroID) {
        ModelCliente.delete(registroID);
    }

}
