import br.edu.up.Models.Ponto;

public class App {
    public static void main(String[] args) throws Exception {
        Ponto ponto1 = new Ponto(3, 4);
        Ponto ponto2 = new Ponto(6, 8);

        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre os pontos: " + distancia);

        double distanciaOrigem = ponto1.calcularDistanciaOrigem();
        System.out.println("Distância até a origem: " + distanciaOrigem);

        Ponto pontoMedio = ponto1.calcularPontoMedio(ponto2);
        System.out.println("Ponto médio: (" + pontoMedio.getX() + ", " + pontoMedio.getY() + ")");
    }
}
