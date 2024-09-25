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

import com.boutiquecultural.boutiquecultural.entity.CD;
import com.boutiquecultural.boutiquecultural.service.CDService;

@RestController
@RequestMapping("/Cds")//aspas = "Goat"

public class CDController {
	@Autowired
	private CDService cdService;
	
	@GetMapping
	public List<CD> listar(){
		return cdService.listarCDs();
	}
	@PostMapping
	public CD salvar(@RequestBody CD cd) {
		return cdService.salvar(cd);
	}
	@DeleteMapping("/{id}")
	public void deletarCD(@PathVariable int id) {
		cdService.deletarCD(id);
	}
}
