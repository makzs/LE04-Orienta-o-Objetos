package br.edu.up.Models;

public class Competencia {
    private String nome;
    private boolean necessario;
    
    public Competencia(String nome, boolean necessario) {
        this.nome = nome;
        this.necessario = necessario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isNecessario() {
        return necessario;
    }

    public void setNecessario(boolean necessario) {
        this.necessario = necessario;
    }

    
}
