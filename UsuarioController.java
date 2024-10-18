package com.casoscriminais.crimes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casoscriminais.crimes.model.UsuarioModel;
import com.casoscriminais.crimes.repository.UsuarioRepository;


@RestController
@RequestMapping("crime")
public class UsuarioController {
	@Autowired
	
	UsuarioRepository repository;
	
	@GetMapping("get")
	public List<UsuarioModel> listarUsuarios() {
	List<UsuarioModel> lista = repository.findAll();
		return lista;
	}
	
	@PostMapping("cadastrar")
		public ResponseEntity<?> salvarUsuario(@RequestBody UsuarioDTO crime) {
			UsuarioModel crime2 = new UsuarioModel(crime);
			repository.save(crime2);
			return ResponseEntity.ok("usuario salvo com sucesso");
		}


}
