package br.edu.up.Models;

public class Evento {
    private String nome;
    private String data;
    private int lotacao;
    private int qtdIngressos;
    private double precoIngresso;


    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getLotacao() {
        return lotacao;
    }
    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
    public int getQtdIngressos() {
        return qtdIngressos;
    }
    public void setQtdIngressos(int qtdIngressos) {
        this.qtdIngressos = qtdIngressos;
    }
    public double getPrecoIngresso() {
        return precoIngresso;
    }
    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

}
