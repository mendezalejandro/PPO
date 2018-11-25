package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Tarifa;

import java.util.List;

public interface TarifaService {
    public List<Tarifa> getTarifas();
    public void saveTarifa(Tarifa Tarifa);
    public Tarifa getTarifa(Integer id);
    public void deleteTarifa(Integer id);
}
