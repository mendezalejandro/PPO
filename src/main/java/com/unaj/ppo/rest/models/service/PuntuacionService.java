package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Puntuacion;

import java.util.List;

public interface PuntuacionService {
    public List<Puntuacion> getPuntuaciones();
    public void savePuntuacion(Puntuacion Puntuacion);
    public Puntuacion getPuntuacion(Integer id);
    public void deletePuntuacion(Integer id);
}
