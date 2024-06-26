package br.edu.up.Models;

public class Estacionamento {
    private static final int NUM_VAGAS = 5; // nunca muda o valor
    private Carro[] carrosEstacionados;
    private int numCarros;
    private double totalPagamentos;
    private int totalCarrosEntraram;
    private int totalCarrosSairam;


    public Estacionamento() {
        carrosEstacionados = new Carro[NUM_VAGAS];
        numCarros = 0;
    }

    public boolean entradaCarro(Carro carro) {
        if (numCarros < NUM_VAGAS) {
            carrosEstacionados[numCarros] = carro;
            numCarros++;
            totalPagamentos += 5.00;
            totalCarrosEntraram++;
            return true;
        }
        return false;
    }

    public Carro saidaCarro(String placa) {
        for (int i = 0; i < numCarros; i++) {
            if (carrosEstacionados[i].getPlaca().equals(placa)) {
                Carro carroSaida = carrosEstacionados[i];
                // Remover carro do array e ajustar os elementos
                for (int j = i; j < numCarros - 1; j++) {
                    carrosEstacionados[j] = carrosEstacionados[j + 1];
                }
                numCarros--;
                totalCarrosSairam++;
                return carroSaida;
            }
        }
        return null; 
    }

    public int getTotalCarrosEstacionados() {
        return numCarros;
    }

    public double calcularPagamentoPeriodo() {
        return totalPagamentos;
    }

    public int getTotalCarrosEntraram() {
        return totalCarrosEntraram;
    }

    public int getTotalCarrosSairam() {
        return totalCarrosSairam;
    }
    
}
