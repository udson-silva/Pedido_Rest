/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedido.apirestPedido.Resource;

import com.pedido.apirestPedido.Repositori.PedidoRepository;
import com.pedido.apirestPedido.models.ModelPedido;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author udson
 */
@RestController
@RequestMapping(value = "/api")
public class PedidoResource {

    @Autowired
    PedidoRepository pedidorepositori;

    @GetMapping("/pedido")
    public List<ModelPedido> listaPedido() {
        return pedidorepositori.findAll();

    }

    @GetMapping("/pedido/{id}")
    public ModelPedido listaPedidoUnico(@PathVariable(value = "id") long id) {
        return pedidorepositori.findById(id);

    }

    @PostMapping("/pedido")
    public ModelPedido SalvaPedido(@RequestBody ModelPedido modelpedido) {
        return pedidorepositori.save(modelpedido);

    }

    @DeleteMapping("/pedido")
    public void DeletaPedido(@RequestBody ModelPedido modelpedido) {
        pedidorepositori.delete(modelpedido);

    }

    @PutMapping("/pedido")
    public ModelPedido AtualizaPedido(@RequestBody ModelPedido modelpedido) {
        return pedidorepositori.save(modelpedido);

    }

}
