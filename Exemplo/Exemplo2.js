const pessoa = {
    nome: "gabriel",
    idade: 22,
    endereco:{
        cidade: "Petrópolis",
        estado: "RJ"
    },
    sexo: "masculino",
    gritar: () => {
        console.log("AAAAAAAAAAAAAAAA")
    }
}

const pessoa2 = {...pessoa, idade: 23}

console.log(pessoa)
console.log(pessoa2)
