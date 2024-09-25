package com.boutiquecultural.boutiquecultural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boutiquecultural.boutiquecultural.entity.Livro;
import com.boutiquecultural.boutiquecultural.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public List<Livro> listarLivros() {
		return livroRepository.findAll();
	}
	
	public Livro salvarLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public void deletarLivro(int id) {
		livroRepository.deleteById(id);
	}

}
