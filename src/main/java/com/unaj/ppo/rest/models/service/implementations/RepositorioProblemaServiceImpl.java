package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.RepositorioProblemaDAO;
import com.unaj.ppo.rest.models.entity.RepositorioProblema;
import com.unaj.ppo.rest.models.service.RepositorioProblemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RepositorioProblemaServiceImpl implements RepositorioProblemaService {

    @Autowired
    private RepositorioProblemaDAO repositorioProblemaDAO;

    @Override
    @Transactional(readOnly=true)
    public List<RepositorioProblema> getRepositorioProblemas()
    {
        return (List<RepositorioProblema>) repositorioProblemaDAO.findAll();
    }

    @Override
    @Transactional
    public void saveRepositorioProblema(RepositorioProblema repositorioProblema)
    {
        repositorioProblemaDAO.save(repositorioProblema);
    }

    @Override
    @Transactional(readOnly = true)
    public RepositorioProblema getRepositorioProblema(Integer id)
    {
        return repositorioProblemaDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deleteRepositorioProblema(Integer id)
    {
        repositorioProblemaDAO.deleteById(id);
    }
}