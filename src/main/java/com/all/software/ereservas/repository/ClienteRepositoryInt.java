/**
 * 
 */
package com.all.software.ereservas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.all.software.ereservas.modelo.Cliente;

/**
 * @author pedrhiga
 *
 */
public interface ClienteRepositoryInt extends JpaRepository<Cliente, String> {

}
