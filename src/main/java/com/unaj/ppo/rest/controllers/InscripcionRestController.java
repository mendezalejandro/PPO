package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.Inscripcion;
import com.unaj.ppo.rest.models.service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/api")
public class InscripcionRestController {
    @Autowired
    private InscripcionService inscripcionService;

    //obtiene una lista de inscripciones
    @GetMapping("/inscripciones")
    public List<Inscripcion> getInscripciones() {
        return inscripcionService.getInscripciones();
    }

    //obtiene una inscripcion por su id
    @GetMapping("/inscripciones/{inscripcionId}")
    public Inscripcion getInscripcion(@PathVariable int inscripcionId) {
        return inscripcionService.getInscripcion(inscripcionId);
    }

    //guarda una inscripcion
    @PostMapping("/inscripciones")
    @ResponseStatus(HttpStatus.CREATED)
    public Inscripcion addInscripcion(@RequestBody Inscripcion inscripcion) {
        inscripcion.setId(null);
        inscripcionService.saveInscripcion(inscripcion);
        return inscripcion;
    }

    //modifica una inscripcion
    @PutMapping("/inscripciones")
    @ResponseStatus(HttpStatus.CREATED)
    public Inscripcion updateInscripcion(@RequestBody Inscripcion inscripcion)
    {
        inscripcionService.saveInscripcion(inscripcion);
        return inscripcion;
    }

    //elimina una inscripcion por su ID
    @DeleteMapping("/inscripciones/{inscripcionId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteInscripcion(@PathVariable int inscripcionId)
    {
        inscripcionService.deleteInscripcion(inscripcionId);
    }
}
