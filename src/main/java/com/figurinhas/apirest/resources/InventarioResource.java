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

import com.figurinhas.apirest.models.Inventario;
import com.figurinhas.apirest.repository.InventarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Album de Figurinhas")
@CrossOrigin(origins="*")
public class InventarioResource {

	@Autowired
	InventarioRepository inventarioRepository;
	
	@GetMapping("/inventario")
	@ApiOperation(value="Retorna uma lista")
	public List<Inventario> list() {
		return inventarioRepository.findAll();
	}
	
	@GetMapping("/inventario/{id}")
	@ApiOperation(value="Retorna um objeto unico")
	public Inventario retrieve(@PathVariable(value="id") long id_inventario) {
		return inventarioRepository.findById(id_inventario);
	}
	
	@PostMapping("/inventario")
	@ApiOperation(value="Salva um objeto")
	public Inventario create(@RequestBody Inventario inventario) {
		return inventarioRepository.save(inventario);
	}
	
	@DeleteMapping("/inventario")
	@ApiOperation(value="Deleta um objeto")
	public void delete(@RequestBody Inventario inventario) {
		inventarioRepository.delete(inventario);
	}
	
	@PutMapping("/inventario")
	@ApiOperation(value="Atualiza um objeto")
	public Inventario update(@RequestBody Inventario inventario) {
		return inventarioRepository.save(inventario);
	}
}
