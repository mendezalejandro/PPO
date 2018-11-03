package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.Materia;
import com.unaj.ppo.rest.models.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"http://localhost:9095"})
@RestController
@RequestMapping("/api")
public class MateriaRestController {
    @Autowired
    private MateriaService materiaService;

    //obtiene una lista de materias
    @GetMapping("/materias")
    public List<Materia> getMaterias() {
        return materiaService.getMaterias();
    }

    //obtiene una materia por su id
    @GetMapping("/materias/{materiaId}")
    public Materia getMateria(@PathVariable int materiaId) {
        return materiaService.getMateria(materiaId);
    }

    //guarda una materia
    @PostMapping("/materias")
    @ResponseStatus(HttpStatus.CREATED)
    public Materia addMateria(@RequestBody Materia materia) {
        materia.setId(null);
        materiaService.saveMateria(materia);
        return materia;
    }

    //modifica una materia
    @PutMapping("/materias")
    @ResponseStatus(HttpStatus.CREATED)
    public Materia updateMateria(@RequestBody Materia materia)
    {
        materiaService.saveMateria(materia);
        return materia;
    }

    //elimina una materia por su ID
    @DeleteMapping("/materias/{materiaId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMateria(@PathVariable int materiaId)
    {
        materiaService.deleteMateria(materiaId);
    }
}
