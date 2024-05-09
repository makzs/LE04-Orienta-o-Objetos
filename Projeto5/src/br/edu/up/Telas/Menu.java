package br.edu.up.Telas;

import java.util.Scanner;

public class Menu {

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
                // metodo 1
                break;
            case (2):
                // metodo 2
                break;
            case (3):
                // metodo 3
                break;
            case (4):
                // metodo 4 
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
                // metodo 1
                break;
            case (2):
                // metodo 2
                break;
            case (3):
                // metodo 3
                break;
            case (4):
                // metodo 4 
                break;
            case (5):
                System.out.println("Retornando ao menu principal");
                mostrar();
                break;
        }


        leitor.close();
    }
}
