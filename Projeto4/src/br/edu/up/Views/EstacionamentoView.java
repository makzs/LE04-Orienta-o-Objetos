package br.edu.up.Views;

import java.util.Scanner;

import br.edu.up.Models.Carro;

public class EstacionamentoView {
    private Scanner scanner;

    public EstacionamentoView() {
        scanner = new Scanner(System.in);
    }

    public String lerPlaca() {
        System.out.print("Digite a placa do carro: ");
        return scanner.nextLine();
    }

    public Carro lerDadosCarro() {
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();
        System.out.print("Digite a cor do carro: ");
        String cor = scanner.nextLine();

        return new Carro(modelo, placa, cor);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
    
    public Scanner getScanner() {
        return scanner;
    }
}
