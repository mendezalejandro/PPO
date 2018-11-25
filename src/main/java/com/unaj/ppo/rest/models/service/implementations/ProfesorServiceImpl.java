package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.ProfesorDAO;
import com.unaj.ppo.rest.models.entity.Profesor;
import com.unaj.ppo.rest.models.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private ProfesorDAO profesorDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Profesor> getProfesores()
    {
        return (List<Profesor>) profesorDAO.findAll();
    }

    @Override
    @Transactional
    public void saveProfesor(Profesor profesor)
    {
        profesorDAO.save(profesor);
    }

    @Override
    @Transactional(readOnly = true)
    public Profesor getProfesor(Integer id)
    {
        return profesorDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteProfesor(Integer id)
    {
        profesorDAO.deleteById(id);
    }
}