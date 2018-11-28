package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.ProfesorDAO;
import com.unaj.ppo.rest.models.entity.Profesor;
import com.unaj.ppo.rest.models.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private ProfesorDAO profesorDAO;


    @PersistenceContext
    EntityManager entityManager;

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

    @Transactional(readOnly=true)
    public List<Profesor> getProfesoresByMateriaTema(Integer materiaid, Integer temaid) {
        String queryStr = "SELECT * FROM Usuarios WHERE tipousuario='Profesor' AND id IN (SELECT DISTINCT(profesorid) FROM ofertas WHERE materiaid = :materiaid and temaid = :temaid)";
        Query query = entityManager.createNativeQuery(queryStr, Profesor.class);

        query.setParameter("materiaid", materiaid);
        query.setParameter("temaid", temaid);
        return query.getResultList();
    }

    @Transactional(readOnly=true)
    public List<Profesor> getProfesoresByMateria(Integer materiaid) {
        String queryStr = "SELECT * FROM Usuarios WHERE tipousuario='Profesor' AND id IN (SELECT DISTINCT(profesorid) FROM ofertas WHERE materiaid = :materiaid)";
        Query query = entityManager.createNativeQuery(queryStr, Profesor.class);

        query.setParameter("materiaid", materiaid);
        return query.getResultList();
    }

    @Transactional(readOnly=true)
    public List<Profesor> getProfesoresByTema(Integer temaid) {
        String queryStr = "SELECT * FROM Usuarios WHERE tipousuario='Profesor' AND id IN (SELECT DISTINCT(profesorid) FROM ofertas WHERE temaid = :temaid)";
        Query query = entityManager.createNativeQuery(queryStr, Profesor.class);

        query.setParameter("temaid", temaid);
        return query.getResultList();
    }
}