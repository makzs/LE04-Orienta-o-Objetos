package br.edu.up.Views;

import java.util.Scanner;

import br.edu.up.Controllers.EstacionamentoController;
import br.edu.up.Models.Carro;

public class EstacionamentoView {
    private Scanner scanner;
    private EstacionamentoController estacionamentoController;

    public EstacionamentoView() {
        this.scanner = new Scanner(System.in);
        this.estacionamentoController = new EstacionamentoController();
    }

    public void exibirMenu() {
        boolean continuar = true;
        while (continuar) {
            exibirOpcoesMenu();
            int opcao = lerOpcaoMenu();
            switch (opcao) {
                case 1:
                    entradaCarro();
                    break;
                case 2:
                    saidaCarro();
                    break;
                case 3:
                    emitirRelatorio();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    mostrarMensagem("Opção inválida.");
            }
        }
    }

    private void exibirOpcoesMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Entrada de carro");
        System.out.println("2. Saída de carro");
        System.out.println("3. Emitir relatório");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private int lerOpcaoMenu() {
        return scanner.nextInt();
    }

    private void entradaCarro() {
        var carro = lerDadosCarro();
        var addCarro = estacionamentoController.entradaCarro(carro);
        if (addCarro) {
            mostrarMensagem("Carro adicionado com sucesso");
        } else {
            mostrarMensagem("Limite atingido");
        }
    }

    private void saidaCarro() {
        var placa = lerPlaca();
        var carroParaRemover = estacionamentoController.saidaCarro(placa);
        if (carroParaRemover == null) {
            mostrarMensagem("Carro não encontrado");
        } else {
            mostrarMensagem("Carro removido com sucesso");
        }
    }

    private void emitirRelatorio() {
        mostrarMensagem(estacionamentoController.emitirRelatorio());
    }

    private String lerPlaca() {
        System.out.print("Digite a placa do carro: ");
        return scanner.next();
    }

    private Carro lerDadosCarro() {
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.next();
        System.out.print("Digite a placa do carro: ");
        String placa = scanner.next();
        System.out.print("Digite a cor do carro: ");
        String cor = scanner.next();
        System.out.println("----------------------------------------");

        return new Carro(modelo, placa, cor);
    }

    private void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
