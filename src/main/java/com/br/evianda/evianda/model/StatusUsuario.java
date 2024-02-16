package com.br.evianda.evianda.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "status_usuario")
public class StatusUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao", nullable = false)
    private String descricao;
}
