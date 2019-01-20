/**
 * 
 */
package com.all.software.ereservas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.all.software.ereservas.domain.Cliente;
import com.all.software.ereservas.modelo.ClientesReservas;
import com.all.software.ereservas.service.IClientesReservasService;

/**
 * Clase que presenta el servico WEB de Cliente
 * @author pedrhiga
 *
 */
@RestController
@RequestMapping("/api/cliente")
public class ClienteResource {

	@Autowired
	private IClientesReservasService clientesReservasService;


	@GetMapping
	@RequestMapping("")
	public ResponseEntity<List<ClientesReservas>> findAllClientesReservas() {
		return ResponseEntity.ok(clientesReservasService.findAllClientesReservas());
	}

	@PostMapping
	public ResponseEntity<ClientesReservas> saveAllClientesReservas(@RequestBody Cliente cliente){
		System.err.println(cliente.getApellidoCli());
		return ResponseEntity.ok(clientesReservasService.saveAllClientesReservas(cliente));
	}
}
