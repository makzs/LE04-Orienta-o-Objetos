package br.edu.up.Models;

public class SeguroVida extends Seguro {

    private String beneficiario;
    private boolean cobreDoenca;
    private boolean cobreAcidente;
    
    public SeguroVida(Segurado segurado, String numeroApolice, double valor) {
        super(segurado, numeroApolice, valor);
    }

    public SeguroVida() {
        super();
    }

    public SeguroVida(String beneficiario, boolean cobreDoenca, boolean cobreAcidente) {
        this.beneficiario = beneficiario;
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
    }

    public SeguroVida(Segurado segurado, String numeroApolice, double valor, String beneficiario, boolean cobreDoenca,
            boolean cobreAcidente) {
        super(segurado, numeroApolice, valor);
        this.beneficiario = beneficiario;
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
    }

    public boolean isCobreDoenca() {
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente() {
        return cobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
}
