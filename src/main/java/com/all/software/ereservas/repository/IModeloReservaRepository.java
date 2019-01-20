package com.all.software.ereservas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.all.software.ereservas.modelo.ModeloReserva;

public interface IModeloReservaRepository extends MongoRepository<ModeloReserva, String> {

}
