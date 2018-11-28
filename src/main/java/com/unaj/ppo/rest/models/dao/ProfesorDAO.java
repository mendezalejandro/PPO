package com.unaj.ppo.rest.models.dao;
import com.unaj.ppo.rest.models.entity.Profesor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProfesorDAO extends CrudRepository<Profesor,Integer> {
}
