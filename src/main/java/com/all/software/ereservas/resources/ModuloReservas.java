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

import com.all.software.ereservas.modelo.ModeloReserva;
import com.all.software.ereservas.service.IModeloReservaService;



/**
 * Clase que presenta el servico WEB de Cliente
 * @author pedrhiga
 *
 */
@RestController
@RequestMapping("/api/cliente")
public class ModuloReservas {

	@Autowired
	private IModeloReservaService modeloReservaService;


	@GetMapping
	public ResponseEntity<List<ModeloReserva>> findAllClientesReservas() {
		return ResponseEntity.ok(modeloReservaService.findAllModeloReserva());
	}

	@PostMapping
	public ResponseEntity<ModeloReserva> saveAllClientesReservas(@RequestBody ModeloReserva modeloReserva){
		return ResponseEntity.ok(modeloReservaService.saveAllModuloReserva(modeloReserva));
	}
}
