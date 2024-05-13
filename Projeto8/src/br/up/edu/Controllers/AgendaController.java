package br.up.edu.Controllers;

import java.util.Random;

import br.up.edu.Models.Agenda;
import br.up.edu.Models.Comercial;
import br.up.edu.Models.Contato;
import br.up.edu.Models.Pessoal;

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
