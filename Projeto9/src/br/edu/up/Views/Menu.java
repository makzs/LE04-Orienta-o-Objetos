package br.edu.up.Views;

import java.util.Scanner;

import br.edu.up.Models.*;
import br.edu.up.Controllers.*;

public class Menu {

    ClientesController controller = new ClientesController();
    
    public void mostrar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("Menu Principal");
        System.out.println("------------------------------------");

        System.out.println("1. Inclusão");
        System.out.println("2. Dados");
        System.out.println("3. Emprestimo");
        System.out.println("4. Devolução");
        System.out.println("5. Sair");
        System.out.println("------------------------------------");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                menuInclusao();
                break;
            case 2:
                menuDados();
                break;
            case 3:
                menuEmprestar();
                break;
            case 4:
                menuDevolucao();
                break;
            case 5:
                System.out.println("Encerrando Programa...");
                break;
            default:
            System.out.println("Opção Invalida!");
                break;
            }
            
        leitor.close();
    }

    public void menuInclusao(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n------------------------------------");
        System.out.println("Menu Inclusão");
        System.out.println("------------------------------------\n");

        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Menu Principal");
        System.out.println("------------------------------------\n");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\n------------------------------------");
                System.out.println("Cadastro de novo Cliente");
                System.out.println("------------------------------------\n");

                leitor.nextLine();
                System.out.println("Informe o nome do novo Cliente: ");
                String nome = leitor.nextLine();
                System.out.println("Informe o telefone do novo Cliente: ");
                String telefone = leitor.nextLine();
                System.out.println("Informe o email do novo Cliente: ");
                String email = leitor.nextLine();
                System.out.println("Informe o cpf do novo Cliente: ");
                String cpf = leitor.nextLine();
                System.out.println("Informe o peso do novo Cliente: ");
                Double peso = leitor.nextDouble();
                System.out.println("Informe o altura do novo Cliente: ");
                Double altura = leitor.nextDouble();

                System.out.println("\n------------------------------------");
                System.out.println("Cadastro de Endereço do novo Cliente");
                System.out.println("------------------------------------\n");

                leitor.nextLine();
                System.out.println("Informe a UF (unidade federal): ");
                String uf = leitor.nextLine();
                System.out.println("Informe o nome da cidade: ");
                String nomeCidade = leitor.nextLine();

                Cidade novaCidade = new Cidade(nomeCidade, uf);

                System.out.println("Informe o nome da rua: ");
                String rua = leitor.nextLine();
                System.out.println("Informe o numero: ");
                String numero = leitor.nextLine();
                System.out.println("Informe o bairro: ");
                String bairro = leitor.nextLine();
                System.out.println("Informe o cep: ");
                String cep = leitor.nextLine();

                Endereco novoEndereco = new Endereco(rua, numero, bairro, cep, novaCidade);
                ClientePessoa novoClientePessoa = new ClientePessoa(nome, telefone, email, novoEndereco, cpf, peso, altura);

                controller.adicionarCliente(novoClientePessoa);
                System.out.println("Cliente Adicionado com Sucesso");

                break;
            case 2:
                // incluir cliente empresa
                break;
            case 3:
                mostrar();
                break;
            default:
            System.out.println("Opção Invalida");
                break;
        }

        leitor.close();
    }

    public void menuDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n------------------------------------");
        System.out.println("Menu Dados");
        System.out.println("------------------------------------\n");

        System.out.println("1. Mostrar dados cliente pessoa");
        System.out.println("2. Mostrar dados cliente empresa");
        System.out.println("3. Menu Principal");
        System.out.println("------------------------------------\n");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                controller.listarClientes();
                break;
            case 2:
                // Mostrar dados cliente empresa
                break;
            case 3:
                mostrar();
                break;
            default:
            System.out.println("Opção Invalida");
                break;
        }

        leitor.close();
    }

    public void menuEmprestar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n------------------------------------");
        System.out.println("Menu Emprestar");
        System.out.println("------------------------------------\n");

        System.out.println("1. Emprestar para cliente pessoa");
        System.out.println("2. Emprestar para cliente empresa");
        System.out.println("3. Menu Principal");
        System.out.println("------------------------------------\n");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                // Emprestar cliente pessoa
                break;
            case 2:
                // Emprestar cliente empresa
                break;
            case 3:
                mostrar();
                break;
            default:
            System.out.println("Opção Invalida");
                break;
        }

        leitor.close();
    }

    public void menuDevolucao(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n------------------------------------");
        System.out.println("Menu Devolução");
        System.out.println("------------------------------------\n");

        System.out.println("1. Devolução para cliente pessoa");
        System.out.println("2. Devolução para cliente empresa");
        System.out.println("3. Menu Principal");
        System.out.println("------------------------------------\n");
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                // Devolução de cliente pessoa
                break;
            case 2:
                // Devolução de cliente empresa
                break;
            case 3:
                mostrar();
                break;
            default:
            System.out.println("Opção Invalida");
                break;
        }

        leitor.close();
    }
}
