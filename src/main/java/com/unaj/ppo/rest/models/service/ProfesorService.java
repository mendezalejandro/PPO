package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Profesor;

import java.util.List;

public interface ProfesorService {
    public List<Profesor> getProfesores();
    public void saveProfesor(Profesor Profesor);
    public Profesor getProfesor(Integer id);
    public void deleteProfesor(Integer id);
}
