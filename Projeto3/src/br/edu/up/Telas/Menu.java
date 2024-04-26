
package br.edu.up.Telas;

import java.util.Scanner;
import br.edu.up.Controles.*;
import br.edu.up.Models.Ano;

public class Menu {

    public void mostrar() {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        InicializarAgenda padrao = new InicializarAgenda();
        padrao.Iniciar();
    
        Ano ano = padrao.getAno();

        System.out.println("---------------------------------------------");
        System.out.println("\t\tAGENDA VIRTUAL");
        System.out.println("---------------------------------------------");
        System.out.println("1. 2024");
        System.out.println("2. Meses");
        System.out.println("3. Dias");
        System.out.println("---------------------------------------------");

        System.out.println("Selecione uma opção: ");
        opcao = leitor.nextInt();

        switch (opcao) {
            case (1):
                telaAno();
                break;
            case (2):
                telaMes();
                break;
            case (3):
                telaDia();
                break;
            default:
                System.out.println("Opção Invalida!");
        }

        leitor.close();
    }

    public void telaAno() {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        InicializarAgenda padrao = new InicializarAgenda();
        padrao.Iniciar();
    
        Ano ano = padrao.getAno();

        System.out.println("---------------------------------------------");
        System.out.println("\t\t    2024");
        System.out.println("---------------------------------------------");
        System.out.println("1. Listar Compromissos");
        System.out.println("2. Listar Compromissos de um Mes");
        System.out.println("3. Adicionar Compromisso");
        System.out.println("4. Excluir Compromissos");
        System.out.println("5. Sair");
        System.out.println("---------------------------------------------");
        System.out.println("Selecione uma opção: ");
        opcao = leitor.nextInt();

        switch (opcao) {
            case (1):
                // m
                break;
            case (2):
                // m
                break;
            case (3):
                // mostrar
                break;
            case (4):
                // mostrar
                break;
            case (5):
                mostrar();
                break;
            default:
                System.out.println("Opção Invalida!");
        }

        leitor.close();
    }

    public void telaMes() {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        System.out.println("---------------------------------------------");
        System.out.println("\t\t    Meses");
        System.out.println("---------------------------------------------");
        System.out.println("1. Listar Compromissos");
        System.out.println("2. Listar Compromissos de um Dia");
        System.out.println("3. Adicionar Compromisso");
        System.out.println("4. Excluir Compromissos");
        System.out.println("5. Sair");
        System.out.println("---------------------------------------------");
        System.out.println("Selecione uma opção: ");
        opcao = leitor.nextInt();

        switch (opcao) {
            case (1):
                // mostrar
                break;
            case (2):
                // mostrar
                break;
            case (3):
                // mostrar
                break;
            case (4):
                // mostrar
                break;
            case (5):
                mostrar();
                break;
            default:
                System.out.println("Opção Invalida!");
        }

        leitor.close();
    }

    public void telaDia() {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        System.out.println("---------------------------------------------");
        System.out.println("\t\t    Dias");
        System.out.println("---------------------------------------------");
        System.out.println("1. Listar Compromissos");
        System.out.println("2. Listar Compromissos de uma hora");
        System.out.println("3. Adicionar Compromisso");
        System.out.println("4. Excluir Compromissos");
        System.out.println("5. Sair");
        System.out.println("---------------------------------------------");
        System.out.println("Selecione uma opção: ");
        opcao = leitor.nextInt();

        switch (opcao) {
            case (1):
                // mostrar
                break;
            case (2):
                // mostrar
                break;
            case (3):
                // mostrar
                break;
            case (4):
                // mostrar
                break;
            case (5):
                mostrar();
                break;
            default:
                System.out.println("Opção Invalida!");
        }

        leitor.close();
    }
}
