package com.figurinhas.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.figurinhas.apirest.models.Figurinha;

public interface FigurinhaRepository extends JpaRepository<Figurinha, Long> {
	Figurinha findById(long id);
}
