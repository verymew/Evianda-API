package com.br.evianda.evianda;

import com.br.evianda.evianda.model.Usuario;
import com.br.evianda.evianda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class EviandaApplication {
	@Autowired
	private PasswordEncoder encod;
	public static void main(String[] args) {
		SpringApplication.run(EviandaApplication.class, args);
	}

}