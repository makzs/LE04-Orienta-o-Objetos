package br.up.edu.Views;

import java.util.Scanner;

import br.up.edu.Controllers.AeroportoController;
import br.up.edu.Models.Passageiro;
import br.up.edu.Models.Passagem;
import br.up.edu.Models.Tripulacao;

public class AeroportoView {
    private Scanner scanner;
    private AeroportoController controller;

    public AeroportoView() {
        this.scanner = new Scanner(System.in);
        this.controller = new AeroportoController();
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n### Menu do Aeroporto ###");
            System.out.println("1. Adicionar Passageiro");
            System.out.println("2. Adicionar Tripulação");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarTripulacao();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    private void adicionarPassageiro() {
        System.out.println("\n### Adicionar Passageiro ###");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Identificador de Bagagem: ");
        String identificadorBagagem = scanner.nextLine();
        Passagem passagem = new Passagem(1, "Econômica", null);
        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, passagem);
        controller.adicionarPassageiro(passageiro);
        System.out.println("Passageiro adicionado com sucesso!");
    }

    private void adicionarTripulacao() {
        System.out.println("\n### Adicionar Tripulação ###");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Identificação Aeronáutica: ");
        String identificacaoAeronautica = scanner.nextLine();
        System.out.print("Matrícula do Funcionário: ");
        String matriculaFuncionario = scanner.nextLine();
        Tripulacao tripulacao = new Tripulacao(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        controller.adicionarTripulacao(tripulacao);
        System.out.println("Tripulação adicionada com sucesso!");
    }
}
