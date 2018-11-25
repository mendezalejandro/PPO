package com.unaj.ppo.rest.models.dao;
import com.unaj.ppo.rest.models.entity.Puntuacion;
import com.unaj.ppo.rest.models.entity.Referencia;
import org.springframework.data.repository.CrudRepository;

public interface PuntuacionDAO extends CrudRepository<Puntuacion,Integer>{
}
