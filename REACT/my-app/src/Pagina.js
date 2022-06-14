import {useState} from 'react';

function Saudacao(){

    var h = new Date().getHours();

    if (h <= 5 || h === 0) {
        return <h1>Boa Madrugada</h1>;
    }
    else if (h < 12) {
        return <h1>Bom Dia</h1>;
    }
    else if (h < 18) {
        return <h1>Boa Tarde</h1>;
    }
    else if (h >= 18) {
        return <h1>Boa Noite</h1>;
    }

}

function Contador(){
    let [contador,setContador] = useState(0);

    function adicionarContador(){
       setContador(contador + 10);
       console.log(contador+10);
    }

    function multiplicarContador(){
       setContador(contador * 10);
       console.log(contador*10);
    }

    function subtrairContador(){
        if (contador > 0){
        setContador(contador - 10);
        console.log(contador-10);
        }
    }
    return (
        <div>
            <div>{contador}</div>
            <button style={{margin:"10px",color: "green",backgroundColor: "black",padding: "8px",borderRadius:"20px"}} onClick={adicionarContador}>Adicionar</button>
            <button style={{margin:"10px",color: "red",backgroundColor: "black",padding: "8px",borderRadius:"20px"}} onClick={subtrairContador}>Subtrair</button><br/>
            <button style={{margin:"10px",color: "yellow",backgroundColor: "black",padding: "8px",borderRadius:"20px"}} onClick={multiplicarContador}>Multiplicar</button>
        </div>
    )
}

function Pagina(){
    return (<div align="center">
        <Saudacao/>
        <p>Este é um texto de testes</p>

        <Contador/>

    </div>)
}
export default Pagina;