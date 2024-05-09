import br.edu.up.Controllers.EstacionamentoController;
import br.edu.up.Models.Estacionamento;
import br.edu.up.Views.EstacionamentoView;

public class App {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        EstacionamentoView estacionamentoView = new EstacionamentoView();
        EstacionamentoController estacionamentoController = new EstacionamentoController(estacionamento, estacionamentoView);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Entrada de carro");
            System.out.println("2. Saída de carro");
            System.out.println("3. Emitir relatório");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(estacionamentoView.getScanner().nextLine());
            switch (opcao) {
                case 1:
                    estacionamentoController.entradaCarro();
                    break;
                case 2:
                    estacionamentoController.saidaCarro();
                    break;
                case 3:
                    estacionamentoController.emitirRelatorio();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    estacionamentoView.mostrarMensagem("Opção inválida.");
            }
        }
    }
}
