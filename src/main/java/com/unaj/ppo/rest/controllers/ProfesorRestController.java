package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.Profesor;
import com.unaj.ppo.rest.models.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/api")
public class ProfesorRestController {
    @Autowired
    private ProfesorService profesorService;

    //obtiene una lista de profesores
    @GetMapping("/profesores")
    public List<Profesor> getProfesores() {
        return profesorService.getProfesores();
    }

    //obtiene una lista de profesores por materia y tema
    @GetMapping("/profesores/materias/{materiaid}/temas/{temaid}")
    public List<Profesor> getProfesoresByMateriaTema(@PathVariable int materiaid, @PathVariable int temaid ) {
        return profesorService.getProfesoresByMateriaTema(materiaid,temaid);
    }
    //obtiene una lista de profesores por materia
    @GetMapping("/profesores/materias/{materiaid}")
    public List<Profesor> getProfesoresByMateria(@PathVariable int materiaid) {
        return profesorService.getProfesoresByMateria(materiaid);
    }
    //obtiene una lista de profesores por tema
    @GetMapping("/profesores/temas/{temaid}")
    public List<Profesor> getProfesoresByTema(@PathVariable int temaid) {
        return profesorService.getProfesoresByTema(temaid);
    }

    //obtiene una lista de profesores por estudiante inscripto
    @GetMapping("/profesores/estudiantes/{estudianteid}")
    public List<Profesor> getProfesoresByEstudiante(@PathVariable int estudianteid) {
        return profesorService.getProfesoresByEstudiante(estudianteid);
    }

    //obtiene una profesor por su id
    @GetMapping("/profesores/{profesorId}")
    public Profesor getProfesor(@PathVariable int profesorId) {
        return profesorService.getProfesor(profesorId);
    }

    //guarda una profesor
    @PostMapping("/profesores")
    @ResponseStatus(HttpStatus.CREATED)
    public Profesor addProfesor(@RequestBody Profesor profesor) {
        profesor.setId(null);
        profesorService.saveProfesor(profesor);
        return profesor;
    }

    //modifica una profesor
    @PutMapping("/profesores")
    @ResponseStatus(HttpStatus.CREATED)
    public Profesor updateProfesor(@RequestBody Profesor profesor)
    {
        profesorService.saveProfesor(profesor);
        return profesor;
    }

    //elimina una profesor por su ID
    @DeleteMapping("/profesores/{profesorId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfesor(@PathVariable int profesorId)
    {
        profesorService.deleteProfesor(profesorId);
    }
}
