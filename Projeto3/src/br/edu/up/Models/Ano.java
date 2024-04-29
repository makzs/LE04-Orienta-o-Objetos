package br.edu.up.Models;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
    }

    public void adicionarMes(Mes[] mes) {
        this.meses = mes;
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].getNome() == nomeMes) {
                meses[i] = null;
                break;
            }
        }
    }

    public String listarCompromissos(String nomeMes) {
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].getNome() == nomeMes) {
                return meses[i].listarCompromisso();
            }
        }
        return null;
    }

    public String listarCompromissos() {
        for (int i = 0; i < meses.length;) {
            return meses[i].listarCompromisso();
        }
        return null;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }

    public Mes[] getMeses() {
        return meses;
    }

    public void setMeses(Mes[] meses) {
        this.meses = meses;
    }
}
