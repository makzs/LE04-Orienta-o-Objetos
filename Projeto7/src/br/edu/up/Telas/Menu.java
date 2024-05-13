package br.edu.up.Telas;

import java.util.Scanner;

public class Menu {

    public void mostar(){
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
            // menu professores
            break;
            case 2:
            // menu alunos
            break;
            case 3:
            // menu disciplinas
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
        System.out.println("2.Registrar Professor");
        System.out.println("3.Sair");
        System.out.println("------------------------------");
        System.out.println("Informe a opção: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
            // menu listar
            break;
            case 2:
            // menu registrar
            break;
            case 3:
            // sair
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
        System.out.println("2.Registrar Aluno");
        System.out.println("3.Sair");
        System.out.println("------------------------------");
        System.out.println("Informe a opção: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
            // menu listar
            break;
            case 2:
            // menu registrar
            break;
            case 3:
            // sair
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
        System.out.println("2.Registrar Disciplina");
        System.out.println("3.Sair");
        System.out.println("------------------------------");
        System.out.println("Informe a opção: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
            // menu listar
            break;
            case 2:
            // menu registrar
            break;
            case 3:
            // sair
            break;
            default:
            System.out.println("Opção invalida!");
            break;
        }

        leitor.close();
    }
}
