/**
 * 
 */
package com.all.software.ereservas.domain;

import java.util.List;

import lombok.Data;

/**
 * @author pedrhiga
 *
 */
@Data
public class Cliente {

	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
	private List<Reserva> reserva;
}
