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
	public ObjectId _id;

	public String idCli;
	public String nombreCli;
	public String apellidoCli;
	public String identificacionCli;
	public String direccionCli;
	public String telefonoCli;
	public String emailCli;
	public List<Reservas> reserva;

	public String getId() {
		return _id.toHexString();
	}
}
