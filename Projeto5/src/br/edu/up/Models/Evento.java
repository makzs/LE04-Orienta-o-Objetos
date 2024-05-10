package br.edu.up.Models;

public class Evento {
    private String nome;
    private String data;
    private int lotacao;
    private int qtdIngressos;
    private double precoIngresso;
    private Reserva[] reservas;
    private int numReservas;
    
    public Evento(String nome, String data, int lotacao, int qtdIngressos, double precoIngresso, int maxReservas) {
        this.nome = nome;
        this.data = data;
        this.lotacao = lotacao;
        this.qtdIngressos = qtdIngressos;
        this.precoIngresso = precoIngresso;
        this.reservas = new Reserva[maxReservas];
        this.numReservas = 0;
    }

    public void adicionarReserva(Reserva novaReserva){
        if (numReservas < reservas.length) { 
            this.reservas[numReservas++] = novaReserva;
        } else {
            System.out.println("Não é possível adicionar mais reservas. Limite atingido.");
        }
    }
    
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

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }




}
