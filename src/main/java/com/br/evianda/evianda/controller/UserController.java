package com.br.evianda.evianda.controller;

import com.br.evianda.evianda.dto.UserDto;
import com.br.evianda.evianda.model.UserModel;
import com.br.evianda.evianda.repository.UserRepository;
import com.br.evianda.evianda.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository userRepo;
    private UserService userService;
    @GetMapping
    Flux<UserModel> returnAll(){
        return userRepo.findAll();
    }
    @GetMapping("/teste")
    String merda(){
        return "juuu";
    }
    @PostMapping("/registrar")
    public Mono<UserModel> registrar(@RequestBody UserDto user) {
        return userService.registrarUser(user);
    }


}
