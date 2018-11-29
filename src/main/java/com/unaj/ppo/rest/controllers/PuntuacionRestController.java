package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.Puntuacion;
import com.unaj.ppo.rest.models.service.PuntuacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/api")
public class PuntuacionRestController {
    @Autowired
    private PuntuacionService puntuacionService;

    //obtiene una lista de puntuaciones
    @GetMapping("/puntuaciones")
    public List<Puntuacion> getPuntuaciones() {
        return puntuacionService.getPuntuaciones();
    }

    //obtiene una puntuacion por su id
    @GetMapping("/puntuaciones/{puntuacionId}")
    public Puntuacion getPuntuacion(@PathVariable int puntuacionId) {
        return puntuacionService.getPuntuacion(puntuacionId);
    }

    //guarda una puntuacion
    @PostMapping("/puntuaciones")
    @ResponseStatus(HttpStatus.CREATED)
    public Puntuacion addPuntuacion(@RequestBody Puntuacion puntuacion) {
        puntuacion.setId(null);
        puntuacionService.savePuntuacion(puntuacion);
        return puntuacion;
    }

    //modifica una puntuacion
    @PutMapping("/puntuaciones")
    @ResponseStatus(HttpStatus.CREATED)
    public Puntuacion updatePuntuacion(@RequestBody Puntuacion puntuacion)
    {
        puntuacionService.savePuntuacion(puntuacion);
        return puntuacion;
    }

    //elimina una puntuacion por su ID
    @DeleteMapping("/puntuaciones/{puntuacionId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePuntuacion(@PathVariable int puntuacionId)
    {
        puntuacionService.deletePuntuacion(puntuacionId);
    }
}
