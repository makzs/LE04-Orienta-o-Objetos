package br.edu.up.Models;

public class Ponto {
    private double x;
    private double y;

    // Construtor
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos para acessar as coordenadas
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double deltaX = outroPonto.getX() - x;
        double deltaY = outroPonto.getY() - y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public double calcularDistanciaOrigem() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Ponto calcularPontoMedio(Ponto outroPonto) {
        double medioX = (x + outroPonto.getX()) / 2;
        double medioY = (y + outroPonto.getY()) / 2;
        return new Ponto(medioX, medioY);
    }
}