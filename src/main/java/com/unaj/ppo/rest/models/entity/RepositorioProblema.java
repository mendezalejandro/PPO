package com.unaj.ppo.rest.models.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name="repositorioproblemas")
public class RepositorioProblema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne(mappedBy="materia")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Materia materia;

    @Column(name = "problema", length = 200, nullable=false)
    private String problema;

    @Column(name = "solucion", length = 200, nullable=false)
    private String solucion;

    @ManyToOne
    @JoinColumn(name="profesorid")
    private Profesor repositorioProfesor;

    @ManyToOne
    @JoinColumn(name="estudianteid")
    private Estudiante repositorioEstudiante;


    public RepositorioProblema() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }
}
