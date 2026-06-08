package com.mateus.comprasapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.comprasapi.entities.Fornecedor;
import com.mateus.comprasapi.repositories.FornecedorRepository;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository repository;

    public List<Fornecedor> listarTodos() {
        return repository.findAll();
    }
    
    public Fornecedor salvar(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }
    
    public Fornecedor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
	
    
}