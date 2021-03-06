package entities;

public class Conta {
    public String titular;
    public double numero;
    public double saldo;
    
    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }
    
    public boolean sacar(double valorSaque) {
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
            return true;
        }
        return false;
    }
    
    public void imprimirSaldo() {
        System.out.println("O valor do saldo ? R$ " + this.saldo);
    }
}