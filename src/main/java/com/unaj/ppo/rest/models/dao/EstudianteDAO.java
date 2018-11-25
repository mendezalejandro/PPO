package com.unaj.ppo.rest.models.dao;
import com.unaj.ppo.rest.models.entity.Estudiante;
import com.unaj.ppo.rest.models.entity.Profesor;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteDAO extends CrudRepository<Estudiante,Integer>{
}
