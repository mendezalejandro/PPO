package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue( value="Profesor" )
public class Profesor extends Usuario {

    @Column(name = "social", length=200)
    private String social;

    @OneToOne(mappedBy="profesorTarifa")
    private Tarifa profesorTarifa;

    @OneToOne(mappedBy="profesorPuntuacion")
    private Puntuacion profesorPuntuacion;

    @OneToOne(mappedBy="profesorRepositorio")
    private RepositorioProblema profesorRepositorio;

    public Profesor() {
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }
}