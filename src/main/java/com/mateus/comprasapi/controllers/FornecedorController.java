package com.mateus.comprasapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.comprasapi.entities.Fornecedor;
import com.mateus.comprasapi.services.FornecedorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class FornecedorController {

	@Autowired
	private FornecedorService service;

	@GetMapping("/fornecedores")
	public List<Fornecedor> listarTodos() {
		return service.listarTodos();
	}

	@PostMapping("/fornecedores")
	public Fornecedor salvar(@RequestBody Fornecedor fornecedor) {
		return service.salvar(fornecedor);
	}
	
	@GetMapping("/fornecedores/{id}")
	public Fornecedor buscarPorId(@PathVariable Long id) {
	    return service.buscarPorId(id);
	}

}