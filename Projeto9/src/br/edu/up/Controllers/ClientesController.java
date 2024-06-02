package br.edu.up.Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.Models.ClienteEmpresa;
import br.edu.up.Models.ClientePessoa;

public class ClientesController {

    File ClientesPessoaBD = new File("");
    File ClientesEmpresaBD = new File("");

    public List<ClientePessoa> listaClientesPessoa = new ArrayList<>();
    public List<ClienteEmpresa> listaClientesEmpresa = new ArrayList<>();

    public void adicionarClientePessoa(ClientePessoa cliente) {
        listaClientesPessoa.add(cliente);
        salvarClientesPessoa();
    }

    public void adicionarClienteEmpresa(ClienteEmpresa clienteEmpresa) {
        listaClientesEmpresa.add(clienteEmpresa);
        salvarClientesEmpresa();
    }

    public void listarClientesPessoa(){
        try { 

            Scanner leitor = new Scanner(ClientesPessoaBD);
            leitor.nextLine();


            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
                

            }

            leitor.close();
        } catch (FileNotFoundException x) { // trata o erro
            System.out.println("O arquivo" + ClientesPessoaBD + " nao foi encontrado pois " + x.getCause());
        }
    }

    public void listarClientesEmpresa(){
        try { 

            Scanner leitor = new Scanner(ClientesEmpresaBD);
            leitor.nextLine();


            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
                

            }

            leitor.close();
        } catch (FileNotFoundException x) { // trata o erro
            System.out.println("O arquivo" + ClientesEmpresaBD + " nao foi encontrado pois " + x.getCause());
        }
    }

    public void salvarClientesPessoa() {
        try {
            FileWriter ClienteBDgravar = new FileWriter(ClientesPessoaBD, true);
            PrintWriter gravador = new PrintWriter(ClienteBDgravar);

            for (ClientePessoa c : listaClientesPessoa) {
                String linhaCSV = c.clientePessoaToCSV();
                gravador.println(linhaCSV);
            }
            gravador.close();
        } catch (IOException e) {
            System.out.println("Erro de IO: " + e.getMessage());
        }
    }

    public void salvarClientesEmpresa() {
        try {
            FileWriter ClienteBDgravar = new FileWriter(ClientesEmpresaBD, true);
            PrintWriter gravador = new PrintWriter(ClienteBDgravar);

            for (ClienteEmpresa c : listaClientesEmpresa) {
                String linhaCSV = c.clienteEmpresaToCSV();
                gravador.println(linhaCSV);
            }
            gravador.close();
        } catch (IOException e) {
            System.out.println("Erro de IO: " + e.getMessage());
        }
    }

    
}
