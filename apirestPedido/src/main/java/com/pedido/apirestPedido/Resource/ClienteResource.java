/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedido.apirestPedido.Resource;

import com.pedido.apirestPedido.Repositori.ClienteRepository;
import com.pedido.apirestPedido.models.ModelCliente;
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
public class ClienteResource {

    @Autowired
    ClienteRepository clienterepositori;

    @GetMapping("/cliente")
    public List<ModelCliente> listaCliente() {
        return clienterepositori.findAll();

    }

    @GetMapping("/cliente/{id}")
    public ModelCliente listaClienteUnico(@PathVariable(value = "id") long id) {
        return clienterepositori.findById(id);

    }

    @PostMapping("/cliente")
    public ModelCliente SalvaCliente(@RequestBody ModelCliente modelcliente) {
        return clienterepositori.save(modelcliente);

    }

    @DeleteMapping("/cliente")
    public void DeletaCliente(@RequestBody ModelCliente modelcliente) {
        clienterepositori.delete(modelcliente);

    }

    @PutMapping("/cliente")
    public ModelCliente AtualizaCliente(@RequestBody ModelCliente modelcliente) {
        return clienterepositori.save(modelcliente);

    }

}
