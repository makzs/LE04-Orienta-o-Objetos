package br.edu.up.Models;

public class Mes extends Ano {
    private String nome;
    private int qtDias;
    private Dia[] dias;

    Mes(int qtDias, String nome) {
        this.qtDias = qtDias;
        this.nome = nome;
    }
}
