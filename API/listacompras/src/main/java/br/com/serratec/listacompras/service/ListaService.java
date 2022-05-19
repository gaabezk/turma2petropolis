package br.com.serratec.listacompras.service;

import br.com.serratec.listacompras.model.ListaCompras;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ListaService {

    List<ListaCompras> minhaLista = new ArrayList<ListaCompras>(Arrays.asList(
            new ListaCompras(0,"Sabao em pó",5,6.50),
            new ListaCompras(1,"Detergente",3,1.80)));


    public void inserir(ListaCompras compras){
        minhaLista.add(compras);
    }

    public List<ListaCompras> visualizar(){
        return minhaLista;
    }

    public void deletar(int id){
        minhaLista.remove(minhaLista.get(id));
    }
}
