package br.edu.up.telas;

import br.edu.up.controles.ControleDeLivros;
import br.edu.up.modelos.Livro;

public class MenuInicial {

    public void mostrar() {

        System.out.println("---------------------------------------------");
        System.out.println("\t\tLista de livros");
        System.out.println("---------------------------------------------");

        var controleLivros = new ControleDeLivros();
        var ListaLivros = controleLivros.getLivros();

        for (Livro livro : ListaLivros) {
            System.out.println("Codigo: " + livro.getCodigo());
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.print("Autores: ");

            var autores = livro.getAutores();

            for (int i = 0; i < autores.length; i++) {
                System.out.print(autores[i] + " / ");
            }

            System.out.println();
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Ano: " + livro.getAno());
            System.out.println("---------------------------------------------");
        }
    }
}
