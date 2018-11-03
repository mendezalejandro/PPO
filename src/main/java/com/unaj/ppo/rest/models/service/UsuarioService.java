package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> getUsuarios();
    public void saveUsuario(Usuario usuario);
    public Usuario getUsuario(Integer id);
    public void deleteUsuario(Integer id);
}
