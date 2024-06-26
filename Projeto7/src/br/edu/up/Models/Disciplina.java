package br.edu.up.Models;

public class Disciplina {
    private String id;
    private String nome;
    private String curriculo;
    private Competencia competencias[];
    private Professor professor;
    private Aluno alunos[];

    // verificar se esta aprovado
    public boolean estaAprovado(Aluno aluno){
        Competencia[] competenciasAluno = aluno.getCompetencias();

    int obrigatoriasConcluidas = 0;
    int opcionaisConcluidas = 0;

    for (Competencia competencia : competencias) {
        if (competencia.isNecessario()) {
            for (Competencia competenciaAluno : competenciasAluno) {
                if (competencia.getNome().equalsIgnoreCase(competenciaAluno.getNome())) {
                    obrigatoriasConcluidas++;
                    break;
                }
            }
        } else {
            for (Competencia competenciaAluno : competenciasAluno) {
                if (competencia.getNome().equalsIgnoreCase(competenciaAluno.getNome())) {
                    opcionaisConcluidas++;
                    break;
                }
            }
        }
    }

    double porcentagemObrigatorias = (double) obrigatoriasConcluidas / competencias.length * 100;
    double porcentagemOpcionais = (double) opcionaisConcluidas / competencias.length * 100;

    return porcentagemObrigatorias >= 100 && porcentagemOpcionais >= 50;
    }

    public Disciplina(String id, String nome, String curriculo, Competencia[] competencias, Professor professor,
            Aluno[] alunos) {
        this.id = id;
        this.nome = nome;
        this.curriculo = curriculo;
        this.competencias = competencias;
        this.professor = professor;
        this.alunos = alunos;
    }

    @Override
public String toString() {
    return "Disciplina: " +
            "Código='" + id + '\'' +
            ", Nome='" + nome + '\'' +
            ", Área='" + curriculo + '\'';
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public Competencia[] getCompetencias() {
        return competencias;
    }

    public void setCompetencias(Competencia[] competencias) {
        this.competencias = competencias;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    
}
