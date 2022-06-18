package com.angularopenlayer.api.apirest.controller;


import com.angularopenlayer.api.apirest.model.Marcador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class MarcadorController {
	
	@Autowired
	private MarcadorService service;
	
	@GetMapping("api/all")
	public List<Marcador> getMarcadores() {
		return service.getMarcadores();
	}
	
	@GetMapping("api/name")
	public List<Marcador> getmar(@RequestParam String name) {
		return service.getname(name);
	}
	
	
	/*@GetMapping("api/all")
	public List<Marcador> getMarcadores() {
		List<Marcador>listaMarcadores = new ArrayList<>();
		
		Marcador e = new Marcador();
		
		e.setNombre("parque caldas");
		e.setId(1);
		e.setCoordenadas("72.54545-2.31848");
		
		listaMarcadores.add(e);
		
		return listaMarcadores;
	}*/
	
	@PostMapping("api/setMarcador")
	public Marcador setMarcador(@RequestBody Marcador marcador) {
		System.out.println(marcador);
		service.setMarcador(marcador);
		return marcador;
	}
	
	@GetMapping("api/marcador/{id}")
	public Marcador getMarcador(@PathVariable("id") Integer id) {
		return service.getMarcador(id);
	}
}
