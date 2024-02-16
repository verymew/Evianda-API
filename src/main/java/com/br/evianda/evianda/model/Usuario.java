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
    private Integer id;

    @Column(name = "nome", nullable = false, length = 64)
    private String nome;

    @Column(name = "cpf", nullable = false, unique = true, length = 11)
    private String cpf;

    // TODO - Verificar o tamanho da senha
    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "email", unique = true, length = 320)
    private String email;

    @Column(name = "celular", length = 11)
    private String celular;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "status_usuario_id")
    private StatusUsuario statusUsuario;

    @OneToOne(mappedBy = "usuario")
    private Vendedor vendedor;

    @OneToMany(mappedBy = "usuario")
    private List<Avaliacao> avaliacoes;
}
