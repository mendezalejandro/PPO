package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;

@Entity
@Table(name="inscripciones")
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "profesorid")
    private Integer profesorid;

    @Column(name = "estudianteid")
    private Integer estudianteid;
/*
    @ManyToOne
    @JoinColumn(name="profesorid")
    private Estudiante inscripcionEstudiante;
*/
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fecha;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private Estado estado;

    public Inscripcion() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfesorid() {
        return profesorid;
    }

    public void setProfesorid(Integer profesorid) {
        this.profesorid = profesorid;
    }

    public java.util.Date getFecha() {
        return fecha;
    }

    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getEstudianteid() {
        return estudianteid;
    }

    public void setEstudianteid(Integer estudianteid) {
        this.estudianteid = estudianteid;
    }

    public enum Estado {
        Inscripto,
        Finalizado
    }
}
