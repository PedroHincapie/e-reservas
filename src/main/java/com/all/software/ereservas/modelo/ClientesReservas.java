package com.all.software.ereservas.modelo;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.all.software.ereservas.domain.Reservas;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

/**
 * Clase que representa el documento reservas
 * @author pedrhiga
 *
 */
@Data
@Document(collection = "clientesReservas")
public class ClientesReservas {

	@Id
	@Getter(AccessLevel.NONE)
	private ObjectId _id;

	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
	private List<Reservas> reserva;

	public String getId() {
		return _id.toHexString();
	}
}
