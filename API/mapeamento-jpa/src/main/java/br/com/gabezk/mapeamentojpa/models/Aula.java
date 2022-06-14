package br.com.gabezk.mapeamentojpa.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "aula")
@Entity
public class Aula {

    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "modulo_id")
    private Modulo modulo;



}