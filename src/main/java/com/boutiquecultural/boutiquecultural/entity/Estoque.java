package com.boutiquecultural.boutiquecultural.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Estoque {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private int quantidade;
	
	@OneToOne
	@JoinColumn(name = "livro_id")
	@JsonBackReference
	private Livro livro;
	
	@OneToOne
	@JoinColumn(name = "cd_id")
	@JsonBackReference
	private CD cd;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public CD getCD() {
		return cd;
	}

	public void setCD(CD cd) {
		this.cd = cd;
	}
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}
