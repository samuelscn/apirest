package com.figurinhas.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.figurinhas.apirest.models.Album;
import com.figurinhas.apirest.repository.AlbumRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Album de Figurinhas")
@CrossOrigin(origins="*")
public class AlbumResource {
	
	@Autowired
	AlbumRepository albumRepository;
	
	@GetMapping("/album")
	@ApiOperation(value="Retorna uma lista de albuns")
	public List<Album> list() {
		return albumRepository.findAll();
	}
	
	@GetMapping("/album/{id}")
	@ApiOperation(value="Retorna um album unico")
	public Album retrieve(@PathVariable(value="id") long id_album) {
		return albumRepository.findById(id_album);
	}
	
	@PostMapping("/album")
	@ApiOperation(value="Salva um album")
	public Album create(@RequestBody Album album) {
		System.out.println("teste");
		return albumRepository.save(album);
	}
	
	@DeleteMapping("/album/{id}")
	@ApiOperation(value="Deleta um album")
	public void delete(@RequestBody Album album) {
		albumRepository.delete(album);
	}
	
	@PutMapping("/album")
	@ApiOperation(value="Atualiza um album")
	public Album update(@RequestBody Album album) {
		return albumRepository.save(album);
	}
}
