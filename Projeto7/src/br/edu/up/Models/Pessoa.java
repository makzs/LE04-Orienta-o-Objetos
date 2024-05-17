package br.edu.up.Models;

public abstract class Pessoa {
    protected String rg;
    protected String Nome;
    protected String matricula;
    
    public Pessoa(String rg, String nome, String matricula) {
        this.rg = rg;
        Nome = nome;
        this.matricula = matricula;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    @Override
    public String toString() {
        return "Pessoa [rg=" + rg + ", Nome=" + Nome + ", matricula=" + matricula + "]";
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
