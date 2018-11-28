package com.unaj.ppo.rest.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class PlanEstudioKeys implements Serializable {
    @Column(name="profesorid")
    private String profesorid;

    @Column(name="materiatemaid")
    private String materiatemaid;
}