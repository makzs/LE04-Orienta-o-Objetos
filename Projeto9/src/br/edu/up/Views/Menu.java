package br.edu.up.Views;

import java.util.Scanner;

public class Menu {
    
    public void mostrar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("Menu Principal");
        System.out.println("------------------------------------");

        System.out.println("1. Inclusão");
        System.out.println("2. Dados");
        System.out.println("3. Emprestimo");
        System.out.println("4. Devolução");
        System.out.println("5. Sair");
        System.out.println("------------------------------------");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                // menu inclusao
                break;
            case 2:
                // menu dados
                break;
            case 3:
                // menu emprestimo
                break;
            case 4:
                // menu devolução
                break;
            case 5:
                // encerrar programa
                break;
            default:
            System.out.println("Opção Invalida!");
                break;
            }
            
        leitor.close();
    }

    public void menuInclusao(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n------------------------------------");
        System.out.println("Menu Inclusão");
        System.out.println("------------------------------------\n");

        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Menu Principal");
        System.out.println("------------------------------------\n");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                // incluir cliente pessoa
                break;
            case 2:
                // incluir cliente empresa
                break;
            case 3:
                mostrar();
                break;
            default:
            System.out.println("Opção Invalida");
                break;
        }

        leitor.close();
    }

    public void menuDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n------------------------------------");
        System.out.println("Menu Dados");
        System.out.println("------------------------------------\n");

        System.out.println("1. Mostrar dados cliente pessoa");
        System.out.println("2. Mostrar dados cliente empresa");
        System.out.println("3. Menu Principal");
        System.out.println("------------------------------------\n");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                // Mostrar dados cliente pessoa
                break;
            case 2:
                // Mostrar dados cliente empresa
                break;
            case 3:
                mostrar();
                break;
            default:
            System.out.println("Opção Invalida");
                break;
        }

        leitor.close();
    }

    public void menuEmprestar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n------------------------------------");
        System.out.println("Menu Emprestar");
        System.out.println("------------------------------------\n");

        System.out.println("1. Emprestar para cliente pessoa");
        System.out.println("2. Emprestar para cliente empresa");
        System.out.println("3. Menu Principal");
        System.out.println("------------------------------------\n");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                // Emprestar cliente pessoa
                break;
            case 2:
                // Emprestar cliente empresa
                break;
            case 3:
                mostrar();
                break;
            default:
            System.out.println("Opção Invalida");
                break;
        }

        leitor.close();
    }

    public void menuDevolucao(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n------------------------------------");
        System.out.println("Menu Devolução");
        System.out.println("------------------------------------\n");

        System.out.println("1. Devolução para cliente pessoa");
        System.out.println("2. Devolução para cliente empresa");
        System.out.println("3. Menu Principal");
        System.out.println("------------------------------------\n");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                // Devolução de cliente pessoa
                break;
            case 2:
                // Devolução de cliente empresa
                break;
            case 3:
                mostrar();
                break;
            default:
            System.out.println("Opção Invalida");
                break;
        }

        leitor.close();
    }
}
