package com.casoscriminais.crimes.model;

import java.util.UUID;

import com.casoscriminais.crimes.controller.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "crimes")
	public class UsuarioModel {
		@Id
		@GeneratedValue(strategy = GenerationType.UUID)
		private UUID id;

		private String crime, numero, envolvidos, local, data, descricao;
		
		public UsuarioModel(UsuarioDTO crime) {
		
		this.crime = crime.crime();
			this.numero = crime.numero();
			this.envolvidos = crime.envolvidos();
			this.local = crime.local();
			this.data = crime.data();
			this.descricao = crime.descricao();
		}
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
		public UsuarioModel() {
			super();
		}
		public String getCrime() {
			return crime;
		}
		public String setCrime(String crime) {
			return crime;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getEnvolvidos() {
			return envolvidos;
		}
		public void setEnvolvidos(String envolvidos) {
			this.envolvidos = envolvidos;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		
		

}
