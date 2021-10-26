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

import com.figurinhas.apirest.repository.UsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.figurinhas.apirest.models.Usuario;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Album de Figurinhas")
@CrossOrigin(origins="*")
public class UsuarioResource {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuario")
	@ApiOperation(value="Retorna uma lista")
	public List<Usuario> list() {
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	@ApiOperation(value="Retorna um objeto unico")
	public Usuario retrieve(@PathVariable(value="id") long id_usuario) {
		return usuarioRepository.findById(id_usuario);
	}
	
	@PostMapping("/usuario")
	@ApiOperation(value="Salva um objeto")
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("/usuario")
	@ApiOperation(value="Deleta um objeto")
	public void delete(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	@PutMapping("/usuario")
	@ApiOperation(value="Atualiza um objeto")
	public Usuario update(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
