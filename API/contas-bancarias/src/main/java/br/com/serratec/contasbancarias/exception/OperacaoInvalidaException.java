package br.com.serratec.contasbancarias.exception;

public class OperacaoInvalidaException extends Exception{

    public String m1() {
        return "ERRO-OPERACAO";
    }
    public String m2() {
        return "Operação inválida";
    }
}
