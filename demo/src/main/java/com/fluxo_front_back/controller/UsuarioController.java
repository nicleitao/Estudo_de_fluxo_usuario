package com.fluxo_front_back.controller;
import com.fluxo_front_back.model.Usuario;
import com.fluxo_front_back.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")

public class UsuarioController {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        // Salva no MySQL e retorna o objeto com o ID gerado pelo banco
        return usuarioRepository.save(usuario);
    }

}



