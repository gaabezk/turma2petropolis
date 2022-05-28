package com.serratec.application;

import com.serratec.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args){

        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Pessoa p1 = new Pessoa(null,"Carlos da silva","carlos@hotmail.com");
        Pessoa p2 = new Pessoa(null,"Carlos da silva","carlos@hotmail.com");
        Pessoa p3 = new Pessoa(null,"mirella souza vieira","mirella@hotmail.com");

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit();

        System.out.println("Pronto!");

    }
}
