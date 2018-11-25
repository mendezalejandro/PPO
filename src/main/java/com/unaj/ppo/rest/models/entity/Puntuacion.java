package com.unaj.ppo.rest.models.entity;
import org.hibernate.annotations.Cascade;
import javax.persistence.*;

@Entity
@Table(name="puntuaciones")
public class Puntuacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name="profesorid")
    private Profesor profesorPuntuacion;

    @OneToOne
    @JoinColumn(name="estudianteid")
    private Estudiante estudiantePuntuacion;

    @Column(name = "puntuacion", nullable=false)
    private Integer puntuacion;

    @Column(name = "fecha", nullable=false)
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

    public Profesor getProfesor() {
        return profesorPuntuacion;
    }

    public void setProfesor(Profesor profesor) {
        this.profesorPuntuacion = profesor;
    }

    public Estudiante getEstudiante() {
        return estudiantePuntuacion;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiantePuntuacion = estudiante;
    }
}
