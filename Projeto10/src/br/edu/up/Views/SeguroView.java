package br.edu.up.Views;

import java.util.List;
import java.util.Scanner;

import br.edu.up.Controllers.SeguroController;
import br.edu.up.Models.Seguro;
import br.edu.up.Models.SeguroVida;
import br.edu.up.Models.SeguroVeiculo;

public class SeguroView {
    private SeguroController seguroController;
    private Scanner scanner;

    public SeguroView() {
        this.seguroController = new SeguroController();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcao = 0;
        do {
            System.out.println("1. Incluir seguro");
            System.out.println("2. Localizar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros");
            System.out.println("5. Listar todos os seguros");
            System.out.println("6. Ver quantidade de seguros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    System.out.println("_____________________________________________________________");
                    break;
                case 3:
                    excluirSeguro();
                    System.out.println("_____________________________________________________________");
                    break;
                case 4:
                    excluirTodosSeguros();
                    System.out.println("_____________________________________________________________");
                    break;
                case 5:
                    listarTodosSeguros();
                    System.out.println("_____________________________________________________________");
                    break;
                case 6:
                    verQuantidadeSeguros();
                    System.out.println("_____________________________________________________________");
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }

    private void incluirSeguro() {
        System.out.print("Digite o número da apólice: ");
        String numeroApolice = scanner.nextLine();
        System.out.print("Digite o valor do seguro: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Tipo de seguro:");
        System.out.println("1. Seguro de Vida");
        System.out.println("2. Seguro de Veículo");
        System.out.print("Escolha uma opção: ");
        int tipoSeguro = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Seguro seguro;
        if (tipoSeguro == 1) {
            System.out.print("Digite o beneficiário: ");
            String beneficiario = scanner.nextLine();
            seguro = new SeguroVida();
            ((SeguroVida) seguro).setBeneficiario(beneficiario);
        } else if (tipoSeguro == 2) {
            System.out.print("Digite o modelo do veículo: ");
            String modelo = scanner.nextLine();
            seguro = new SeguroVeiculo();
            ((SeguroVeiculo) seguro).setModelo(modelo);
        } else {
            System.out.println("Tipo de seguro inválido.");
            return;
        }

        seguro.setNumeroApolice(numeroApolice);
        seguro.setValor(valor);
        boolean resultado = seguroController.incluirSeguro(seguro);
        if (resultado) {
            System.out.println("Seguro incluído com sucesso.");
        } else {
            System.out.println("Número da apólice já existe.");
        }
    }

    private void localizarSeguro() {
        System.out.print("Digite o número da apólice: ");
        String numeroApolice = scanner.nextLine();
        System.out.println("_________________________________________________________________________");
        Seguro seguro = seguroController.localizarSeguro(numeroApolice);
        if (seguro != null) {
            System.out.println("Seguro encontrado:");
            System.out.println("Número da Apólice: " + seguro.getNumeroApolice() + ", Valor: " + seguro.getValor());
            if (seguro instanceof SeguroVida) {
                System.out.println("Beneficiário: " + ((SeguroVida) seguro).getBeneficiario());
            } else if (seguro instanceof SeguroVeiculo) {
                System.out.println("Modelo: " + ((SeguroVeiculo) seguro).getModelo());
            }
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        System.out.print("Digite o número da apólice: ");
        String numeroApolice = scanner.nextLine();
        if (seguroController.excluirSeguro(numeroApolice)) {
            System.out.println("Seguro excluído com sucesso.");
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirTodosSeguros() {
        System.out.print("Tem certeza que deseja excluir todos os seguros? (s/n): ");
        String confirmacao = scanner.nextLine();
        boolean resultado = seguroController.excluirTodosSeguros(confirmacao.equalsIgnoreCase("s"));
        if (resultado) {
            System.out.println("Todos os seguros foram excluídos.");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    private void listarTodosSeguros() {
        List<Seguro> seguros = seguroController.listarTodosSeguros();
        if (seguros.isEmpty()) {
            System.out.println("Nenhum seguro cadastrado.");
        } else {
            for (Seguro s : seguros) {
                System.out.println("Número da Apólice: " + s.getNumeroApolice() + ", Valor: " + s.getValor());
                if (s instanceof SeguroVida) {
                    System.out.println("Beneficiário: " + ((SeguroVida) s).getBeneficiario());
                } else if (s instanceof SeguroVeiculo) {
                    System.out.println("Modelo: " + ((SeguroVeiculo) s).getModelo());
                }
            }
        }
    }

    private void verQuantidadeSeguros() {
        System.out.println("Quantidade de seguros: " + seguroController.quantidadeSeguros());
    }
}
