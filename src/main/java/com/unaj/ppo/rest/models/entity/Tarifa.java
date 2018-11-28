package com.unaj.ppo.rest.models.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name="tarifas")
public class Tarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="profesorid", nullable=false)
    private Profesor tarifaProfesor;

    @Column(name = "tarifa", length=200)
    private Double tarifa;

    @Column(name = "vigenciadesde", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date vigenciadesde;

    @Column(name = "vigenciahasta", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date vigenciahasta;


    public Tarifa() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
/*
    public Profesor getProfesor() {
        return profesorTarifa;
    }

    public void setProfesor(Profesor profesor) {
        this.profesorTarifa = profesor;
    }
*/
    public java.util.Date getVigenciadesde() {
        return vigenciadesde;
    }

    public void setVigenciadesde(java.util.Date vigenciadesde) {
        this.vigenciadesde = vigenciadesde;
    }

    public java.util.Date getVigenciahasta() {
        return vigenciahasta;
    }

    public void setVigenciahasta(java.util.Date vigenciahasta) {
        this.vigenciahasta = vigenciahasta;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
}
