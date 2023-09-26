package com.example.GiovannaBrizola.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_Cliente")
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcClientes;

	@Column(name = "cliente")
	private String ncliente;

	@Column(name = "fone")
	private String fone;

	public Long getIdcClientes() {
		return idcClientes;
	}

	public void setIdcClientes(Long idcClientes) {
		this.idcClientes = idcClientes;
	}

	public String getNcliente() {
		return ncliente;
	}

	public void setNcliente(String ncliente) {
		this.ncliente = ncliente;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	
}