package com.figurinhas.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.figurinhas.apirest.models.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{
	Album findById(long id);
}
