package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Materia;

import java.util.List;
public interface MateriaService {
    public List<Materia> getMaterias();
    public void saveMateria(Materia materia);
    public Materia getMateria(Integer id);
    public void deleteMateria(Integer id);
}
