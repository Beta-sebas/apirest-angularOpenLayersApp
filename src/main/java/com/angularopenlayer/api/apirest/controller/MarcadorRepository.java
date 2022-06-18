package com.angularopenlayer.api.apirest.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angularopenlayer.api.apirest.model.Marcador;

@Repository
public interface MarcadorRepository extends JpaRepository<Marcador, Integer> {
	
	List<Marcador> findByNombreContaining(String nombre);
	//List<Marcador> findByNombreStartsWith(String nombre);
	
}
