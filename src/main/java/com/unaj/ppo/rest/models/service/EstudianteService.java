package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Estudiante;

import java.util.List;

public interface EstudianteService {
    public List<Estudiante> getEstudiantes();
    public List<Estudiante> getEstudiantesByProfesor(Integer profesorid);
    public void saveEstudiante(Estudiante Estudiante);
    public Estudiante getEstudiante(Integer id);
    public void deleteEstudiante(Integer id);
}
