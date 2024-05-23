package br.edu.up.Models;

public abstract class Cliente {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;
    protected Double vlrMaxCredito;
    protected Double vlrEmprestado;

    public void emprestar(Double valor){
        
    }

    public Double devolver(Double valor){
        return valor;
    }
    
    public Cliente(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getVlrMaxCredito() {
        return vlrMaxCredito;
    }
    public void setVlrMaxCredito(Double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }
    public Double getVlrEmprestado() {
        return vlrEmprestado;
    }
    public void setVlrEmprestado(Double vlrEmprestado) {
        this.vlrEmprestado = vlrEmprestado;
    }

    
}
