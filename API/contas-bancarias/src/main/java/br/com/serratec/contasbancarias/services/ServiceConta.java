package br.com.serratec.contasbancarias.services;


import br.com.serratec.contasbancarias.entity.Conta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceConta {

    static List<Conta> listaContas = new ArrayList<Conta>();

    public ServiceConta(){
        listaContas.add(new Conta(380,"Isabella Fernandes",9600.00,2000.00));
        listaContas.add(new Conta(452,"Gabriel Fernandes",5800.00,1200.00));
    }

    public List<Conta> retornarContas(){
        return listaContas;
    }

    public Conta retornarContaPorId(int numeroConta) {
        for (Conta conta : listaContas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public static String addConta(Conta conta){
        listaContas.add(conta);
        return "Foi inserido com sucesso";
    }

    public Conta atualizar(Integer numeroConta, Conta newConta) {
        for (Conta conta : listaContas) {
            if (conta.getNumero().equals(numeroConta)) {

                if (newConta.getNumero() != null) {
                    conta.setNumero(newConta.getNumero());
                }
                if (newConta.getTitular() != "" && newConta.getTitular() != null) {
                    conta.setTitular(newConta.getTitular());
                }
                return conta;
            }
        }
        return null;
    }

    public String deletar(Integer id) {

        Conta deletado = null;

        for (Conta conta : listaContas) {
            if (conta.getNumero().equals(id)) {
                deletado = conta;
                break;
            }
        }

        if (deletado != null) {
            listaContas.remove(deletado);
            return "Deletado com Sucesso";
        }

        return "Não há item com esse id para ser deletado";
    }

    public String saque(int numeroConta, Double valorSaque) {
        if (valorSaque <= 0){
            return "Valor Inválido!";
        }
        for (Conta conta : listaContas) {
            if (conta.getNumero() == numeroConta) {
                if(conta.getSaldo() >= valorSaque) {
                    conta.setSaldo(conta.getSaldo() - valorSaque);
                    return "Saque efetuado com sucesso!";
                }else {
                    return "Saque cancelado! o seu saldo é insuficiente! ";
                }
            }
        }
        return "Conta Inválida!";
    }

    public String compra(Integer numeroConta, String tipo, Double valor){
        if (valor <= 0){
            return "Valor Inválido!";
        }
        switch (tipo){
            case "credito":
                for (Conta conta : listaContas) {
                    if (conta.getNumero().equals(numeroConta)) {
                        if(conta.getLimiteCred() >= valor) {
                            conta.setLimiteCred(conta.getLimiteCred() - valor);
                            return "Compra no Credito efetuada com sucesso!";
                        }else {
                            return "Compra negada! o seu limite de credito é insuficiente!";
                        }
                    }
                }
                return "Conta Inválida!";

            case "debito":
                for (Conta conta : listaContas) {
                    if (conta.getNumero().equals(numeroConta)) {
                        if(conta.getSaldo() >= valor) {
                            conta.setSaldo(conta.getSaldo() - valor);
                            return "Compra no Debito efetuada com sucesso!";
                        }else {
                            return "Compra cancelada! o seu saldo é insuficiente! ";
                        }
                    }
                }
                return "Conta Inválida!";
        }
        return "Operação Inválida";
    }
}

