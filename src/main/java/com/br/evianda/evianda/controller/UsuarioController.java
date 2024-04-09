package com.br.evianda.evianda.controller;

import com.br.evianda.evianda.model.Usuario;
import com.br.evianda.evianda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioRepository userRepo;

    @GetMapping
    Flux<Usuario> returnAll(){
        return userRepo.findAll();
    }

    @GetMapping("/teste")
    String merda(){
        return "juuu";
    }



}
