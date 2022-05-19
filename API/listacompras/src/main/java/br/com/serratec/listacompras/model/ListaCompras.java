package br.com.serratec.listacompras.model;

public class ListaCompras {

    private int id;
    private String nomeProduto;
    private int quantidade;
    private double valor;

    public ListaCompras(){

    }

    public ListaCompras(int id, String nomeProduto, int quantidade, double valor) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuatidade() {
        return quantidade;
    }

    public void setQuatidade(int quatidade) {
        this.quantidade = quatidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
