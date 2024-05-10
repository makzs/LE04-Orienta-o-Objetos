package br.up.edu.Models;

import java.time.LocalDate;
import java.util.Date;

public class Passagem {
    private int numeroAssento;
    private String classeAssento;
    private Date dataVoo;

    public Passagem(int numeroAssento, String classeAssento, Date dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

}