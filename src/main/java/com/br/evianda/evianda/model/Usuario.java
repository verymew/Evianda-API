package com.br.evianda.evianda.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
import java.util.Set;

@Data
@Table("usuarios")
public class Usuario {
    @Id
    private Long id;

    @Column("nome")
    private String nome;

    @Column("cpf")
    private String cpf;

    @Column("senha")
    private String senha;

    @Column("email")
    private String email;

    @Column("celular")
    private String celular;

    @Column("endereco")
    private String endereco;
}
