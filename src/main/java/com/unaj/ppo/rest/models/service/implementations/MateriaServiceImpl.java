package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.MateriaDAO;
import com.unaj.ppo.rest.models.entity.Materia;
import com.unaj.ppo.rest.models.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    private MateriaDAO materiaDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Materia> getMaterias()
    {
        return (List<Materia>) materiaDAO.findAll();
    }

    @Override
    @Transactional
    public void saveMateria(Materia materia)
    {
        materiaDAO.save(materia);
    }

    @Override
    @Transactional(readOnly = true)
    public Materia getMateria(Integer id)
    {
        return materiaDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteMateria(Integer id)
    {
        materiaDAO.deleteById(id);
    }
}
