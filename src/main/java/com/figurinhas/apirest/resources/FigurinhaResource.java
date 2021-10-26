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

import com.figurinhas.apirest.models.Figurinha;
import com.figurinhas.apirest.repository.FigurinhaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Album de Figurinhas")
@CrossOrigin(origins="*")
public class FigurinhaResource {

	@Autowired
	FigurinhaRepository figurinhaRepository;
	
	@GetMapping("/figurinha")
	@ApiOperation(value="Retorna uma lista")
	public List<Figurinha> list() {
		return figurinhaRepository.findAll();
	}
	
	@GetMapping("/figurinha/{id}")
	@ApiOperation(value="Retorna um objeto unico")
	public Figurinha retrieve(@PathVariable(value="id") long id_figurinha) {
		return figurinhaRepository.findById(id_figurinha);
	}
	
	@PostMapping("/figurinha")
	@ApiOperation(value="Salva um objeto")
	public Figurinha create(@RequestBody Figurinha figurinha) {
		return figurinhaRepository.save(figurinha);
	}
	
	@DeleteMapping("/figurinha")
	@ApiOperation(value="Deleta um objeto")
	public void delete(@RequestBody Figurinha figurinha) {
		figurinhaRepository.delete(figurinha);
	}
	
	@PutMapping("/figurinha")
	@ApiOperation(value="Atualiza um objeto")
	public Figurinha update(@RequestBody Figurinha figurinha) {
		return figurinhaRepository.save(figurinha);
	}
}
