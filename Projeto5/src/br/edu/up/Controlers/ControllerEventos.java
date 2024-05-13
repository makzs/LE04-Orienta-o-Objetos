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
                    System.out.println("Reserva incluida com sucesso");
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
                            System.out.println("Reservas listada com sucesso");
                        }
                    }
                }
                else{
                    if (i == eventos.length){
                        System.out.println("Reserva nao encontrada!");
                    }
                }
            }
        }
    }

    public void AlterarReserva(String nomeEvento, String nomeReserva, Reserva novaReserva){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null){
                if (eventos[i].getNome().equals(nomeEvento)){
                    for (Reserva reserva : eventos[i].getReservas()){
                        if (reserva != null){
                            if (reserva.getNome().equals(nomeReserva)){
                                reserva.setNome(novaReserva.getNome());
                                reserva.setQtdPessoas(novaReserva.getQtdPessoas());
                                reserva.setData(novaReserva.getData());
                                reserva.setValor(novaReserva.getValor());
                                System.out.println("reserva alterada com sucesso!");
                            }
                        }
                    }

                }
                else{
                    if (i == eventos.length){
                        System.out.println("Reserva nao encontrada!");
                    }
                }
            }
        }
    }

    public void ExcluirReserva(String nomeEvento, String nomeReserva){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getNome().equals(nomeEvento)) {
                Reserva[] reservas = eventos[i].getReservas();
                for (int j = 0; j < reservas.length; j++) {
                    if (reservas[j] != null && reservas[j].getNome().equals(nomeReserva)) {
                        reservas[j] = null;
                        System.out.println("Reserva excluída com sucesso!");
                        return;
                    }
                }
                System.out.println("Reserva não encontrada!");
                return;
            }
        }
        System.out.println("Evento não encontrado!");
    }
    

    

}
