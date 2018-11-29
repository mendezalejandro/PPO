package com.unaj.ppo.rest.controllers;

import com.unaj.ppo.rest.models.entity.Usuario;
import com.unaj.ppo.rest.models.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins={"http://localhost:9095"})
@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    private UsuarioService usuarioService;

    //obtiene una lista de usuarios
    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    //obtiene una usuario por su id
    @GetMapping("/usuarios/{usuarioId}")
    public Usuario getUsuario(@PathVariable int usuarioId) {
        return usuarioService.getUsuario(usuarioId);
    }

    //guarda una usuario
    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario addUsuario(@RequestBody Usuario usuario) {
        usuario.setId(null);
        usuarioService.saveUsuario(usuario);
        return usuario;
    }

    //modifica una usuario
    @PutMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario updateUsuario(@RequestBody Usuario usuario)
    {
        usuarioService.saveUsuario(usuario);
        return usuario;
    }

    //elimina una usuario por su ID
    @DeleteMapping("/usuarios/{usuarioId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUsuario(@PathVariable int usuarioId)
    {
        usuarioService.deleteUsuario(usuarioId);
    }
}
