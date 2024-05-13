package br.up.edu.Controllers;

import br.up.edu.Models.Passageiro;
import br.up.edu.Models.Tripulacao;

public class AeroportoController {
    private Passageiro[] passageiros;
    private Tripulacao[] tripulacao;
    private int numPassageiros;
    private int numTripulacao;
    private final int MAX_PAX = 100; // número máximo de passageiros
    private final int MAX_TRIP = 30; // número máximo de tripulação

    public AeroportoController() {
        this.passageiros = new Passageiro[MAX_PAX];
        this.tripulacao = new Tripulacao[MAX_TRIP];
        this.numPassageiros = 0;
        this.numTripulacao = 0;
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        if (numPassageiros < MAX_PAX) {
            passageiros[numPassageiros++] = passageiro;
        } else {
            System.out.println("Limite de passageiros atingido!");
        }
    }

    public void adicionarTripulacao(Tripulacao tripulacao) {
        if (numTripulacao < MAX_TRIP) {
            this.tripulacao[numTripulacao++] = tripulacao;
        } else {
            System.out.println("Limite de tripulação atingido!");
        }
    }

    public void listarPassageiro() {
        for (Passageiro passageiro : passageiros) {
            if (passageiro != null) {
                System.out.println("Identificador de Bagagem: " + passageiro.getIdentificadorBagagem());
                System.out.println("RG: " + passageiro.getRg());
                System.out.println("Passagem: " + passageiro.getPassagem());
                System.out.println("-----------------------------------");
            }
        }
    }

    public void listarTripulacao() {
        for (var trip : tripulacao) {
            if (trip != null) {
                System.out.println("Matricula do Funcionarios: " + trip.getMatriculaFuncionario());
                System.out.println("RG: " + trip.getRg());
                System.out.println("ID aeronautica: " + trip.getIdentificacaoAeronautica());
                System.out.println("-----------------------------------");
            }
        }
    }

}
