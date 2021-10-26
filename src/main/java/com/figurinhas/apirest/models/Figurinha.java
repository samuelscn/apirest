package com.figurinhas.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Figurinha")
public class Figurinha {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_figurinha;
	
	private String nome;
	private String descricao;
	
	public long getId_figurinha() {
		return id_figurinha;
	}
	public void setId_figurinha(long id_figurinha) {
		this.id_figurinha = id_figurinha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
