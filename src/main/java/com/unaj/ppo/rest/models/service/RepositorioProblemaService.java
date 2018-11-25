package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.RepositorioProblema;

import java.util.List;

public interface RepositorioProblemaService {
    public List<RepositorioProblema> getRepositorioProblemas();
    public void saveRepositorioProblema(RepositorioProblema RepositorioProblema);
    public RepositorioProblema getRepositorioProblema(Integer id);
    public void deleteRepositorioProblema(Integer id);
}
