package br.edu.up.Controlers;

import br.edu.up.Models.Evento;
import br.edu.up.Models.Reserva;

public class ControllerEventos {
    private Evento[] eventos;
    private int numEventos;

    public ControllerEventos(int maxEventos, int maxReservas) {
        eventos = new Evento[maxEventos];
        numEventos = 0;
    }

    public void listarEventos(){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] == null){
                System.out.println("Evento " + (i+1) + " Vazio");
            }
            else{
                System.out.println("Evento " + (i+1) + ":");
                System.out.println(eventos[i].getNome());
                System.out.println(eventos[i].getData());
                System.out.println(eventos[i].getLotacao());
                System.out.println(eventos[i].getQtdIngressos());
                System.out.println(eventos[i].getPrecoIngresso());
            }
        }
    }

    public void IncluirEvento(Evento evento) {
        if (numEventos < eventos.length) {
            eventos[numEventos++] = evento;
            System.out.println("Evento adicionado com sucesso!");
        } else {
            System.out.println("Nao é possivel adicionar evento pois o limite foi atingido!");
        }
    }

    public void ExcluirEvento(String nome){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null){
                if (eventos[i].getNome().equals(nome)){
                    eventos[i] = null;
                    System.out.println("Evento " + nome + " excluido com sucesso!");
                }
                else{
                    if (i == eventos.length){
                        System.out.println("Evento nao encontrado!");
                    }
                }
            }
        }
    }

    public void AlterarEvento(String nome, Evento evento){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null){
                if (eventos[i].getNome().equals(nome)){
                    eventos[i] = evento;
                    System.out.println("Evento " + evento.getNome() + " alterado com sucesso!");
                }
                else{
                    if (i == eventos.length){
                        System.out.println("Evento nao encontrado!");
                    }
                }
            }
        }
    }

    public void IncluirReserva(String nomeEvento, Reserva reserva){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null){
                if (eventos[i].getNome().equals(nomeEvento)){
                    eventos[i].adicionarReserva(reserva);
                }
                else{
                    if (i == eventos.length){
                        System.out.println("Evento nao encontrado!");
                    }
                }
            }
        }
    }

    public void ListarReserva(String nomeEvento){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null){
                if (eventos[i].getNome().equals(nomeEvento)){
                        System.out.println("Reservas para o evento " + nomeEvento + ":");
                    for (Reserva reserva : eventos[i].getReservas()) {
                        if (reserva != null) {
                            System.out.println("Nome: " + reserva.getNome() + ", Quantidade de pessoas: " + reserva.getQtdPessoas() + ", Data: " + reserva.getData() + ", Valor: " + reserva.getValor());
                        }
                    }
                }
                else{
                    if (i == eventos.length){
                        System.out.println("Evento nao encontrado!");
                    }
                }
            }
        }
    }

}
