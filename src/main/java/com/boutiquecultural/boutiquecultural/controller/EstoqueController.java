package com.boutiquecultural.boutiquecultural.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boutiquecultural.boutiquecultural.entity.Estoque;
import com.boutiquecultural.boutiquecultural.service.EstoqueService;

@RestController
@RequestMapping("/estoques")
public class EstoqueController {
	
	@Autowired
	private EstoqueService estoqueService;
	
	@GetMapping
	public List<Estoque> listar(){
		return estoqueService.listarEstoque();
	}
	
	@PostMapping
	public Estoque salvar(@RequestBody Estoque estoque) {
		return estoqueService.salvarEstoque(estoque);
	}
	
	@DeleteMapping("/{id}")
	public void deletarPedido(@PathVariable int id) {
		estoqueService.deletarEstoque(id);
	}

}
