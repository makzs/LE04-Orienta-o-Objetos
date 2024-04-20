package br.edu.up.Models;

public class Mes {
    private String nome;
    private int qtDias;
    private Dia[] dias;

    public Mes(int qtDias, String nome) {
        this.qtDias = qtDias;
        this.nome = nome;
    }
}
