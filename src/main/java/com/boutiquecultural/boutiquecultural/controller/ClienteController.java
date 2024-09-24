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

import com.boutiquecultural.boutiquecultural.entity.Cliente;
import com.boutiquecultural.boutiquecultural.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteService.listarClientes();
	}
	
	@PostMapping
	public Cliente salvar (@RequestBody Cliente cliente) {
		return clienteService.salvar(cliente); 
	}
	
	@DeleteMapping("/{id}")
	public void deletarCliente (@PathVariable int id) {
		clienteService.deletar(id);
	}
}
