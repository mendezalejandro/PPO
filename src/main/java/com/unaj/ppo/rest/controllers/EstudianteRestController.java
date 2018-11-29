package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.Estudiante;
import com.unaj.ppo.rest.models.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/api")
public class EstudianteRestController {
    @Autowired
    private EstudianteService estudianteService;

    //obtiene una lista de estudiantes
    @GetMapping("/estudiantes")
    public List<Estudiante> getEstudiantes() {
        return estudianteService.getEstudiantes();
    }

    //obtiene una estudiante por su id
    @GetMapping("/estudiantes/{estudianteId}")
    public Estudiante getEstudiante(@PathVariable int estudianteId) {
        return estudianteService.getEstudiante(estudianteId);
    }

    //guarda una estudiante
    @PostMapping("/estudiantes")
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante addEstudiante(@RequestBody Estudiante estudiante) {
        estudiante.setId(null);
        estudianteService.saveEstudiante(estudiante);
        return estudiante;
    }

    //modifica una estudiante
    @PutMapping("/estudiantes")
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante updateEstudiante(@RequestBody Estudiante estudiante)
    {
        estudianteService.saveEstudiante(estudiante);
        return estudiante;
    }

    //elimina una estudiante por su ID
    @DeleteMapping("/estudiantes/{estudianteId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEstudiante(@PathVariable int estudianteId)
    {
        estudianteService.deleteEstudiante(estudianteId);
    }
}
