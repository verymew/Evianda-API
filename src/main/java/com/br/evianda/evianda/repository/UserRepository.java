package com.br.evianda.evianda.repository;

import com.br.evianda.evianda.model.UserModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<UserModel, Long> {
    Mono<UserModel> findByEmail(String email);
}
