package br.edu.up.Models;

public class DadosEscola {
    private Professor[] professores;
    private Aluno[][] alunosPorCurso;
    private Disciplina[][] disciplinasPorCurso;

    public DadosEscola(Professor[] professores, Aluno[][] alunosPorCurso, Disciplina[][] disciplinasPorCurso) {
        this.professores = professores;
        this.alunosPorCurso = alunosPorCurso;
        this.disciplinasPorCurso = disciplinasPorCurso;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public Aluno[][] getAlunosPorCurso() {
        return alunosPorCurso;
    }

    public Disciplina[][] getDisciplinasPorCurso() {
        return disciplinasPorCurso;
    }

}
