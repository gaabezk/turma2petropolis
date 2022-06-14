import {useState} from 'react';

function Saudacao() {
    var h = new Date().getHours();

    if (h <= 5 || h === 0) {
        return <h1>Boa Madrugada</h1>;
    } else if (h < 12) {
        return <h1>Bom Dia</h1>;
    } else if (h < 18) {
        return <h1>Boa Tarde</h1>;
    } else if (h >= 18) {
        return <h1>Boa Noite</h1>;
    }

}

function Calculo() {
    const [result, setResult] = useState(0);
    const [num1, setNum1] = useState(0);
    const [num2, setNum2] = useState(0);
    const [operador, setOperador] = useState(0);

    function calcula(){
      switch (operador){
          case "+":
              return setResult(num1 + num2)
          default : return setResult(0)
      }
    }


console.log(result)
    return(
    <div>
        <div>{result}</div>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>%</button>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>CE</button>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>C</button>
        <button style={{width: "30px",height: "33px",textAlign:"center"}}>x</button>
        <br/>
        <button onClick={()=>setNum2(1)} style={{width: "42px",height: "33px",textAlign:"center"}}>1</button>
        <button onClick={()=>setNum1(2)} style={{width: "42px",height: "33px",textAlign:"center"}}>2</button>
        <button onClick={()=>setNum2(3)} style={{width: "42px",height: "33px",textAlign:"center"}}>3</button>
        <button style={{width: "30px",height: "33px",textAlign:"center"}}>/</button>
        <br/>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>4</button>
        <button onClick={()=>setNum2(5)} style={{width: "42px",height: "33px",textAlign:"center"}}>5</button>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>6</button>
        <button style={{width: "30px",height: "33px",textAlign:"center"}}>*</button>
        <br/>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>7</button>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>8</button>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>9</button>
        <button style={{width: "30px",height: "33px",textAlign:"center"}}>-</button>
        <br/>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>,</button>
        <button style={{width: "42px",height: "33px",textAlign:"center"}}>0</button>
        <button onClick={()=>setOperador("+")} style={{width: "42px",height: "33px",textAlign:"center"}}>+</button>
        <button onClick={calcula} style={{width: "30px",height: "33px",textAlign:"center"}}>=</button>
    </div>
    )

}
function Calculadora() {
    return (<div align="center">
        <Saudacao/>
        <p>Calculadora</p>
        <Calculo/>
    </div>)
}

export default Calculadora;