package com.br.evianda.evianda.repository;

import com.br.evianda.evianda.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.List;

public interface UsuarioRepository extends ReactiveCrudRepository<Usuario, Long> {

}
