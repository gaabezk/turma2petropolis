package com.serratec.application;

import dominio.Pessoa;

public class Programa {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa(1,"Carlos da silva","carlos@hotmail.com");
        Pessoa p2 = new Pessoa(2,"Gabriel Fernandes","gabriel@hotmail.com");
        Pessoa p3 = new Pessoa(3,"mirella souza vieira","mirella@hotmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
