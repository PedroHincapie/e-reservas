package com.all.software.ereservas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.all.software.ereservas.modelo.ClientesReservas;

public interface IClientesReservasRepository extends MongoRepository<ClientesReservas, String> {

}
