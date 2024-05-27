package br.edu.up.Controllers;

import br.edu.up.Models.Carro;
import br.edu.up.Models.Estacionamento;

public class EstacionamentoController {
    private Estacionamento estacionamento;

    public EstacionamentoController() {
        this.estacionamento = new Estacionamento();
    }

    public boolean entradaCarro(Carro carro) {
        return estacionamento.entradaCarro(carro);
    }

    public Carro saidaCarro(String placa) {
        return estacionamento.saidaCarro(placa);
    }

    public int getTotalCarrosEstacionados() {
        return estacionamento.getTotalCarrosEstacionados();
    }

    public double calcularPagamentoPeriodo() {
        return estacionamento.calcularPagamentoPeriodo();
    }

    public String emitirRelatorio() {
        int totalCarrosEntraram = estacionamento.getTotalCarrosEntraram();
        int totalCarrosSairam = estacionamento.getTotalCarrosSairam();
        int carrosEstacionadosAgora = estacionamento.getTotalCarrosEstacionados();
        double pagamentoPeriodo = calcularPagamentoPeriodo();

        return "Relatório de Estacionamento:\n" +
                "Total de carros que entraram: " + totalCarrosEntraram + "\n" +
                "Total de carros que saíram: " + totalCarrosSairam + "\n" +
                "Carros estacionados agora: " + carrosEstacionadosAgora + "\n" +
                "Pagamento total acumulado no período: R$ " + pagamentoPeriodo;
    }

}