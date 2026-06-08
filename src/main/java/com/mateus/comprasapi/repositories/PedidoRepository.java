package com.mateus.comprasapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.comprasapi.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}