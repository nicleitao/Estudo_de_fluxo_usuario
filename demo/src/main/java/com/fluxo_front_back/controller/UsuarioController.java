package com.fluxo_front_back.controller;
import com.fluxo_front_back.model.Usuario;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")

public class UsuarioController {

        @PostMapping
        public Usuario cadastrar(@RequestBody Usuario usuario) {

            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Idade: " + usuario.getIdade());

            return usuario;
        }
    }



