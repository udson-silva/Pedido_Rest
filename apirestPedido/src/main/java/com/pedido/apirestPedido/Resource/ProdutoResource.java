/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedido.apirestPedido.Resource;

import com.pedido.apirestPedido.Repositori.ProdutoRepository;
import com.pedido.apirestPedido.models.ModelProduto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author udson
 */
@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtorepositori;

    @GetMapping("/produto")
    public List<ModelProduto> listaProduto() {
        return produtorepositori.findAll();

    }

    @GetMapping("/produto/{id}")
    public ModelProduto listaProdutoUnico(@PathVariable(value = "id") long id) {
        return produtorepositori.findById(id);

    }

    @PostMapping("/produto")
    public ModelProduto SalvaProduto(@RequestBody ModelProduto modelproduto) {
        return produtorepositori.save(modelproduto);

    }
   

    @DeleteMapping("/produto")
    public void DeletaProduto(@RequestBody ModelProduto modelproduto) {
        produtorepositori.delete(modelproduto);

    }

    @PutMapping("/produto")
    public ModelProduto AtualizaProduto(@RequestBody ModelProduto modelproduto) {
        return produtorepositori.save(modelproduto);

    }

}
