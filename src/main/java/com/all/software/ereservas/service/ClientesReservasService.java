/**
 * 
 */
package com.all.software.ereservas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.all.software.ereservas.modelo.ClientesReservas;
import com.all.software.ereservas.repository.IClientesReservasRepository;

/**
 * @author pedrhiga
 *
 */
@Service
@Transactional(readOnly = true)
public class ClientesReservasService implements IClientesReservasService{

	private final IClientesReservasRepository clientesReservasRepository;

	@Autowired
	public ClientesReservasService(IClientesReservasRepository clientesReservasRepository) {
		this.clientesReservasRepository = clientesReservasRepository;
	}

	@Override
	public List<ClientesReservas> findAllClientesReservas() {
		return this.clientesReservasRepository.findAll();
	}

	@Transactional
	@Override
	public ClientesReservas saveAllClientesReservas(ClientesReservas entity) {
		return this.clientesReservasRepository.insert(entity);
	}
}
