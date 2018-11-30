package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.InscripcionDAO;
import com.unaj.ppo.rest.models.entity.Inscripcion;
import com.unaj.ppo.rest.models.service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class InscripcionServiceImpl implements InscripcionService {

    @Autowired
    private InscripcionDAO inscripcionDAO;


    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional(readOnly=true)
    public List<Inscripcion> getInscripciones()
    {
        return (List<Inscripcion>) inscripcionDAO.findAll();
    }


    @Override
    @Transactional
    public void saveInscripcion(Inscripcion inscripcion)
    {
        inscripcionDAO.save(inscripcion);
    }

    @Override
    @Transactional(readOnly = true)
    public Inscripcion getInscripcion(Integer id)
    {
        return inscripcionDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteInscripcion(Integer id)
    {
        inscripcionDAO.deleteById(id);
    }

    @Transactional(readOnly=true)
    public List<Inscripcion> getInscripcionesByMateriaTema(Integer materiaid, Integer temaid) {
        String queryStr = "SELECT * FROM Usuarios WHERE tipousuario='Inscripcion' AND id IN (SELECT DISTINCT(inscripcionid) FROM ofertas WHERE materiaid = :materiaid and temaid = :temaid)";
        Query query = entityManager.createNativeQuery(queryStr, Inscripcion.class);

        query.setParameter("materiaid", materiaid);
        query.setParameter("temaid", temaid);
        return query.getResultList();
    }

    @Transactional(readOnly=true)
    public List<Inscripcion> getInscripcionesByMateria(Integer materiaid) {
        String queryStr = "SELECT * FROM Usuarios WHERE tipousuario='Inscripcion' AND id IN (SELECT DISTINCT(inscripcionid) FROM ofertas WHERE materiaid = :materiaid)";
        Query query = entityManager.createNativeQuery(queryStr, Inscripcion.class);

        query.setParameter("materiaid", materiaid);
        return query.getResultList();
    }

    @Transactional(readOnly=true)
    public List<Inscripcion> getInscripcionesByTema(Integer temaid) {
        String queryStr = "SELECT * FROM Usuarios WHERE tipousuario='Inscripcion' AND id IN (SELECT DISTINCT(inscripcionid) FROM ofertas WHERE temaid = :temaid)";
        Query query = entityManager.createNativeQuery(queryStr, Inscripcion.class);

        query.setParameter("temaid", temaid);
        return query.getResultList();
    }
}