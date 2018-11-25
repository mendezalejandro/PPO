package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="materias")
public class Materia {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="descripcion")
    private String descripcion;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "materiastemas", joinColumns = @JoinColumn(name = "materiaid"), inverseJoinColumns = @JoinColumn(name = "temaid"))
    private Set<Tema> temas = new HashSet<>();

    @OneToOne
    @PrimaryKeyJoinColumn
    private RepositorioProblema materia;

    public Materia() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Tema> getTemas() {
        return temas;
    }

    public void setTemas(Set<Tema> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Descripcion [id=" + id + ", descripcion=" + descripcion+ "]";
    }

}
