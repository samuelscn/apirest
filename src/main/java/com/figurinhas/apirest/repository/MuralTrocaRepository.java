package com.figurinhas.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.figurinhas.apirest.models.MuralTroca;

public interface MuralTrocaRepository extends JpaRepository<MuralTroca, Long> {
	MuralTroca findById(long id);
}
