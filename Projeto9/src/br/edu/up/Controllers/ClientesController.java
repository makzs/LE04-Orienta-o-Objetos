package br.edu.up.Controllers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import br.edu.up.Models.*;

public class ClientesController {

    File ClienteBD = new File(
            "");
    List<ClientePessoa> listaClientes = new ArrayList<>();

    public void adicionarCliente(ClientePessoa cliente) {
        listaClientes.add(cliente);
        salvarClientesPessoa();
    }

    public void salvarClientesPessoa() {
        try {
            FileWriter ClienteBDgravar = new FileWriter(
                    "");
            PrintWriter gravador = new PrintWriter(ClienteBDgravar);

            for (ClientePessoa c : listaClientes) {
                c.clientePessoaToCSV();
            }
            gravador.close();
        } catch (IOException e) {
            System.out.println("Erro de IO");
        }
    }

}
