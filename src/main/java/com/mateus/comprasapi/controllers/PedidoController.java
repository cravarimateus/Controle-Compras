package com.mateus.comprasapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mateus.comprasapi.entities.Pedido;
import com.mateus.comprasapi.services.PedidoService;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping("/pedidos")
    public List<Pedido> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping("/pedidos")
    public Pedido salvar(@RequestBody Pedido pedido) {
        return service.salvar(pedido);
    }
}