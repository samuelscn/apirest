package com.figurinhas.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.figurinhas.apirest.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findById(long id);
}
