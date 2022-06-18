package com.angularopenlayer.api.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularopenlayer.api.apirest.model.Marcador;

@Service
public class MarcadorService {
	
	@Autowired
	private MarcadorRepository repositorio;

	public void setMarcador( Marcador marcador ) {
		repositorio.save(marcador);
	}
	
	public List<Marcador> getMarcadores(){
		
		return repositorio.findAll();
	}
	
	public List<Marcador> getname( String name ){
		
		return repositorio.findByNombreContaining(name);
	}
	
	public Marcador getMarcador( Integer id ) {
		return repositorio.getReferenceById(id);
	}
}
