package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.Tarifa;
import com.unaj.ppo.rest.models.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/api")
public class TarifaRestController {
    @Autowired
    private TarifaService tarifaService;

    //obtiene una lista de tarifas
    @GetMapping("/tarifas")
    public List<Tarifa> getTarifas() {
        return tarifaService.getTarifas();
    }

    //obtiene una tarifa por su id
    @GetMapping("/tarifas/{tarifaId}")
    public Tarifa getTarifa(@PathVariable int tarifaId) {
        return tarifaService.getTarifa(tarifaId);
    }

    //guarda una tarifa
    @PostMapping("/tarifas")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarifa addTarifa(@RequestBody Tarifa tarifa) {
        tarifa.setId(null);
        tarifaService.saveTarifa(tarifa);
        return tarifa;
    }

    //modifica una tarifa
    @PutMapping("/tarifas")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarifa updateTarifa(@RequestBody Tarifa tarifa)
    {
        tarifaService.saveTarifa(tarifa);
        return tarifa;
    }

    //elimina una tarifa por su ID
    @DeleteMapping("/tarifas/{tarifaId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTarifa(@PathVariable int tarifaId)
    {
        tarifaService.deleteTarifa(tarifaId);
    }
}
