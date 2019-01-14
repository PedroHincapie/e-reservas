/**
 * 
 */
package com.all.software.ereservas.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa la tabla Cliente 
 * @author pedrhiga
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente") 
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String idCli;

	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;

	//Un cliente puede tenener varias reservas, pero una reserva solo tendra un cliente
	@OneToMany
	private Set<Reserva> reserva;
}