package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.Tema;
import com.unaj.ppo.rest.models.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"http://localhost:9095"})
@RestController
@RequestMapping("/api")
public class TemaRestController {
    @Autowired
    private TemaService temaService;

    //obtiene una lista de temas
    @GetMapping("/temas")
    public List<Tema> getTemas() {
        return temaService.getTemas();
    }

    //obtiene una tema por su id
    @GetMapping("/temas/{temaId}")
    public Tema getTema(@PathVariable int temaId) {
        return temaService.getTema(temaId);
    }

}
