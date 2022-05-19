package br.com.serratec.model;

public class ListaCompras {

    private int id;
    private String nomeProduto;
    private int quatidade;
    private double valor;

    public ListaCompras(){

    }

    public ListaCompras(int id, String nomeProduto, int quatidade, double valor) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quatidade = quatidade;
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
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
