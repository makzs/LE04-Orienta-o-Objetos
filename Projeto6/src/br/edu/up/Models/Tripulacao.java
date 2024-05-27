package br.edu.up.Models;

public class Tripulacao extends Pessoa {
    private String identificacaoAeronautica;
    private String matriculaFuncionario;

    public String getIdentificacaoAeronautica() {
        return identificacaoAeronautica;
    }

    public void setIdentificacaoAeronautica(String identificacaoAeronautica) {
        this.identificacaoAeronautica = identificacaoAeronautica;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public Tripulacao(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario) {
        super(nome, rg);
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

}