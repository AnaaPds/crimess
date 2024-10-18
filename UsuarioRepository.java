package com.casoscriminais.crimes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casoscriminais.crimes.model.UsuarioModel;

	@Repository
	public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

		
}
