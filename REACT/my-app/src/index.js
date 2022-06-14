import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import CalculoEMC from "./CalculoEMC";
import {BrowserRouter} from "react-router-dom";
import Calculadora from "./Calculadora";
import Pagina from "./Pagina";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
      <CalculoEMC />
      <Calculadora />
      <Pagina />
      <Teste/>
  </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
