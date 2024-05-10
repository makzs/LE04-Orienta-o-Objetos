package br.up.edu.Models;

public class Tripulacao extends Pessoa {
    private String identificacaoAeronautica;
    private String matriculaFuncionario;

    public Tripulacao(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario) {
        super(nome, rg);
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

}