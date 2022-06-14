function cal(c) {
    var c;
    var f = 9 / 5 * c + 32;
    document.write(`O valor de Celsius para Fahrenheit é ${f}`)
}
cal(parseFloat(prompt("Digite um valor em graus Celsius para mostrar o valor em Fahrenheit")));