package br.edu.up.Models;

public class ClientePessoa extends Cliente {
    private String cpf;
    private double peso;
    private double altura;

    public ClientePessoa( String nome, String telefone, String email, Endereco endereco, String cpf, double peso, double altura) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    public String clientePessoaToCSV() {
        return nome + "," + telefone + "," + email + "," + endereco.enderecoToCSV() + "," + cpf + "," + peso + "," + altura;
    }
    
  @Override
public String toString() {
    return "ClientePessoa [cpf=" + cpf + ", peso=" + peso + ", altura=" + altura + "]";
}

public String getCpf() {
    return cpf;
}


  public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
