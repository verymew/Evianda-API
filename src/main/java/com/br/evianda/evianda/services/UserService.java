package com.br.evianda.evianda.services;

import com.br.evianda.evianda.dto.UserDto;
import com.br.evianda.evianda.model.UserModel;
import com.br.evianda.evianda.repository.UserRepository;
import reactor.core.publisher.Mono;

public class UserService {
    private UserRepository userRepository;
    public Mono<UserModel> registrarUser(UserDto user) {
        UserModel novoUsuario = new UserModel();
        novoUsuario.setEmail(user.getEmail());
        novoUsuario.setNome(user.getNome());
        novoUsuario.setCpf(user.getCpf());
        novoUsuario.setSenha(user.getSenha());
        return userRepository.save(novoUsuario);
    }
}
