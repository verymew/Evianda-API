package com.br.evianda.evianda.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_cardapio")
public class TipoCardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo", nullable = false, length = 16)
    private String tipo;
}
