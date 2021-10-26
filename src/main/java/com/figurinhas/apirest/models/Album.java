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
@Table(name="Album")
public class Album {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_album;
	private String nome;
	
	@ManyToMany
	@JoinTable(name="AlbumFigurinha", joinColumns= {
			@JoinColumn(name="id_album")	}, inverseJoinColumns= {
					@JoinColumn(name="id_figurinha")
			})
	private List<Figurinha> figurinha;

	public List<Figurinha> getFigurinha() {
		return figurinha;
	}
	public void setFigurinha(List<Figurinha> figurinha) {
		this.figurinha = figurinha;
	}
	public long getId_album() {
		return id_album;
	}
	public void setId_album(long id_album) {
		this.id_album = id_album;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
