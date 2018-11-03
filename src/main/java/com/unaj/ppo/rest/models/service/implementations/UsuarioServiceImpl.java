package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.UsuarioDAO;
import com.unaj.ppo.rest.models.entity.Usuario;
import com.unaj.ppo.rest.models.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Usuario> getUsuarios()
    {
        return (List<Usuario>) usuarioDAO.findAll();
    }

    @Override
    @Transactional
    public void saveUsuario(Usuario usuario)
    {
        usuarioDAO.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuario(Integer id)
    {
        return usuarioDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteUsuario(Integer id)
    {
        usuarioDAO.deleteById(id);
    }
}