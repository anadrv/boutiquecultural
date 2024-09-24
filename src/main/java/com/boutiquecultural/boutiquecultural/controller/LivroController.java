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

import com.boutiquecultural.boutiquecultural.entity.Livro;
import com.boutiquecultural.boutiquecultural.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping
	public List<Livro> listar(){
		return livroService.listarLivros();
	}
	
	@PostMapping
	public Livro salvar(@RequestBody Livro livro) {
		return livroService.salvarLivro(livro);
	}
	
	@DeleteMapping("/{id}")
	public void deletarLivro(@PathVariable int id) {
		livroService.deletarLivro(id);
	}
	

}
