package com.example.GiovannaBrizola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GiovannaBrizola.entities.Clientes;
import com.example.GiovannaBrizola.servicies.ClientesService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	private final ClientesService clientesService;

	@Autowired
	public ClientesController(ClientesService clientesService) {
		this.clientesService = clientesService;
	}

	@PostMapping
	public Clientes createClientes(@RequestBody Clientes clientes) {
		return clientesService.saveClientes(clientes);
	}

	@GetMapping("/{id}")
	public Clientes getClientes(@PathVariable Long idcCliente) {
		return clientesService.getClientesById(idcCliente);
	}

	@GetMapping
	public List<Clientes> getAllProdutos() {
		return clientesService.getAllClientes();
	}

	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long idcCliente) {
		clientesService.deleteClientes(idcCliente);
	}

}
