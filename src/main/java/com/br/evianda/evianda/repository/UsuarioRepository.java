package com.br.evianda.evianda.repository;

import com.br.evianda.evianda.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
