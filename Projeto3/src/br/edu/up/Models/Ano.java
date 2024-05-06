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
        String listaAno = "";
        boolean encontrado = false;

        for (Mes mes : meses) {
            if (nomeMes.equalsIgnoreCase(mes.getNome())){
                listaAno += mes.getNome() + " : " + mes.listarCompromisso() + "\n";
                encontrado = true;

            }

        }

        if (!encontrado) {
            listaAno = "Esse mês não possui compromissos.";
        }

        return listaAno;
    }

    public String listarCompromissos() {
        String listaAno = "";

        for (Mes mes : meses) {
            listaAno += mes.getNome() + " : " + mes.listarCompromisso() + "\n";
        }
        return listaAno;
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
