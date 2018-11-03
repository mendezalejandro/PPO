package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.TemaDAO;
import com.unaj.ppo.rest.models.entity.Tema;
import com.unaj.ppo.rest.models.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TemaServiceImpl implements TemaService {

    @Autowired
    private TemaDAO temaDAO;

    @Override
    @Transactional(readOnly=true)
    public List<Tema> getTemas()
    {
        return (List<Tema>) temaDAO.findAll();
    }

    @Override
    @Transactional
    public void saveTema(Tema tema)
    {
        temaDAO.save(tema);
    }

    @Override
    @Transactional(readOnly = true)
    public Tema getTema(Integer id)
    {
        return temaDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteTema(Integer id)
    {
        temaDAO.deleteById(id);
    }
}
