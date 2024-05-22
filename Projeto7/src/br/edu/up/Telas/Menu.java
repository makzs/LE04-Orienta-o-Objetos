package br.edu.up.Telas;

import java.util.Scanner;
import br.edu.up.Controllers.EscolaController;
import br.edu.up.Models.*;


public class Menu {

    EscolaController controller = new EscolaController();
    DadosEscola dadosEscola = controller.obterDadosEscola();

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
            for (Professor p : dadosEscola.getProfessores()) {
                System.out.println(p);
            }
            break;
            case 2:
            leitor.nextLine();
            System.out.println("Informe o nome do professor que deseja verificar: ");
            String professorVerificar = leitor.nextLine();

            controller.verificarDisciplinasDoProfessor(professorVerificar);
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
            for (Aluno[] c : dadosEscola.getAlunosPorCurso()) {
                for (Aluno aluno : c) {
                    System.out.println(aluno);
                }
            }
            break;
            case 2:
            leitor.nextLine();
            System.out.println("Informe a disciplina que deseja verificar: ");
            String disciplinaVerificar = leitor.nextLine();
            System.out.println("Informe o nome do aluno que deseja verificar: ");
            String alunoVerificado = leitor.nextLine();

            for (Disciplina[] c : dadosEscola.getDisciplinasPorCurso()) {
                for (Disciplina disciplina : c) {
                    if (disciplina.getNome().equals(disciplinaVerificar)){
                        for (Aluno alunos : disciplina.getAlunos()) {
                            if (alunos.getNome().equals(alunoVerificado)){
                                if (disciplina.estaAprovado(alunos)){
                                    System.out.println(alunos.getNome() + " Aprovado!");
                                    break;
                                }
                                else{
                                    System.out.println(alunos.getNome() + " Reprovado!");
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            
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
        System.out.println("2.Verificar disciplinas");
        System.out.println("3.Sair");
        System.out.println("------------------------------");
        System.out.println("Informe a opção: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
            for (Disciplina[] c : dadosEscola.getDisciplinasPorCurso()) {
                for (Disciplina d : c) {
                    System.out.println(d);
                    System.out.println("-------------------------------\n");
                }
            }
            break;
            case 2:
            leitor.nextLine();
            System.out.println("Informe o curso que deseja verificar: ");
            String cursoVerificar = leitor.nextLine();
            System.out.println("Informe o codigo da Disciplina que deseja verificar: ");
            String cursoVerificarCod = leitor.nextLine();

            controller.verificarDisciplina(cursoVerificar, cursoVerificarCod);
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
