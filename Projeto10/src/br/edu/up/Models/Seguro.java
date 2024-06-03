package br.edu.up.Models;

public abstract class Seguro {
    private Segurado segurado;
    private String numeroApolice;
    private double valor;

    
    public Seguro() {
        super();
    }

    public Seguro(Segurado segurado, String numeroApolice, double valor) {
        this.segurado = segurado;
        this.numeroApolice = numeroApolice;
        this.valor = valor;
    }

    public String getSegurado() {
        return segurado.toString();
    }

    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
