package com.unaj.ppo.rest.models.service;
import com.unaj.ppo.rest.models.entity.Referencia;

import java.util.List;

public interface ReferenciaService {
    public List<Referencia> getReferencias();
    public void saveReferencia(Referencia Referencia);
    public Referencia getReferencia(Integer id);
    public void deleteReferencia(Integer id);
}
