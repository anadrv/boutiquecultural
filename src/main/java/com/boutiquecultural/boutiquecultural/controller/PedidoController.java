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

import com.boutiquecultural.boutiquecultural.entity.Pedido;
import com.boutiquecultural.boutiquecultural.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public List<Pedido> listar(){
		return pedidoService.listarPedido();
	}
	
	@PostMapping
	public Pedido salvar(@RequestBody Pedido pedido) {
		return pedidoService.salvarPedido(pedido);
	}
	
	@DeleteMapping("/{id}")
	public void deletarPedido(@PathVariable int id) {
		pedidoService.deletarPedido(id);
	}
}
