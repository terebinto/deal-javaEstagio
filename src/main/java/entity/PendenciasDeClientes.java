package main.java.entity;

public class PendenciasDeClientes {

    private int dividas;
    private int atrasos;
    private int multas;

    public PendenciasDeClientes( int dividas, int atrasos, int multas){
        this.dividas = dividas;
        this.atrasos = atrasos;
        this.multas = multas;
    }

    public int getDividas() { return dividas; }

    public void setDividas(int dividas) { this.dividas = dividas; }

    public int getAtrasos() { return atrasos; }

    public void setAtrasos(int atrasos) { this.atrasos = atrasos; }

    public int getMultas() { return multas; }

    public void setMultas(int multas) { this.multas = multas; }

}
