package com.unaj.ppo.rest.models.entity;
import javax.persistence.*;

@Entity
@Table(name="profesoresplanestudio",uniqueConstraints=@UniqueConstraint(columnNames= {"profesorid","materiatemaid"}))
public class PlanEstudio {
    @EmbeddedId
    private
    PlanEstudioKeys profesor_materiastemasid;

    public PlanEstudio() { }

    public PlanEstudioKeys getProfesor_materiastemasid() {
        return profesor_materiastemasid;
    }

    public void setProfesor_materiastemasid(PlanEstudioKeys profesor_materiastemasid) {
        this.profesor_materiastemasid = profesor_materiastemasid;
    }
}
