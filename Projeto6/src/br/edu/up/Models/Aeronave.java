package br.edu.up.Models;

public class Aeronave {
    private String codigo;
    private String tipo;
    private int quantidadeAssentos;

    public Aeronave(String codigo, String tipo, int quantidadeAssentos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.quantidadeAssentos = quantidadeAssentos;
    }

}