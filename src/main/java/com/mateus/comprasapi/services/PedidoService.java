package com.mateus.comprasapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.comprasapi.entities.Fornecedor;
import com.mateus.comprasapi.entities.Pedido;
import com.mateus.comprasapi.repositories.FornecedorRepository;
import com.mateus.comprasapi.repositories.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public Pedido salvar(Pedido pedido) {
        Fornecedor fornecedor = fornecedorRepository.findById(
            pedido.getFornecedor().getId()
        ).orElse(null);

        pedido.setFornecedor(fornecedor);
        return repository.save(pedido);
    }

    public Pedido buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
    
    public Pedido atualizar(Long id, Pedido pedidoAtualizado) { //PUT DO PEDIDO

        Pedido pedido = repository.findById(id).orElse(null);

        if (pedido != null) {

            pedido.setDescricao(pedidoAtualizado.getDescricao());
            pedido.setValor(pedidoAtualizado.getValor());

            Fornecedor fornecedor = fornecedorRepository.findById(
                    pedidoAtualizado.getFornecedor().getId()
            ).orElse(null);

            pedido.setFornecedor(fornecedor);

            return repository.save(pedido);
        }

        return null;
    }
}