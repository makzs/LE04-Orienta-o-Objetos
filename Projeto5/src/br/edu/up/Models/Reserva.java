package br.edu.up.Models;

public class Reserva {
    private String nome;
    private int qtdPessoas;
    private String data;
    private double valor;


    
    public Reserva(String nome, int qtdPessoas, String data, double valor) {
        this.nome = nome;
        this.qtdPessoas = qtdPessoas;
        this.data = data;
        this.valor = valor;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}
