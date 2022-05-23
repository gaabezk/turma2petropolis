package br.com.serratec.contasbancarias.entity;

public class Conta {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteCred;

    public Conta(){
    }

    public Conta(Integer numero, String titular, Double saldo,Double limiteCred) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteCred = limiteCred;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteCred() {
        return limiteCred;
    }

    public void setLimiteCred(Double limiteCred) {
        this.limiteCred = limiteCred;
    }

    @Override
    public String toString() {
        return "CONTA: " +
                "Numero: " + numero +
                ", Titular: " + titular +
                ", Saldo " + saldo +
                ", Limite de Credito: " + limiteCred;
    }
}
