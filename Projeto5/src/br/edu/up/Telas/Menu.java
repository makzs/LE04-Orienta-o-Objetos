package br.edu.up.Telas;

import java.util.Scanner;

import br.edu.up.Controlers.ControllerEventos;
import br.edu.up.Models.Evento;
import br.edu.up.Models.Reserva;

public class Menu {
    ControllerEventos controleEventos = new ControllerEventos(20, 10);

    public void mostrar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("Menu principal");
        System.out.println("-----------------------------------");
        System.out.println("1. Eventos");
        System.out.println("2. Reservas");
        System.out.println("-----------------------------------");
        System.out.println("Informe a opção que deseja: ");
        int opcao = leitor.nextInt();

        if (opcao == 1) {
            telaEventos();
        } else if (opcao == 2) {
            telaReservas();
        } else {
            System.out.println("Opção invalida tente novamente!");
        }

        leitor.close();

    }

    public void telaEventos() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("Menu de Eventos");
        System.out.println("-----------------------------------");
        System.out.println("1. Adicionar Evento");
        System.out.println("2. Alterar Evento");
        System.out.println("3. Listar Eventos");
        System.out.println("4. Excluir Eventos");
        System.out.println("5. Sair");
        System.out.println("-----------------------------------");
        System.out.println("Informe a opção que deseja: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case (1):
                leitor.nextLine();
                System.out.println("Informe o nome do evento: ");
                String nome = leitor.nextLine();
                System.out.println("Informe a data do evento: ");
                String data = leitor.nextLine();
                System.out.println("Informe a lotação do evento: ");
                int lotacao = leitor.nextInt();
                System.out.println("Informe a quantidade de ingressos vendidos do evento: ");
                int qtdIngressos = leitor.nextInt();
                System.out.println("Informe o preço do ingresso do evento: ");
                int precoIngresso = leitor.nextInt();

                Evento novoEvento = new Evento(nome, data, lotacao, qtdIngressos, precoIngresso, 10);
                controleEventos.IncluirEvento(novoEvento);

                System.out.println("Retornando ao menu principal...");
                mostrar();
                break;
            case (2):
                leitor.nextLine();
                System.out.println("Informe o nome do evento que deseja alterar: ");
                String nomeAlterar = leitor.nextLine();

                System.out.println("Informe o nome do evento: ");
                String novonome = leitor.nextLine();
                System.out.println("Informe a data do evento: ");
                String novadata = leitor.nextLine();
                System.out.println("Informe a lotação do evento: ");
                int novalotacao = leitor.nextInt();
                System.out.println("Informe a quantidade de ingressos vendidos do evento: ");
                int novaqtdIngressos = leitor.nextInt();
                System.out.println("Informe o preço do ingresso do evento: ");
                int novoprecoIngresso = leitor.nextInt();

                Evento EventoAlterado = new Evento(novonome, novadata, novalotacao, novaqtdIngressos, novoprecoIngresso, 10);
                controleEventos.AlterarEvento(nomeAlterar, EventoAlterado);

                System.out.println("Retornando ao menu principal...");
                mostrar();
                break;
            case (3):
                controleEventos.listarEventos();
                System.out.println("Retornando ao menu principal...");
                mostrar();
                break;
            case (4):
                leitor.nextLine();
                System.out.println("Informe o nome do evento que deseja excluir: ");
                String nomeExcluir = leitor.nextLine();

                controleEventos.ExcluirEvento(nomeExcluir);

                System.out.println("Retornando ao menu principal...");
                mostrar();
                break;
            case (5):
                System.out.println("Retornando ao menu principal");
                mostrar();
                break;
        }


        leitor.close();
    }

    public void telaReservas() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("Menu de Reservas");
        System.out.println("-----------------------------------");
        System.out.println("1. Adicionar Reserva");
        System.out.println("2. Alterar Reserva");
        System.out.println("3. Listar Reserva");
        System.out.println("4. Excluir Reserva");
        System.out.println("5. Sair");
        System.out.println("-----------------------------------");
        System.out.println("Informe a opção que deseja: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case (1):
            leitor.nextLine();
            System.out.println("Informe o nome do evento que deseja inserir uma reserva: ");
            String nomeEvento = leitor.nextLine();

            System.out.println("Informe o nome da reserva: ");
            String novonome = leitor.nextLine();
            System.out.println("Informe a data da reserva: ");
            String novadata = leitor.nextLine();
            System.out.println("Informe a quantidade de pessoas: ");
            int novaQtdPessoas = leitor.nextInt();
            System.out.println("Informe o valor da reserva: ");
            double novoValor = leitor.nextDouble();

            Reserva novaReserva = new Reserva(novonome, novaQtdPessoas, novadata, novoValor);
            controleEventos.IncluirReserva(nomeEvento, novaReserva);

            System.out.println("Retornando ao menu principal...");
            mostrar();
            break;
            case (2):
                leitor.nextLine();
                System.out.println("Informe o nome do evento que deseja alterar uma reserva: ");
                String nomeEventoAlterar = leitor.nextLine();
                System.out.println("Informe o nome da reserva que deseja alterar: ");
                String nomeReservaAlterar = leitor.nextLine();

                System.out.println("Informe a alteração da reserva: ");

                System.out.println("Informe o nome da reserva: ");
                String nomeAlterar = leitor.nextLine();
                System.out.println("Informe a data da reserva: ");
                String dataAlterar = leitor.nextLine();
                System.out.println("Informe a quantidade de pessoas: ");
                int qtdPessoasAlterar = leitor.nextInt();
                System.out.println("Informe o valor da reserva: ");
                double valorAlterar = leitor.nextDouble();

                Reserva reservaAlterar = new Reserva(nomeAlterar, qtdPessoasAlterar, dataAlterar, valorAlterar);
                controleEventos.AlterarReserva(nomeEventoAlterar, nomeReservaAlterar, reservaAlterar);

                System.out.println("Retornando ao menu principal...");
                mostrar();
                break;
            case (3):
                leitor.nextLine();
                System.out.println("Informe o nome do evento que deseja listar as reservas: ");
                String nomeEventoListar = leitor.nextLine();

                controleEventos.ListarReserva(nomeEventoListar);
                System.out.println("Retornando ao menu principal...");
                mostrar();
                break;
            case (4):
                leitor.nextLine();
                System.out.println("Informe o nome do evento que deseja excluir uma reserva: ");
                String nomeEventoExcluir = leitor.nextLine();
                System.out.println("Informe o nome da reserva que deseja excluir: ");
                String nomeReservaExcluir = leitor.nextLine();

                controleEventos.ExcluirReserva(nomeEventoExcluir, nomeReservaExcluir);

                System.out.println("Retornando ao menu principal...");
                mostrar();
                break;
            case (5):
                System.out.println("Retornando ao menu principal");
                mostrar();
                break;
        }


        leitor.close();
    }
}
