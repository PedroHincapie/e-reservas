/**
 * 
 */
package com.all.software.ereservas.domain;

import lombok.Data;

/**
 * Clase que se encara de 
 * @author pedrhiga
 *
 */

@Data
public class Reservas {
	
	private String idReserva;
	private String fechaIngReserva;
	private String fechaFinReserva;
	private String cantReserva;
	private String descReserva;

}
