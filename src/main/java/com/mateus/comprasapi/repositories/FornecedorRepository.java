package com.mateus.comprasapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.comprasapi.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}