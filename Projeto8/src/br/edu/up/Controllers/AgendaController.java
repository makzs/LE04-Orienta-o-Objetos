package br.edu.up.Controllers;

import java.util.Random;

import br.edu.up.Models.Agenda;
import br.edu.up.Models.Comercial;
import br.edu.up.Models.Contato;
import br.edu.up.Models.Pessoal;

public class AgendaController {
    private Agenda agenda;
    private Random random;

    public AgendaController() {
        agenda = new Agenda();
        random = new Random();
    }

    public void adicionarContatoPessoal(String nome, String telefone, String aniversario) {
        int codigo = gerarCodigo();
        Pessoal contato = new Pessoal(codigo, nome, telefone, aniversario);
        agenda.adicionar(contato);
    }

    public void adicionarContatoComercial(String nome, String telefone, String cnpj) {
        int codigo = gerarCodigo();
        Comercial contato = new Comercial(codigo, nome, telefone, cnpj);
        agenda.adicionar(contato);
    }

    public void excluirContato(int codigo) {
        agenda.excluirContato(codigo);
    }

    public Contato BuscarContato(int codigo) {
        return agenda.buscarContato(codigo);
    }

    public String listarContatos() {
        return agenda.listarContatos();
    }

    private int gerarCodigo() {
        return random.nextInt(1000000);
    }
}
