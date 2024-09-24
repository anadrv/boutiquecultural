package com.boutiquecultural.boutiquecultural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boutiquecultural.boutiquecultural.entity.Pedido;
import com.boutiquecultural.boutiquecultural.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<Pedido> listarPedido(){
		return pedidoRepository.findAll();
	}
	public Pedido salvarPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
		}
	public void deletarPedido(int id) {
		pedidoRepository.deleteById(id);
	}
}


