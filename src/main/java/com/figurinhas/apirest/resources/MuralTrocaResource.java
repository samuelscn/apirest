package com.figurinhas.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.figurinhas.apirest.models.MuralTroca;
import com.figurinhas.apirest.repository.MuralTrocaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Album de Figurinhas")
@CrossOrigin(origins="*")
public class MuralTrocaResource {
	
	@Autowired
	MuralTrocaRepository muralTrocaRepository;
	
	@GetMapping("/muralTroca")
	@ApiOperation(value="Retorna uma lista")
	public List<MuralTroca> list() {
		return muralTrocaRepository.findAll();
	}
	
	@PostMapping("/muralTroca")
	@ApiOperation(value="Salva um objeto")
	public MuralTroca create(@RequestBody MuralTroca muralTroca) {
		return muralTrocaRepository.save(muralTroca);
	}
	
	@DeleteMapping("/muralTroca")
	@ApiOperation(value="Deleta um objeto")
	public void delete(@RequestBody MuralTroca muralTroca) {
		muralTrocaRepository.delete(muralTroca);
	}
	
	@PutMapping("/muralTroca")
	@ApiOperation(value="Atualiza um objeto")
	public MuralTroca update(@RequestBody MuralTroca muralTroca) {
		return muralTrocaRepository.save(muralTroca);
	}
}
