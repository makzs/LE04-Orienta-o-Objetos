package br.up.edu.Models;

public class Passageiro extends Pessoa {
    private String identificadorBagagem;
    private Passagem passagem;

    public String getIdentificadorBagagem() {
        return identificadorBagagem;
    }

    public void setIdentificadorBagagem(String identificadorBagagem) {
        this.identificadorBagagem = identificadorBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Passageiro(String nome, String rg, String identificadorBagagem, Passagem passagem) {
        super(nome, rg);
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem;
    }

}
