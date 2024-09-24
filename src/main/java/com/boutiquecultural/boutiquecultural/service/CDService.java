package com.boutiquecultural.boutiquecultural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boutiquecultural.boutiquecultural.entity.CD;
import com.boutiquecultural.boutiquecultural.repository.CDRepository;

@Service
public class CDService {

	@Autowired
	private CDRepository cdRepository;

	public List<CD> listarCDs() {
		return cdRepository.findAll();
	}

	public CD salvar(CD cd) {
		return cdRepository.save(cd);
	}

	public void deletarCD(int id) {
		cdRepository.deleteById(id);
	}

}
