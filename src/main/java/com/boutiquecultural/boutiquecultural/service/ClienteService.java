package com.boutiquecultural.boutiquecultural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boutiquecultural.boutiquecultural.entity.Cliente;
import com.boutiquecultural.boutiquecultural.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> listarClientes(){
		return clienteRepository.findAll();
	}
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
		}
	public void deletar(int id) {
		clienteRepository.deleteById(id);
	}
}


