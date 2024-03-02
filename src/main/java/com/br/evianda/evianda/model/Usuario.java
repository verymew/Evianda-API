package com.br.evianda.evianda.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 64)
    private String nome;

    @Column(name = "cpf", nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "email", unique = true, length = 320, nullable = false)
    private String email;

    @Column(name = "celular", length = 11)
    private String celular;

    @Column(name = "endereco", nullable = false)
    private Endereco endereco;

}
