package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.TarifaDAO;
import com.unaj.ppo.rest.models.entity.Tarifa;
import com.unaj.ppo.rest.models.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TarifaServiceImpl implements TarifaService {

    @Autowired
    private TarifaDAO tarifaDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Tarifa> getTarifas()
    {
        return (List<Tarifa>) tarifaDAO.findAll();
    }

    @Override
    @Transactional
    public void saveTarifa(Tarifa tarifa)
    {
        tarifaDAO.save(tarifa);
    }

    @Override
    @Transactional(readOnly = true)
    public Tarifa getTarifa(Integer id)
    {
        return tarifaDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteTarifa(Integer id)
    {
        tarifaDAO.deleteById(id);
    }
}