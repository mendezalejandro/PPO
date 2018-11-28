package com.unaj.ppo.rest.models.entity;
import javax.persistence.*;

@Entity
@Table(name="ofertas")
public class Oferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ofertaid")
    private Integer ofertaid;

    @ManyToOne
    @JoinColumn(name="profesorid")
    private Profesor oferta;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Materia materia;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Tema tema;


    public Oferta() { }

    public Integer getOfertaid() {
        return ofertaid;
    }

    public void setOfertaid(Integer ofertaid) {
        this.ofertaid = ofertaid;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }
}
