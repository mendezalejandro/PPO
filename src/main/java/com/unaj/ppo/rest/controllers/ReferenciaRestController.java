package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.Referencia;
import com.unaj.ppo.rest.models.service.ReferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"http://localhost:9095"})
@RestController
@RequestMapping("/api")
public class ReferenciaRestController {
    @Autowired
    private ReferenciaService referenciaService;

    //obtiene una lista de referencias
    @GetMapping("/referencias")
    public List<Referencia> getReferencias() {
        return referenciaService.getReferencias();
    }

    //obtiene una referencia por su id
    @GetMapping("/referencias/{referenciaId}")
    public Referencia getReferencia(@PathVariable int referenciaId) {
        return referenciaService.getReferencia(referenciaId);
    }

    //guarda una referencia
    @PostMapping("/referencias")
    @ResponseStatus(HttpStatus.CREATED)
    public Referencia addReferencia(@RequestBody Referencia referencia) {
        referencia.setId(null);
        referenciaService.saveReferencia(referencia);
        return referencia;
    }

    //modifica una referencia
    @PutMapping("/referencias")
    @ResponseStatus(HttpStatus.CREATED)
    public Referencia updateReferencia(@RequestBody Referencia referencia)
    {
        referenciaService.saveReferencia(referencia);
        return referencia;
    }

    //elimina una referencia por su ID
    @DeleteMapping("/referencias/{referenciaId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReferencia(@PathVariable int referenciaId)
    {
        referenciaService.deleteReferencia(referenciaId);
    }
}
