package br.edu.up.Views;

import java.util.List;
import java.util.Scanner;

import br.edu.up.Controllers.SeguroController;
import br.edu.up.Models.Segurado;
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
            System.out.println("1. Incluir seguro vida");
            System.out.println("2. Incluir seguro veiculo");
            System.out.println("3. Localizar seguro");
            System.out.println("4. Excluir seguro");
            System.out.println("5. Excluir todos os seguros");
            System.out.println("6. Listar todos os seguros");
            System.out.println("7. Ver quantidade de seguros");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    incluirSeguroVida();
                    break;
                case 2:
                    incluirSeguroVeiculo();
                    break;
                case 3:
                    localizarSeguro();
                    System.out.println("_____________________________________________________________");
                    break;
                case 4:
                    excluirSeguro();
                    System.out.println("_____________________________________________________________");
                    break;
                case 5:
                    excluirTodosSeguros();
                    System.out.println("_____________________________________________________________");
                    break;
                case 6:
                    listarTodosSeguros();
                    System.out.println("_____________________________________________________________");
                    break;
                case 7:
                    verQuantidadeSeguros();
                    System.out.println("_____________________________________________________________");
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }

    private void incluirSeguroVida() {
        SeguroVida seguroVida = new SeguroVida();
        preencherDadosSeguro(seguroVida);
        System.out.print("Cobre doença? (true/false): ");
        seguroVida.setCobreDoenca(scanner.nextBoolean());
        System.out.print("Cobre acidente? (true/false): ");
        seguroVida.setCobreAcidente(scanner.nextBoolean());
        seguroController.incluirSeguro(seguroVida);
    }

    private void incluirSeguroVeiculo() {
        SeguroVeiculo seguroVeiculo = new SeguroVeiculo();
        preencherDadosSeguro(seguroVeiculo);
        System.out.print("Valor da franquia: ");
        seguroVeiculo.setValor(scanner.nextDouble());
        System.out.print("Tem carro reserva? (true/false): ");
        seguroVeiculo.setTemCarroReserva(scanner.nextBoolean());
        System.out.print("Cobre vidros? (true/false): ");
        seguroVeiculo.setCobreVidros(scanner.nextBoolean());
        seguroController.incluirSeguro(seguroVeiculo);
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
                System.out.println("Número da Apólice: " + s.getNumeroApolice() + ", Valor: " + s.getValor() + s.getSegurado().toString());
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

    private void preencherDadosSeguro(Seguro seguro) {
        System.out.print("Número da apólice: ");
        seguro.setNumeroApolice(scanner.nextLine());
        Segurado segurado = new Segurado();
        System.out.print("Nome do segurado: ");
        segurado.setNome(scanner.nextLine());
        System.out.print("RG: ");
        segurado.setRG(scanner.nextLine());
        System.out.print("CPF: ");
        segurado.setCPF(scanner.nextLine());
        System.out.print("Sexo: ");
        segurado.setSexo(scanner.nextLine());
        System.out.print("Telefone: ");
        segurado.setTelefone(scanner.nextLine());
        System.out.print("Endereço: ");
        segurado.setEndereco(scanner.nextLine());
        System.out.print("CEP: ");
        segurado.setCEP(scanner.nextLine());
        System.out.print("Cidade: ");
        segurado.setCidade(scanner.nextLine());
        seguro.setSegurado(segurado);
    }
}
