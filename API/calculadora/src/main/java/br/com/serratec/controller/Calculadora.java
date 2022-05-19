package br.com.serratec.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculadora {

    @RequestMapping("/calc/{operador}/{num1}/{num2}")
    public double calculo(@PathVariable double num1, @PathVariable String operador, @PathVariable double num2) {

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
