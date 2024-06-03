package br.edu.up.Models;

public class Segurado {
    private String nome;
    private String RG;
    private String CPF;
    private String sexo;
    private String telefone;
    private String endereco;
    private String CEP;
    private String cidade;

    public Segurado() {
        super();
    }

    public Segurado(String nome, String rG, String cPF, String sexo, String telefone, String endereco, String cEP,
            String cidade) {
        this.nome = nome;
        RG = rG;
        CPF = cPF;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
        CEP = cEP;
        this.cidade = cidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDados() {
        return String.format("Nome: %s\nRG: %s\nCPF: %s\nSexo: %s\nTelefone: %s\nEndereco: %s\nCEP: %s\nCidade: %s",
                nome, RG, CPF, sexo, telefone, endereco, CEP, cidade);
    }

    @Override
    public String toString() {
        return getDados();
    }
}