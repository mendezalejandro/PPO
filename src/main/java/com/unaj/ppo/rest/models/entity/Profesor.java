package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Usuario {

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Referencia> referencias = new ArrayList<>();

    public Profesor() {

    }

    public List<Referencia> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<Referencia> referencias) {
        this.referencias = referencias;
    }
}