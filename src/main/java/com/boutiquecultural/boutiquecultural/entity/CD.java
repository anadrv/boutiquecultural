package com.boutiquecultural.boutiquecultural.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class CD {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String album;
	
	@Column(nullable = false)
	private double preco;
	
	@OneToOne(mappedBy = "cd", cascade = CascadeType.ALL)
	private Estoque estoque;
	
	@ManyToMany(mappedBy = "cds")
	@JsonBackReference
	private Set <Pedido> pedidos;
	
	public Set<Pedido> getPedido() {
		return pedidos;
	}

	public void setPedido(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
