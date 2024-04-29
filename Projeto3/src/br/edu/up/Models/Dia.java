package br.edu.up.Models;

public class Dia {

    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int dia) {
        this.diaMes = dia;
        this.compromissos = new Compromisso[24];
    }

    public void adicionarCompromissos(Compromisso[] comps) {
        this.compromissos = comps;

    }

    public void adicionarCompromisso(Compromisso comp) {
        if (this.compromissos == null) {
            this.compromissos = new Compromisso[1];
            this.compromissos[0] = comp;
        } else {
            Compromisso[] novaMatriz = new Compromisso[this.compromissos.length + 1];

            for (int i = 0; i < this.compromissos.length; i++) {
                novaMatriz[i] = this.compromissos[i];
            }

            novaMatriz[this.compromissos.length] = comp;

            this.compromissos = novaMatriz;
        }
    }

    public Compromisso consultarComprimisso(int hora) {

        for (int i = 0; i < compromissos.length; i++) {
            if (hora == compromissos[i].getHora()) {
                return compromissos[i];
            }
        }
        return null;
    }

    public String listarCompromisso() {
        String lista = "Compromissos do dia " + diaMes + ":\n";

        for (Compromisso compromisso : compromissos) {
            if (compromisso != null) {
                lista += "Pessoa: " + compromisso.getPessoa() + ", ";
                lista += "Assunto: " + compromisso.getAssunto() + ", ";
                lista += "Local: " + compromisso.getLocal() + ", ";
                lista += "Hora: " + compromisso.getHora() + ", ";
            }
        }

        return lista;
    }

    public void excluirCompromisso(int hora) {
        {
            for (int i = 0; i < compromissos.length; i++) {
                if (compromissos[i] != null && compromissos[i].getHora() == hora) {
                    compromissos[i] = null;
                    break;
                }
            }

        }

    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public Compromisso[] getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(Compromisso[] compromissos) {
        this.compromissos = compromissos;
    }
}
