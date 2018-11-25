package com.unaj.ppo.rest.models.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue( value="Estudiante" )
public class Estudiante extends Usuario {

    @OneToOne(mappedBy="estudiantePuntuacion")
    private Puntuacion estudiantePuntuacion;

    @OneToOne(mappedBy="estudianteRepositorio")
    private RepositorioProblema estudianteRepositorio;

    public Estudiante() {

    }
}