package br.com.serratec.contasbancarias.controllers;


import br.com.serratec.contasbancarias.entity.Conta;
import br.com.serratec.contasbancarias.exception.ContaInvalidaException;
import br.com.serratec.contasbancarias.exception.OperacaoInvalidaException;
import br.com.serratec.contasbancarias.services.ServiceConta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ControllerConta {

    @Autowired
    ServiceConta conta;

    @GetMapping
    public List<Conta> listarContas(){
        return conta.retornarContas();
    }

    @GetMapping(path = "/{coe}")
    public Conta listarContaPorId(@PathVariable(name = "coe") int numeroConta) throws ContaInvalidaException {
        return conta.retornarContaPorId(numeroConta);
    }

    @PostMapping("/insert")
    public String create(@RequestBody Conta conta) {
        return ServiceConta.addConta(conta);
    }

    @PutMapping("/{numeroConta}")
    public Conta atualizar(@PathVariable Integer numeroConta, @RequestBody Conta newConta) {
        return conta.atualizar(numeroConta, newConta);
    }

    @DeleteMapping("/{numeroConta}")
    public String deletar(@PathVariable Integer numeroConta) {
        return conta.deletar(numeroConta);
    }

    @PutMapping("/saque/{numeroConta}/{valorSaque}")
    public String sacar(@PathVariable int numeroConta ,@PathVariable Double valorSaque) throws ContaInvalidaException {
       return conta.saque(numeroConta,valorSaque);
    }

    @PutMapping("/compra/{numeroConta}/{tipo}/{valor}")
    public String compra(@PathVariable Integer numeroConta, @PathVariable String tipo, @PathVariable Double valor) throws ContaInvalidaException, OperacaoInvalidaException {
        return conta.compra(numeroConta,tipo,valor);
    }

}
