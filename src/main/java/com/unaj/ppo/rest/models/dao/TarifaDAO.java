package com.unaj.ppo.rest.models.dao;
import com.unaj.ppo.rest.models.entity.Puntuacion;
import com.unaj.ppo.rest.models.entity.Tarifa;
import org.springframework.data.repository.CrudRepository;

public interface TarifaDAO extends CrudRepository<Tarifa,Integer>{
}
