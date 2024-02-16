package com.br.evianda.evianda.model;


import jakarta.persistence.*;

@Entity
@Table(name = "itemcardapio")
public class ItemCardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_cardapio", referencedColumnName = "id")
    private Cardapio cardapios;
    @Column(name = "nome", nullable = false, length = 64)
    private String nome;
    @Column(name = "descricao", nullable = false, length = 200)
    private String descricao;
}
