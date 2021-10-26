package com.figurinhas.apirest.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Inventario")
public class Inventario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_inventario;
	private float dinheiro;
	
	@ManyToMany
	@JoinTable(name="InventarioFigurinha", joinColumns= {
			@JoinColumn(name="id_inventario")	}, inverseJoinColumns= {
					@JoinColumn(name="id_figurinha")
			})
	
	private List<Figurinha> figurinha;
	
	public List<Figurinha> getFigurinha() {
		return figurinha;
	}
	public void setFigurinha(List<Figurinha> figurinha) {
		this.figurinha = figurinha;
	}
	public long getId_inventario() {
		return id_inventario;
	}
	public void setId_inventario(long id_inventario) {
		this.id_inventario = id_inventario;
	}
	public float getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}
	
}
