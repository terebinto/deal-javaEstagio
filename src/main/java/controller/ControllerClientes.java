package main.java.controller;

import main.java.model.ModelClientes;
import main.java.entity.Clientes;

public class ControllerClientes {
        ModelClientes modelClientes = new ModelClientes();

    public void salvar( Clientes cliente){

        this.modelClientes.salvar(cliente);
    }
    
    public void listar(){
        this.modelClientes.listar();
    }

    public void alterar(String registroID, Clientes cliente){
        this.modelClientes.alterar(registroID, cliente);

    }

    public void delete (String registroID){
        this.modelClientes.delete(registroID);
    }
    
}
