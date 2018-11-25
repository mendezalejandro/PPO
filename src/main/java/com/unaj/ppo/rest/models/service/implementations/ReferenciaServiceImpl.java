package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.ReferenciaDAO;
import com.unaj.ppo.rest.models.entity.Referencia;
import com.unaj.ppo.rest.models.service.ReferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReferenciaServiceImpl implements ReferenciaService {

    @Autowired
    private ReferenciaDAO referenciaDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Referencia> getReferencias()
    {
        return (List<Referencia>) referenciaDAO.findAll();
    }

    @Override
    @Transactional
    public void saveReferencia(Referencia referencia)
    {
        referenciaDAO.save(referencia);
    }

    @Override
    @Transactional(readOnly = true)
    public Referencia getReferencia(Integer id)
    {
        return referenciaDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteReferencia(Integer id)
    {
        referenciaDAO.deleteById(id);
    }
}