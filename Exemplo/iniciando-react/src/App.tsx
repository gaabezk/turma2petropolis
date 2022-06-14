import {Texto} from "./components/Texto";
import {useState} from "react";

function App() {
    const [texto,setTexto] = useState<string[]>([
        'Texto 1',
        'Texto 2',
        'Texto 3',
        'Texto 4'
    ])

    function createTexto(){
        setTexto([...texto,'Texto 5'])
    }

    return (
        <div>
            {texto.map(texto => {
                return <Texto text={texto}/>
            })}
            <button onClick={createTexto}>Adicionar texto</button>

        </div>
    );
}

export default App
