package br.edu.up.Models;

public class Mes {
    private String nome;
    private int qtDias;
    private Dia[] dias;

    public Mes(int qtDias, String nome) {
        this.qtDias = qtDias;
        this.nome = nome;
    }

    public void adicionarDia(Dia dia){
        
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

    public String listarCompromisso(int diaMes){
        for (int i = 0; i < dias.length; i++) {
            if (diaMes == dias[i].getDiaMes()) {
                return dias[i].listarCompromisso();
            }
        }
        return null;
    }

    public String listarCompromisso(){
        for (int i = 0; i < dias.length; i++) {
            dias[i].listarCompromisso();
        }
        return null;
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
