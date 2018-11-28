package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.OfertaDAO;
import com.unaj.ppo.rest.models.entity.Oferta;
import com.unaj.ppo.rest.models.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OfertaServiceImpl implements OfertaService {

    @Autowired
    private OfertaDAO ofertaDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Oferta> getOfertas()
    {
        return (List<Oferta>) ofertaDAO.findAll();
    }

    @Override
    @Transactional
    public void saveOferta(Oferta oferta)
    {
        ofertaDAO.save(oferta);
    }

    @Override
    @Transactional(readOnly = true)
    public Oferta getOferta(Integer id)
    {
        return ofertaDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteOferta(Integer id)
    {
        ofertaDAO.deleteById(id);
    }
}
