/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedido.apirestPedido.Repositori;

import com.pedido.apirestPedido.models.ModelItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author udson
 */
public interface ItemPedidoRepository extends JpaRepository<ModelItemPedido, Long>{
    
    
    ModelItemPedido findById(long id);
    
}