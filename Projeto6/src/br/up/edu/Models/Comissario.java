package br.up.edu.Models;

public class Comissario extends Tripulacao {
    private String[] idiomas;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario,
            String[] idiomas) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.idiomas = idiomas;
    }

}