package com.br.evianda.evianda.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "enderecos")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "estado", nullable = false, length = 2)
    private String estado;

    @Column(name = "cidade", nullable = false, length = 64)
    private String cidade;

    @Column(name = "bairro", length = 64)
    private String bairro;

    @Column(name = "numero", nullable = false, length = 16)
    private String numero;

    @Column(name = "complemento", length = 256)
    private String complemento;

    @OneToOne(mappedBy = "endereco")
    private Usuario usuario;
}
