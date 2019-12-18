/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedido.apirestPedido.models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author udson
 */
@Entity
@Table(name = "produto")
public class ModelProduto implements Serializable {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco_sugerido
     */
    public BigDecimal getPreco_sugerido() {
        return preco_sugerido;
    }

    /**
     * @param preco_sugerido the preco_sugerido to set
     */
    public void setPreco_sugerido(BigDecimal preco_sugerido) {
        this.preco_sugerido = preco_sugerido;
    }

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    private String nome;
    private BigDecimal preco_sugerido;

}
