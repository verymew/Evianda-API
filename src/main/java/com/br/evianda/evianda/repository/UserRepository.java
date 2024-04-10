package com.br.evianda.evianda.repository;

import com.br.evianda.evianda.model.UserModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<UserModel, Long> {

}
