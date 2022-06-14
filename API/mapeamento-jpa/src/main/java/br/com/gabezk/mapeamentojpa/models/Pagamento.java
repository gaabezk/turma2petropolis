package br.com.gabezk.mapeamentojpa.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "pagamento")
@Entity
public class Pagamento {

    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal valor;

    @OneToOne
    @JoinColumn(name = "matricula_id")
    private Matricula matriculas;


}