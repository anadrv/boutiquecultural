package com.boutiquecultural.boutiquecultural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boutiquecultural.boutiquecultural.entity.Estoque;
import com.boutiquecultural.boutiquecultural.repository.EstoqueRepository;

@Service
public class EstoqueService {
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	public List<Estoque> listarEstoque(){
		return estoqueRepository.findAll();
	}
	public Estoque salvarEstoque(Estoque estoque) {
		return estoqueRepository.save(estoque);
		}
	public void deletarEstoque(int id) {
		estoqueRepository.deleteById(id);
	}
}
