package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.PuntuacionDAO;
import com.unaj.ppo.rest.models.entity.Puntuacion;
import com.unaj.ppo.rest.models.service.PuntuacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PuntuacionServiceImpl implements PuntuacionService {

    @Autowired
    private PuntuacionDAO puntuacionDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Puntuacion> getPuntuaciones()
    {
        return (List<Puntuacion>) puntuacionDAO.findAll();
    }

    @Override
    @Transactional
    public void savePuntuacion(Puntuacion puntuacion)
    {
        puntuacionDAO.save(puntuacion);
    }

    @Override
    @Transactional(readOnly = true)
    public Puntuacion getPuntuacion(Integer id)
    {
        return puntuacionDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deletePuntuacion(Integer id)
    {
        puntuacionDAO.deleteById(id);
    }
}