package com.figurinhas.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.figurinhas.apirest.models.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
	Inventario findById(long id);
}
