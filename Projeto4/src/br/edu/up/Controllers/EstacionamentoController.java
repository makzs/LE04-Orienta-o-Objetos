package br.edu.up.Controllers;

import br.edu.up.Models.Carro;
import br.edu.up.Models.Estacionamento;
import br.edu.up.Views.EstacionamentoView;

public class EstacionamentoController {
    private Estacionamento estacionamento;
    private EstacionamentoView estacionamentoView;
    private int totalEntradas;
    private int totalSaidas;

    public EstacionamentoController(Estacionamento estacionamento, EstacionamentoView estacionamentoView) {
        this.estacionamento = estacionamento;
        this.estacionamentoView = estacionamentoView;
        this.totalEntradas = 0;
        this.totalSaidas = 0;
    }

    public void entradaCarro() {
        Carro carro = estacionamentoView.lerDadosCarro();
        boolean sucesso = estacionamento.entradaCarro(carro);
        if (sucesso) {
            estacionamentoView.mostrarMensagem("Carro estacionado com sucesso!");
            totalEntradas++;
        } else {
            estacionamentoView.mostrarMensagem("Estacionamento lotado. Não foi possível estacionar o carro.");
        }
    }

    public void saidaCarro() {
        String placa = estacionamentoView.lerPlaca();
        Carro carro = estacionamento.saidaCarro(placa);
        if (carro != null) {
            estacionamentoView.mostrarMensagem("Carro com placa " + placa + " foi retirado do estacionamento.");
            totalSaidas++;
        } else {
            estacionamentoView.mostrarMensagem("Carro com placa " + placa + " não encontrado no estacionamento.");
        }
    }

    public void emitirRelatorio() {
        estacionamentoView.mostrarMensagem("Total de veículos que entraram: " + totalEntradas);
        estacionamentoView.mostrarMensagem("Total de veículos que saíram: " + totalSaidas);
        int totalCarrosEstacionados = estacionamento.getTotalCarrosEstacionados();
        double valorTotal = estacionamento.calcularPagamentoPeriodo();
        estacionamentoView.mostrarMensagem("Total de veículos estacionados: " + totalCarrosEstacionados);
        estacionamentoView.mostrarMensagem("Valor total a pagar: R$ " + valorTotal);
    }
}
