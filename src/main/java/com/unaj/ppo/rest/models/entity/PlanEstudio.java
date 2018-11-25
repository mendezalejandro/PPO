package com.unaj.ppo.rest.models.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="profesoresplanestudio")
public class PlanEstudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profesorid")
    private Integer profesorid;


    @Column(name = "materiatemaid")
    private Integer materiatemaid;

    public PlanEstudio() {

    }

    public Integer getMateriatemaid() {
        return materiatemaid;
    }

    public void setMateriatemaid(Integer materiatemaid) {
        this.materiatemaid = materiatemaid;
    }

    public Integer getProfesorid() {
        return profesorid;
    }

    public void setProfesorid(Integer profesorid) {
        this.profesorid = profesorid;
    }
}
