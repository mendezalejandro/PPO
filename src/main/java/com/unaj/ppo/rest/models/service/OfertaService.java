package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Oferta;

import java.util.List;

public interface OfertaService {
    public List<Oferta> getOfertas();
    public void saveOferta(Oferta oferta);
    public Oferta getOferta(Integer id);
    public void deleteOferta(Integer id);
}
