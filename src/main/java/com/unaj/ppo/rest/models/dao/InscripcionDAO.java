package com.unaj.ppo.rest.models.dao;
import com.unaj.ppo.rest.models.entity.Inscripcion;
import com.unaj.ppo.rest.models.entity.Profesor;
import org.springframework.data.repository.CrudRepository;

public interface InscripcionDAO extends CrudRepository<Inscripcion,Integer> {
}
