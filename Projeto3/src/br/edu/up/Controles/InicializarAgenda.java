package br.edu.up.Controles;

import br.edu.up.Models.*;

public class InicializarAgenda {

    public Ano criarAno(int ano, boolean bissexto) {
        Ano novoAno = new Ano(ano, bissexto);
        novoAno.adicionarMes(criarMesesPadrao());
        return novoAno;
    }

    private Mes[] criarMesesPadrao() {
        Mes[] meses = new Mes[12];
        String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < 12; i++) {
            Dia[] dias = new Dia[diasPorMes[i]];
            for (int j = 0; j < diasPorMes[i]; j++) {
                dias[j] = criarDia(j + 1, null);

            }
            meses[i] = criarMes(nomesMeses[i], diasPorMes[i], dias);
        }

        return meses;
    }

    public Mes criarMes(String nome, int qtDias, Dia[] dias) {
        Mes novoMes = new Mes(qtDias, nome);
        novoMes.adicionarDia(dias);
        return novoMes;
    }

    public Dia criarDia(int dia, Compromisso[] compromissos) {
        Dia novoDia = new Dia(dia);
        novoDia.adicionarCompromissos(compromissos);
        return novoDia;
    }

    

}
