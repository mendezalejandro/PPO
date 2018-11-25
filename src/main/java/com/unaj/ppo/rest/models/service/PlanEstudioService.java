package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.PlanEstudio;

import java.util.List;

public interface PlanEstudioService {
    public List<PlanEstudio> getPlanesEstudio();
    public void savePlanEstudio(PlanEstudio planEstudio);
    public PlanEstudio getPlanEstudio(Integer id);
    public void deletePlanEstudio(Integer id);
}
