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
        return repository.findAll(); // Busca todos os fornecedores
    }
    
    public Fornecedor salvar(Fornecedor fornecedor) {
        return repository.save(fornecedor); // Salva ou atualiza
    }
    
    public Fornecedor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);        
    }
    
    public Fornecedor atualizar(Long id, Fornecedor fornecedorAtualizado) {

        Fornecedor fornecedor = repository.findById(id).orElse(null);

        if (fornecedor != null) {
            fornecedor.setNome(fornecedorAtualizado.getNome());
            fornecedor.setCnpj(fornecedorAtualizado.getCnpj());
            fornecedor.setEmail(fornecedorAtualizado.getEmail());
            fornecedor.setTelefone(fornecedorAtualizado.getTelefone());

            return repository.save(fornecedor);
        }

        return null;
    }
    
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}