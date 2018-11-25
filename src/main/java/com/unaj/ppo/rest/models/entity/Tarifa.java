package com.unaj.ppo.rest.models.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name="tarifas")
public class Tarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name="profesorid")
    private Profesor profesorTarifa;

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

    public Profesor getProfesor() {
        return profesorTarifa;
    }

    public void setProfesor(Profesor profesor) {
        this.profesorTarifa = profesor;
    }

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
}
