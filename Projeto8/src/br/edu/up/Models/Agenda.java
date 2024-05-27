package br.edu.up.Models;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionar(Contato contato) {
        contatos.add(contato);
    }

    public Contato getContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null; // Contato não encontrado
    }

    public void excluirContato(int codigo) {
        contatos.removeIf(contato -> contato.getCodigo() == codigo);
    }

    public Contato buscarContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null; // Contato não encontrado
    }

    public String listarContatos() {
        StringBuilder sb = new StringBuilder();
        for (Contato contato : contatos) {
            sb.append(contato.toString()).append("\n");
        }
        return sb.toString();
    }
}