package br.com.serratec.service;

import br.com.serratec.model.ListaCompras;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListaService {

    List<ListaCompras> minhaLista = new ArrayList<ListaCompras>();

    public void inserir(ListaCompras compras){
        minhaLista.add(compras);
    }

    public List<ListaCompras> visualizar(){
        return minhaLista;
    }

}
