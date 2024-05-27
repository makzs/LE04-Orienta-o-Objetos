package br.edu.up.Controllers;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.Models.Seguro;

public class SeguroController {
    private List<Seguro> seguros = new ArrayList<>();

    public boolean incluirSeguro(Seguro seguro) {
        for (Seguro s : seguros) {
            if (s.getNumeroApolice().equals(seguro.getNumeroApolice())) {
                return false; // Número da apólice já existe
            }
        }
        seguros.add(seguro);
        return true; // Seguro incluído com sucesso
    }

    public Seguro localizarSeguro(String numeroApolice) {
        for (Seguro s : seguros) {
            if (s.getNumeroApolice().equals(numeroApolice)) {
                return s;
            }
        }
        return null;
    }

    public boolean excluirSeguro(String numeroApolice) {
        Seguro seguro = localizarSeguro(numeroApolice);
        if (seguro != null) {
            seguros.remove(seguro);
            return true;
        }
        return false;
    }

    public boolean excluirTodosSeguros(boolean confirmacao) {
        if (confirmacao) {
            seguros.clear();
            return true;
        }
        return false;
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    public List<Seguro> listarTodosSeguros() {
        return new ArrayList<>(seguros);
    }
}
