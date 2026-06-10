package com.mateus.comprasapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mateus.comprasapi.entities.Pedido;
import com.mateus.comprasapi.services.PedidoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping("/pedidos") // GET  → lista todos
    public List<Pedido> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping("/pedidos")  // POST → cria novo pedido
    public Pedido salvar(@RequestBody Pedido pedido) {
        return service.salvar(pedido);            
    }
    
    @GetMapping("/pedidos/{id}")  // GET com ID → busca um
    public Pedido buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/pedidos/{id}")  // DELETE → deleta pelo ID
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
    
    @PutMapping("/pedidos/{id}")
    public Pedido atualizar(
            @PathVariable Long id,
            @RequestBody Pedido pedido) {

        return service.atualizar(id, pedido);
    }
    
    
}