package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Inscripcion;

import java.util.List;

public interface InscripcionService {
    public List<Inscripcion> getInscripciones();
    public void saveInscripcion(Inscripcion Inscripcion);
    public Inscripcion getInscripcion(Integer id);
    public void deleteInscripcion(Integer id);
}
