package com.unaj.ppo.rest.models.service.implementations;

import com.unaj.ppo.rest.models.dao.PlanEstudioDAO;
import com.unaj.ppo.rest.models.entity.PlanEstudio;
import com.unaj.ppo.rest.models.service.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlanEstudioServiceImpl implements PlanEstudioService {

    @Autowired
    private PlanEstudioDAO planEstudioDAO;

    @Override
    @Transactional(readOnly=true)
    public List<PlanEstudio> getPlanesEstudio()
    {
        return (List<PlanEstudio>) planEstudioDAO.findAll();
    }

    @Override
    @Transactional
    public void savePlanEstudio(PlanEstudio planEstudio)
    {
        planEstudioDAO.save(planEstudio);
    }

    @Override
    @Transactional(readOnly = true)
    public PlanEstudio getPlanEstudio(Integer id)
    {
        return planEstudioDAO.findById(id).get();
    }

    @Override
    @Transactional
    public  void deletePlanEstudio(Integer id)
    {
        planEstudioDAO.deleteById(id);
    }
}
