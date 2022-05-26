package br.com.serratec.biblioteca.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class Category implements Serializable {
    private static final long serialVerionUID =1L;
    @Id
    private Long id;
    private String nome;

    public Category() {
    }

    public Category(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return id.equals(category.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
