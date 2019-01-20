/**
 * 
 */
package com.all.software.ereservas.service;

import java.util.List;

import com.all.software.ereservas.modelo.ModeloReserva;

/**
 * @author pedrhiga
 *
 */
public interface IModeloReservaService {

	List<ModeloReserva> findAllModeloReserva(); 
	ModeloReserva saveAllModuloReserva(ModeloReserva modeloReservas);
}
