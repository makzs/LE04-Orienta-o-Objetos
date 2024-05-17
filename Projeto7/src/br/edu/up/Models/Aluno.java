package br.edu.up.Models;

public class Aluno extends Pessoa{
    private String nomeCurso;
    private String turno;
    private int anoIngressao;
    
    public Aluno(String rg, String nome, String matricula, String nomeCurso, String turno, int anoIngressao) {
        super(rg, nome, matricula);
        this.nomeCurso = nomeCurso;
        this.turno = turno;
        this.anoIngressao = anoIngressao;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getAnoIngressao() {
        return anoIngressao;
    }

    public void setAnoIngressao(int anoIngressao) {
        this.anoIngressao = anoIngressao;
    }
    

    
}
