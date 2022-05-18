package br.com.serratec.calculadora;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculadora {

    @RequestMapping("/calc")
    public double calculo(@RequestParam double num1, @RequestParam String operador, @RequestParam double num2) {

        switch (operador) {
            case "soma":
                return num1 + num2;
            case "subtracao":
                return num1 - num2;
            case "multiplicacao":
                return num1 * num2;
            case "divisao":
                return num1 / num2;
            default:
                return 0;
        }
    }
}
