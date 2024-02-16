package com.br.evianda.evianda.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cardapio")
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "id_tipo_cardapio", referencedColumnName = "id")
    private TipoCardapio tipo;
    @Column(name = "nome", nullable = false, length = 64)
    private String nome;
    @Column(name = "ativado", nullable = false, length = 2)
    private Integer ativado;
    @Column(name = "centavos", nullable = false)
    private Long centavos;
}
