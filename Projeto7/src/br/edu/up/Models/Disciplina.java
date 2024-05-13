package br.edu.up.Models;

public class Disciplina {
    private String id;
    private String nome;
    private String curriculo;
    private Competencia competencias[];
    private Professor professor;
    private Aluno alunos[];

    public boolean estaAprovado(Aluno aluno){
        return true;
    }
}
