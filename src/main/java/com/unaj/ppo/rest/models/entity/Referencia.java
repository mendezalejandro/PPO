package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;

@Entity
@Table(name="referencias")
public class Referencia {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="descripcion")
    private String descripcion;

    public Referencia() {

    }

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

    @Override
    public String toString() {
        return "Descripcion [id=" + id + ", descripcion=" + descripcion+ "]";
    }

}
