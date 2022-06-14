import { useState } from "react";
import logo from "./logo.svg";
import "./App.css";

function App() {
  const [contador, setContador] = useState(0);

  return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p style={{color: "red",backgroundColor: "black",padding: "10px",borderRadius:"12px"}}>
            CONTADOR
          </p>
          <button onClick={() => setContador(contador + 1)}>+ 1</button>
          <p>{contador}</p>
            <form>
                <label>Digite seu Peso:</label><br/>
                <input type={"number"} onChange={}/>
            </form>
        </header>
      </div>
  );
}

export default App;