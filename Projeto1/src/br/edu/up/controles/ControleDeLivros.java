package br.edu.up.controles;

import br.edu.up.modelos.Livro;

public class ControleDeLivros {
    private Livro[] livros;

    public ControleDeLivros() {
        this.livros = new Livro[2];

        Livro l1 = new Livro("1598FHK", "Core Java 2", new String[] { "Cay S. Horstmann", "Gary Cornell" },
                "0130819336", 2005);

        Livro l2 = new Livro("9865PLO", "Java, How to Program", new String[] { "Harvey Deitel" }, "0130341517",
                2015);

        this.livros[0] = l1;
        this.livros[1] = l2;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
