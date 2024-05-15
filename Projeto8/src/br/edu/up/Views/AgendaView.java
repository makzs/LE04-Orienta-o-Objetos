package br.edu.up.Views;

import java.util.Scanner;

import br.edu.up.Controllers.AgendaController;

public class AgendaView {
    private AgendaController agendaController;
    private Scanner scanner;

    public AgendaView() {
        this.agendaController = new AgendaController();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcao = 0;
        do {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Excluir contato");
            System.out.println("3. Listar contatos");
            System.out.println("4. Sair");
            System.out.println("5. Buscar contato por codigo");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    excluirContato();
                    break;
                case 3:
                    listarContatos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                case 5:
                    buscarContato();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private void adicionarContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o tipo de contato (1 para Pessoal, 2 para Comercial): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (tipo == 1) {
            System.out.print("Digite o aniversário (DD/MM/YYYY): ");
            String aniversario = scanner.nextLine();
            agendaController.adicionarContatoPessoal(nome, telefone, aniversario);
        } else if (tipo == 2) {
            System.out.print("Digite o CNPJ: ");
            String cnpj = scanner.nextLine();
            agendaController.adicionarContatoComercial(nome, telefone, cnpj);
        } else {
            System.out.println("Tipo de contato inválido.");
        }
    }

    private void excluirContato() {
        System.out.print("Digite o código do contato a ser excluído: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        agendaController.excluirContato(codigo);
    }

    private void buscarContato() {
        System.out.println("Informe o codigo para buscar o contato");
        int codigo = scanner.nextInt();
        var contato = agendaController.BuscarContato(codigo);

        System.out.println(contato.toString());
    }

    private void listarContatos() {
        System.out.println(agendaController.listarContatos());
    }
}
