package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue( value="Profesor" )
public class Profesor extends Usuario {

    @Column(name = "social", length=200)
    private String social;

    @OneToMany(mappedBy="tarifaProfesor")
    private Set<Tarifa> tarifas;

    @OneToMany(mappedBy="puntuacionProfesor")
    private Set<Puntuacion> puntuaciones;

    @OneToMany(mappedBy="repositorioProfesor")
    private Set<RepositorioProblema> repositorios;

    @OneToMany(mappedBy="referenciaProfesor")
    private Set<Referencia> referencias;

    public Profesor() {
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public Set<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(Set<Tarifa> tarifas) {
        this.tarifas = tarifas;
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

    public Set<Referencia> getReferencias() {
        return referencias;
    }

    public void setReferencias(Set<Referencia> referencias) {
        this.referencias = referencias;
    }
}