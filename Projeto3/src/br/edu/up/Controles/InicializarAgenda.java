package br.edu.up.Controles;

import br.edu.up.Models.*;

public class InicializarAgenda {
    private Mes[] Meses;
    private Dia[] dias;
    private Ano ano = new Ano(2024, true);

    public InicializarAgenda() {
        this.Meses = new Mes[12];
        this.dias = new Dia[31];


        Mes Janeiro = new Mes(30, "Janeiro");
        Mes Fevereiro = new Mes(28, "Fevereiro");
        Mes Marco = new Mes(31, "Março");
        Mes Abril = new Mes(30, "Abril");
        Mes Maio = new Mes(31, "Maio");
        Mes Junho = new Mes(30, "Junho");
        Mes Julho = new Mes(31, "Julho");
        Mes Agosto = new Mes(31, "Agosto");
        Mes Setembro = new Mes(30, "Setembro");
        Mes Outubro = new Mes(31, "Setembro");
        Mes Novembro = new Mes(30, "Novembro");
        Mes Dezembro = new Mes(31, "Dezembro");

        this.Meses[0] = Janeiro;
        this.Meses[1] = Fevereiro;
        this.Meses[2] = Marco;
        this.Meses[3] = Abril;
        this.Meses[4] = Maio;
        this.Meses[5] = Junho;
        this.Meses[6] = Julho;
        this.Meses[7] = Agosto;
        this.Meses[8] = Setembro;
        this.Meses[9] = Outubro;
        this.Meses[10] = Novembro;
        this.Meses[11] = Dezembro;

        ano.adicionarMes(Meses);

        for (int i = 0; i < 12; i++) {
            for (int j = 1; j < Meses[i].getQtDias(); j++) {
                dias[j] = new Dia(j);
            }
        }

    }

}
