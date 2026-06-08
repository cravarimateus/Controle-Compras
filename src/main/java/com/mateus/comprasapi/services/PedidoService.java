package com.mateus.comprasapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.comprasapi.entities.Pedido;
import com.mateus.comprasapi.repositories.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public Pedido salvar(Pedido pedido) {
        return repository.save(pedido);
    }
}