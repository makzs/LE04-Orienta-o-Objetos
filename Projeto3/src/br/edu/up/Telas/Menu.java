
package br.edu.up.Telas;

import java.util.Scanner;
import br.edu.up.Controles.*;
import br.edu.up.Models.Ano;
import br.edu.up.Models.Compromisso;

public class Menu {
    InicializarAgenda padrao = new InicializarAgenda();
    Ano ano = padrao.criarAno(2024, true);

    public void mostrar() {
        Scanner leitor = new Scanner(System.in);
        int opcao;

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
                for (var meses : ano.getMeses()) {
                    for (var d : meses.getDias()) {
                        System.out.println(d.getDiaMes());
                    }
                }
                
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

        String aux = "";

        System.out.println("Informe o mes que deseja verificar: ");
        for (var m : ano.getMeses()) {
            System.out.println(m.getNome());
        }
        System.out.println("Opção: ");
        String opcaoMes = leitor.nextLine();

        for (var m : ano.getMeses()) {
            if (m.getNome().equalsIgnoreCase(opcaoMes)){
                aux = opcaoMes;
                break;
            }
            else{
                aux = "erro";
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println(aux);
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

        String aux = "";

        System.out.println("Informe o mes que deseja verificar: ");
        for (var m : ano.getMeses()) {
            System.out.println(m.getNome());
        }
        System.out.println("Opção: ");
        String opcaoMes = leitor.nextLine();

        for (var m : ano.getMeses()) {
            if (m.getNome().equalsIgnoreCase(opcaoMes)){
                aux = opcaoMes;
                break;
            }
            else{
                aux = "erro";
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println(aux);
        System.out.println("---------------------------------------------");

        System.out.println("Informe o dia que deseja ");
        int auxDia = leitor.nextInt();

        System.out.println("---------------------------------------------");
        System.out.println(auxDia);
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

            boolean listado = false;
            
            for (var meses : ano.getMeses()) {
                if (meses.getNome().equalsIgnoreCase(opcaoMes)){
                    for (var d : meses.getDias()) {
                        if (d.getDiaMes() == auxDia){
                            System.out.println(d.listarCompromisso());
                            listado = true;
                        }
                    }
                }
            }

            if (listado == true){
                System.out.println("Compromisso listado com sucesso");
                System.out.println("Retornando ao menu principal");
            }
            else{
                System.out.println("Ocorreu um erro ao listar os compromisso");
                System.out.println("Retornando ao menu principal");
            }

                mostrar();
                break;
            case (2):

                boolean consultado = false;

                System.out.println("Informe o horario que deseja consultar: ");
                int horaConsulta = leitor.nextInt();

                for (var meses : ano.getMeses()) {
                    if (meses.getNome().equalsIgnoreCase(opcaoMes)){
                        for (var d : meses.getDias()) {
                            if (d.getDiaMes() == auxDia){
                                Compromisso compromissoHora = d.consultarCompromisso(horaConsulta);
                                System.out.println("Existe um compromisso essa hora!");
                                System.out.println("Pessoa: " + compromissoHora.getPessoa() + ",");
                                System.out.println("Assunto: " + compromissoHora.getAssunto() + ",");
                                System.out.println("Local: " + compromissoHora.getLocal() + ",");
                                System.out.println("Hora: " + compromissoHora.getHora());
                                consultado = true;
                            }
                        }
                    }
                }

                if (consultado == true){
                    System.out.println("");
                }
                else{
                    System.out.println("Compromisso nao encontrado!");
                }

                mostrar();
                break;
            case (3):
                System.err.println("----------------------------");
                System.err.println("Adicionar Compromisso em um Dia: ");
                System.err.println("----------------------------");
                leitor.nextLine();

                System.out.println("Informe o campo pessoa: ");
                String pessoa = leitor.nextLine();
                System.out.println("Informe o campo local: ");
                String local = leitor.nextLine();
                System.out.println("Informe o campo assunto: ");
                String assunto = leitor.nextLine();
                System.out.println("Informe o campo hora: ");
                int hora = leitor.nextInt();

                Compromisso DiaCompromisso = new Compromisso(pessoa, local, assunto, hora);

                boolean adicionado = false;

                for (var meses : ano.getMeses()) {
                    if (meses.getNome().equalsIgnoreCase(opcaoMes)){
                        for (var d : meses.getDias()) {
                            if (d.getDiaMes() == auxDia){
                                d.adicionarCompromisso(DiaCompromisso);
                                adicionado = true;
                            }
                        }
                    }
                }

                if (adicionado == true){
                    System.out.println("Compromisso Adicionado com sucesso");
                    System.out.println("Retornando ao menu principal");
                }
                else{
                    System.out.println("Ocorreu um erro ao adicionar o compromisso");
                    System.out.println("Retornando ao menu principal");
                }

                mostrar();
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
