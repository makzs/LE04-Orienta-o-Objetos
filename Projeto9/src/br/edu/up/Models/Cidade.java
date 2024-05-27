package br.edu.up.Models;

public class Cidade {
    private String nome;
    private String UF;

    public Cidade(String nome, String uF) {
        this.nome = nome;
        UF = uF;
    }

    public String cidadeToCSV() {
        return nome + "," + UF;
    }

    @Override
    public String toString() {
        return "Cidade [nome=" + nome + ", UF=" + UF + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUF() {
        return UF;
    }
    public void setUF(String uF) {
        UF = uF;
    }

    
}
