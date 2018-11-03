package com.unaj.ppo.rest.models.dao;
import com.unaj.ppo.rest.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{
}
