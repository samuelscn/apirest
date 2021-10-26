package com.figurinhas.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MuralTroca")
public class MuralTroca {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_mural_troca;
	private long id_usuario;
	private long id_figurinha;
	
	public long getId_mural_troca() {
		return id_mural_troca;
	}

	public void setId_mural_troca(long id_mural_troca) {
		this.id_mural_troca = id_mural_troca;
	}

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public long getId_figurinha() {
		return id_figurinha;
	}

	public void setId_figurinha(long id_figurinha) {
		this.id_figurinha = id_figurinha;
	}
}
