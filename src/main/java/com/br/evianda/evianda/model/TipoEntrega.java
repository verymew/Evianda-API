package com.br.evianda.evianda.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_entregas")
public class TipoEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendedor_id", referencedColumnName = "id")
    private Vendedor vendedor;

    @Column(name = "descricao", nullable = false, length = 512)
    private String descricao;
}
