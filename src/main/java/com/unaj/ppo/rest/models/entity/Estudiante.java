package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue( value="Estudiante" )
public class Estudiante extends Usuario {

    @OneToMany(mappedBy="puntuacionEstudiante")
    private Set<Puntuacion> puntuaciones;


    @OneToMany(mappedBy="repositorioEstudiante")
    private Set<RepositorioProblema> repositorios;


    public Estudiante() {

    }

    public Set<Puntuacion> getPuntuaciones() {
        return puntuaciones;
    }

    public void setPuntuaciones(Set<Puntuacion> puntuaciones) {
        this.puntuaciones = puntuaciones;
    }

    public Set<RepositorioProblema> getRepositorios() {
        return repositorios;
    }

    public void setRepositorios(Set<RepositorioProblema> repositorios) {
        this.repositorios = repositorios;
    }
}