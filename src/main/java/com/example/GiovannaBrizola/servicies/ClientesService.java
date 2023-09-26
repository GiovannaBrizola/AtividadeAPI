package com.example.GiovannaBrizola.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GiovannaBrizola.entities.Clientes;
import com.example.GiovannaBrizola.repository.ClientesRepository;

@Service
public class ClientesService {
	private final ClientesRepository clientesRepository;

	@Autowired
	public ClientesService(ClientesRepository clientesRepository) {
		this.clientesRepository = clientesRepository;
	}

	public Clientes saveClientes(Clientes cliente) {
		return clientesRepository.save(cliente);
	}

	public Clientes getClientesById(Long idcCliente) {
		return clientesRepository.findById(idcCliente).orElse(null);
	}

	public List<Clientes> getAllClientes() {
		return clientesRepository.findAll();
	}

	public void deleteClientes(Long idcCliente) {
		clientesRepository.deleteById(idcCliente);
	}

}
