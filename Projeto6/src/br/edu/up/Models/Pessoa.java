package br.edu.up.Models;

public class Pessoa {
    private String nome;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

}