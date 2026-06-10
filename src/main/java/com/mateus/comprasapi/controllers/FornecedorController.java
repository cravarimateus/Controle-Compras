package com.mateus.comprasapi.controllers;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.comprasapi.entities.Fornecedor;
import com.mateus.comprasapi.services.FornecedorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
public class FornecedorController {

	@Autowired
	private FornecedorService service;

	@GetMapping("/fornecedores")  // GET  → lista todos
	public List<Fornecedor> listarTodos() {
		return service.listarTodos();
	}

	@PostMapping("/fornecedores")  // POST → cria novo fornecedor
	public Fornecedor salvar(@RequestBody Fornecedor fornecedor) {
		return service.salvar(fornecedor);
	}
	
	@GetMapping("/fornecedores/{id}")  // GET com ID → busca um específico
	public Fornecedor buscarPorId(@PathVariable Long id) {
	    return service.buscarPorId(id);
	}
	
	@PutMapping("/fornecedores/{id}")
	public Fornecedor atualizar(
	        @PathVariable Long id,
	        @RequestBody Fornecedor fornecedor) {

	    return service.atualizar(id, fornecedor);
	}
	
	@DeleteMapping("/fornecedores/{id}")
	public void deletar(@PathVariable Long id) {
	    service.deletar(id);
	}
}