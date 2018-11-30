package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.EstudianteDAO;
import com.unaj.ppo.rest.models.entity.Estudiante;
import com.unaj.ppo.rest.models.entity.Profesor;
import com.unaj.ppo.rest.models.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteDAO estudianteDAO;

    @PersistenceContext
    EntityManager entityManager;

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

    @Transactional(readOnly=true)
    public List<Estudiante> getEstudiantesByProfesor(Integer profesorid) {
        String queryStr = "SELECT * FROM Usuarios WHERE tipousuario='Estudiante' AND id IN (SELECT DISTINCT(estudianteid) FROM inscripciones WHERE profesorid = :profesorid)";
        Query query = entityManager.createNativeQuery(queryStr, Estudiante.class);
        query.setParameter("profesorid",profesorid);
        return query.getResultList();
    }
}