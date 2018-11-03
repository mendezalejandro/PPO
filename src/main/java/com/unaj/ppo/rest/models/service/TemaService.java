package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Tema;

import java.util.List;

public interface TemaService {
    public List<Tema> getTemas();
    public void saveTema(Tema Tema);
    public Tema getTema(Integer id);
    public void deleteTema(Integer id);
}
