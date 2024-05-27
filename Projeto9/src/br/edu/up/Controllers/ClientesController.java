package br.edu.up.Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.up.Models.ClientePessoa;

public class ClientesController {

    File ClienteBD = new File("C:\\Sistema\\FN\\Programação\\Testes\\LE04-Orienta-o-Objetos\\Projeto9\\src\\Clientes.csv");
    List<ClientePessoa> listaClientes = new ArrayList<>();

    public void adicionarCliente(ClientePessoa cliente) {
        listaClientes.add(cliente);
        salvarClientesPessoa();
    }

    public void listarClientes(){
        try { 

            Scanner leitor = new Scanner(ClienteBD);
            leitor.nextLine();


            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
                

            }

            leitor.close();
        } catch (FileNotFoundException x) { // trata o erro
            System.out.println("O arquivo" + ClienteBD + " nao foi encontrado pois " + x.getCause());
        }
    }

    public void salvarClientesPessoa() {
        try {
            FileWriter ClienteBDgravar = new FileWriter(ClienteBD, true);
            PrintWriter gravador = new PrintWriter(ClienteBDgravar);

            for (ClientePessoa c : listaClientes) {
                String linhaCSV = c.clientePessoaToCSV();
                gravador.println(linhaCSV);
            }
            gravador.close();
        } catch (IOException e) {
            System.out.println("Erro de IO: " + e.getMessage());
        }
    }
}
