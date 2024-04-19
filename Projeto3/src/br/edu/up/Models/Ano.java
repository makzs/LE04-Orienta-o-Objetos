package br.edu.up.Models;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto){
        this.ano = ano;
        this.bissexto = bissexto;
    }
}
