package br.edu.up.Models;

public class Professor extends Pessoa{
    private String id;
    private String nomeTitulo;
    private String nomeInstituicao;
    private String tituloTCC;
    private int anoConclusao;

    public Professor(String rg, String nome, String matricula, String id, String nomeTitulo, String nomeInstituicao, String tituloTCC, int anoConclusao) {
        super(rg, nome, matricula);
        this.id = id;
        this.nomeTitulo = nomeTitulo;
        this.nomeInstituicao = nomeInstituicao;
        this.tituloTCC = tituloTCC;
        this.anoConclusao = anoConclusao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }


    
}
