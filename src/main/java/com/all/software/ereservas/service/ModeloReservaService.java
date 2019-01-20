/**
 * 
 */
package com.all.software.ereservas.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.all.software.ereservas.modelo.ModeloReserva;
import com.all.software.ereservas.repository.IModeloReservaRepository;

/**
 * @author pedrhiga
 *
 */
@Service
@Transactional(readOnly = true)
public class ModeloReservaService implements IModeloReservaService{

	private final IModeloReservaRepository modeloReservaRepository;

	@Autowired
	public ModeloReservaService(IModeloReservaRepository moduloReservaRepository) {
		this.modeloReservaRepository = moduloReservaRepository;
	}

	@Override
	public List<ModeloReserva> findAllModeloReserva() {
		return this.modeloReservaRepository.findAll();
	}

	@Transactional
	@Override
	public ModeloReserva saveAllModuloReserva(ModeloReserva modeloReservas) {
		return this.modeloReservaRepository.insert(modeloReservas);
	}
}
