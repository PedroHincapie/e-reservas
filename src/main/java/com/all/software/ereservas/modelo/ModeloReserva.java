package com.all.software.ereservas.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.all.software.ereservas.domain.Cliente;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

/**
 * Clase que representa el documento reservas
 * @author pedrhiga
 *
 */
@Data
@Document(collection = "modeloReserva")
public class ModeloReserva {

	@Id
	@Getter(AccessLevel.NONE)
	private ObjectId _id;
	private Cliente cliente;

	public String getId() {
		return _id.toHexString();
	}
}
