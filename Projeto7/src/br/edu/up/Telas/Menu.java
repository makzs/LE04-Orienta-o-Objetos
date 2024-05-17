package br.edu.up.Telas;

import java.util.Scanner;

public class Menu {

    public void mostrar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("MENU PRINCIPAL");
        System.out.println("------------------------------");

        System.out.println("1.Professores");
        System.out.println("2.Alunos");
        System.out.println("3.Disciplinas");
        System.out.println("------------------------------");
        System.out.println("Informe a opção: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
            mostrarProfessores();
            break;
            case 2:
            mostrarAlunos();
            break;
            case 3:
            mostrarDisciplinas();
            break;
            default:
            System.out.println("Opção invalida!");
            break;
        }

        leitor.close();
    }

    public void mostrarProfessores(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("MENU PROFESSORES");
        System.out.println("------------------------------");

        System.out.println("1.Listar Professores");
        System.out.println("2.Verificar Professor");
        System.out.println("3.Sair");
        System.out.println("------------------------------");
        System.out.println("Informe a opção: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
            // menu listar
            break;
            case 2:
            // menu verificar
            break;
            case 3:
            mostrar();
            break;
            default:
            System.out.println("Opção invalida!");
            break;
        }

        leitor.close();
    }

    public void mostrarAlunos(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("MENU ALUNOS");
        System.out.println("------------------------------");

        System.out.println("1.Listar Alunos");
        System.out.println("2.Verificar Aluno");
        System.out.println("3.Sair");
        System.out.println("------------------------------");
        System.out.println("Informe a opção: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
            // menu listar
            break;
            case 2:
            // menu verificar
            break;
            case 3:
            mostrar();
            break;
            default:
            System.out.println("Opção invalida!");
            break;
        }

        leitor.close();
    }

    public void mostrarDisciplinas(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("MENU DISCIPLINAS");
        System.out.println("------------------------------");

        System.out.println("1.Listar Disciplinas");
        System.out.println("3.Verificar disciplinas");
        System.out.println("4.Sair");
        System.out.println("------------------------------");
        System.out.println("Informe a opção: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
            // menu listar
            break;
            case 2:
            // menu verificar
            break;
            case 3:
            mostrar();
            break;
            default:
            System.out.println("Opção invalida!");
            break;
        }

        leitor.close();
    }
}
