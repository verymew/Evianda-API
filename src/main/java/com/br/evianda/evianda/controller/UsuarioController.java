package com.br.evianda.evianda.controller;

import com.br.evianda.evianda.model.Usuario;
import com.br.evianda.evianda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository userRepository;

    @GetMapping
    List<Usuario> retornarTodos(){
        return userRepository.findAll();
    }

}
