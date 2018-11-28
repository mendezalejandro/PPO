package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;

@Entity
@Table(name="puntuaciones")
public class Puntuacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="profesorid")
    private Profesor puntuacionProfesor;

    @ManyToOne
    @JoinColumn(name="estudianteid")
    private Estudiante puntuacionEstudiante;


    @Column(name = "puntuacion")
    private Integer puntuacion;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fecha;

    public Puntuacion() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public java.util.Date getFecha() {
        return fecha;
    }

    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }

}
