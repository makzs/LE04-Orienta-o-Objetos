package br.edu.up.Models;

public class SeguroVeiculo extends Seguro {

    private String modelo;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public SeguroVeiculo(Segurado segurado, String numeroApolice, double valor) {
        super(segurado, numeroApolice, valor);
    }

    public SeguroVeiculo() {
        super();
    }


    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
