package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.RepositorioProblema;
import com.unaj.ppo.rest.models.service.RepositorioProblemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/api")
public class RepositorioProblemaRestController {
    @Autowired
    private RepositorioProblemaService repositorioProblemaService;

    //obtiene una lista de repositorioProblemas
    @GetMapping("/repositorioProblemas")
    public List<RepositorioProblema> getRepositorioProblemas() {
        return repositorioProblemaService.getRepositorioProblemas();
    }

    //obtiene una repositorioProblema por su id
    @GetMapping("/repositorioProblemas/{repositorioProblemaId}")
    public RepositorioProblema getRepositorioProblema(@PathVariable int repositorioProblemaId) {
        return repositorioProblemaService.getRepositorioProblema(repositorioProblemaId);
    }

    //guarda una repositorioProblema
    @PostMapping("/repositorioProblemas")
    @ResponseStatus(HttpStatus.CREATED)
    public RepositorioProblema addRepositorioProblema(@RequestBody RepositorioProblema repositorioProblema) {
        repositorioProblema.setId(null);
        repositorioProblemaService.saveRepositorioProblema(repositorioProblema);
        return repositorioProblema;
    }

    //modifica una repositorioProblema
    @PutMapping("/repositorioProblemas")
    @ResponseStatus(HttpStatus.CREATED)
    public RepositorioProblema updateRepositorioProblema(@RequestBody RepositorioProblema repositorioProblema)
    {
        repositorioProblemaService.saveRepositorioProblema(repositorioProblema);
        return repositorioProblema;
    }

    //elimina una repositorioProblema por su ID
    @DeleteMapping("/repositorioProblemas/{repositorioProblemaId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRepositorioProblema(@PathVariable int repositorioProblemaId)
    {
        repositorioProblemaService.deleteRepositorioProblema(repositorioProblemaId);
    }
}
