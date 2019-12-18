/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedido.apirestPedido.Resource;

import com.pedido.apirestPedido.Repositori.ItemPedidoRepository;
import com.pedido.apirestPedido.models.ModelItemPedido;
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
public class ItemPedidoResource {

    @Autowired
    ItemPedidoRepository itempedidorepositori;

    @GetMapping("/item_pedido")
    public List<ModelItemPedido> listaItemPedido() {
        return itempedidorepositori.findAll();

    }

    @GetMapping("/item_pedido/{id}")
    public ModelItemPedido listaItemPedidoUnico(@PathVariable(value = "id") long id) {
        return itempedidorepositori.findById(id);

    }

    @PostMapping("/item_pedido")
    public ModelItemPedido SalvaItemPedido(@RequestBody ModelItemPedido modelItempedido) {
        return itempedidorepositori.save(modelItempedido);

    }

    @DeleteMapping("/item_pedido")
    public void DeletaPedido(@RequestBody ModelItemPedido modelitempedido) {
        itempedidorepositori.delete(modelitempedido);

    }

    @PutMapping("/item_pedido")
    public ModelItemPedido AtualizaItemPedido(@RequestBody ModelItemPedido modelitempedido) {
        return itempedidorepositori.save(modelitempedido);

    }

}
