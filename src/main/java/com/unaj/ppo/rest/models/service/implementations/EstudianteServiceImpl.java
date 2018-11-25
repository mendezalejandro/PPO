package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.EstudianteDAO;
import com.unaj.ppo.rest.models.entity.Estudiante;
import com.unaj.ppo.rest.models.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteDAO estudianteDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Estudiante> getEstudiantes()
    {
        return (List<Estudiante>) estudianteDAO.findAll();
    }

    @Override
    @Transactional
    public void saveEstudiante(Estudiante estudiante)
    {
        estudianteDAO.save(estudiante);
    }

    @Override
    @Transactional(readOnly = true)
    public Estudiante getEstudiante(Integer id)
    {
        return estudianteDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteEstudiante(Integer id)
    {
        estudianteDAO.deleteById(id);
    }
}