package br.edu.up.Models;

public class Mes {
    private String nome;
    private int qtDias;
    private Dia[] dias;

    public Mes(int qtDias, String nome) {
        this.qtDias = qtDias;
        this.nome = nome;
    }

    public void adicionarDia(Dia[] dia) {
        this.dias = dia;

    }

    public void adicionarCompromisso(Compromisso[] comp, int diaMes) {
        for (int i = 0; i < dias.length; i++) {
            if (diaMes == dias[i].getDiaMes()) {
                dias[i].adicionarCompromissos(comp);
            }
        }

    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {
        for (int i = 0; i < dias.length; i++) {
            if (diaMes == dias[i].getDiaMes()) {
                Compromisso comp = new Compromisso(pessoa, local, assunto, hora);
                Compromisso[] arrayComp = new Compromisso[1];
                arrayComp[0] = comp;
                dias[i].adicionarCompromissos(arrayComp);
            }
        }
    }

    public void excluirCompromisso(int diaMes, int hora) {
        for (int i = 0; i < dias.length; i++) {
            if (diaMes == dias[i].getDiaMes()) {
                dias[i].excluirCompromisso(hora);
            }
        }

    }

    public String listarCompromisso(int diaMes) {

        String listaMes = "compromissos do mes: \n";

        for (Dia dia : dias) {
            if (diaMes == dia.getDiaMes()) {
                if (dia.listarCompromisso() != null) {
                    listaMes += dia.listarCompromisso() + "\n";
                } else {
                    listaMes += "sem compromissos";
                }
            }
        }
        return listaMes;
    }

    public String listarCompromisso() {

        boolean temCompromissos = false;
        String listaMes = "compromissos do mes: \n";

        for (Dia dia : dias) {
            if (dia.getCompromissos() != null) {
                temCompromissos = true;
                listaMes += dia.listarCompromisso() + "\n";
            }
        }

        if (!temCompromissos) {
            listaMes = "sem compromissos";
        }

        return listaMes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtDias() {
        return qtDias;
    }

    public void setQtDias(int qtDias) {
        this.qtDias = qtDias;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }
}
