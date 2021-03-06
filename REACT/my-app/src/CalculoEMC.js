import {useState} from 'react';
function CalculoEMC() {
    const [dados, setDados] = useState({
        peso: "",
        altura: ""
    });
    const [resultado, setResultado] = useState(0);
    const [resultadoLista, setResultadoLista] = useState([]);
    const estiloBotao = {
        backgroundColor: "#d1d1d1",
        color: "#1d1d1d",
        border: "none",
        padding: "15px 32px",
        textAlign: "center",
        fontSize: "2rem",
        marginTop: 35,
        cursor: "pointer",
        borderRadius: "5px",
        fontWeight: "bold"
    };

    const calcularIMC = (e) => {
        e.preventDefault();
        const imc = (dados.peso / (dados.altura * dados.altura)).toFixed(2);
        setResultado(imc);
        setResultadoLista([...resultadoLista, imc]);
    };
    return (
        <div className="App" align="center">
            <header className="App-header">
                <form onSubmit={calcularIMC}>
                    <div style={{display: "flex", flexDirection: "column", marginTop: 25}}>
                        <label style={{marginBottom: 15}}>Digite o seu peso:</label>
                        <input
                            type="number"
                            style={{padding: "5px 15px", fontSize: "2rem", fontFamily: "Helvetica", alignSelf:"center"}}
                            value={dados.peso}
                            onChange={(evento) => {
                                setDados({...dados, peso: evento.target.value});
                            }}
                        />
                    </div>
                    <div style={{display: "flex", flexDirection: "column", marginTop: 25}}>
                        <label style={{marginBottom: 15}}>Digite a sua altura:</label>
                        <input
                            type="number"
                            style={{padding: "5px 15px", fontSize: "2rem", fontFamily: "Helvetica",alignSelf:"center"}}
                            value={dados.altura}
                            onChange={(e) => setDados({...dados, altura: e.target.value})}
                        />
                    </div>
                    <div>
                        <button style={estiloBotao} type="submit">
                            Calcular
                        </button>
                    </div>
                </form>
                {resultado ? <h1>Seu IMC ??: {resultado}</h1> : null}
                {resultadoLista.length > 0
                    ? resultadoLista.map((resultado, index) => {
                        return (
                            <h1>
                                Hist??rico {index + 1}: {resultado}
                            </h1>
                        );
                    })
                    : null}
            </header>
        </div>
    );
}

export default CalculoEMC;