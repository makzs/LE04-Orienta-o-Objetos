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
            System.out.println("\nMenu:");
            System.out.println("1. Entrada de carro");
            System.out.println("2. Saída de carro");
            System.out.println("3. Emitir relatório");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    var carro = lerDadosCarro();
                    var addCarro = estacionamentoController.entradaCarro(carro);
                    if(addCarro)
                    {
                        mostrarMensagem("Carro adicionado com sucesso");
                    }
                    else
                    {
                        mostrarMensagem("Limite atingido");
                    }
                    break;
                case 2:
                    var placa = lerPlaca();
                    estacionamentoController.saidaCarro(placa);
                    mostrarMensagem("Carro removido com sucesso");
                    break;
                case 3:
                    mostrarMensagem(estacionamentoController.emitirRelatorio());
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    mostrarMensagem("Opção inválida.");
            }
        }
    }

    public String lerPlaca() {
        System.out.print("Digite a placa do carro: ");
        return scanner.nextLine();
    }

    public Carro lerDadosCarro() {
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();
        System.out.print("Digite a cor do carro: ");
        String cor = scanner.nextLine();
        System.out.println("----------------------------------------");

        return new Carro(modelo, placa, cor);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarMensagemErro(String mensagem)
    {
        System.err.println(mensagem);
    }

    public Scanner getScanner() {
        return scanner;
    }
}
