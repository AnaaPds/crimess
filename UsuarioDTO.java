package com.casoscriminais.crimes.controller;

import java.util.UUID;

import com.casoscriminais.crimes.model.UsuarioModel;

public record UsuarioDTO( String crime, String numero, String envolvidos, String local, String data, String descricao) {
//	
//	public UsuarioDTO(UsuarioModel crime) {
//		this(crime.getId(), crime.getCrime(), crime.getNumero(), crime.getLocal(), crime.getData(), crime.getDescricao());
//	}

	

}
