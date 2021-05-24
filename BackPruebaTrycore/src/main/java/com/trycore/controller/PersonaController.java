package com.trycore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trycore.entity.Persona;
import com.trycore.fachada.IPersonaFachada;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	
	@Autowired
	private IPersonaFachada personafachada;
	
	@GetMapping("/getPersonas")
	public List<Persona> getPersonas(){
		List<Persona> list = new ArrayList<>();
		try {
			
			return list = personafachada.getPersonas();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	@GetMapping("/getPersonaById")
	public ResponseEntity<Optional<Persona>> getPersona(@RequestParam(value = "id") Long id){

		Optional<Persona> per;
		try {
			per = personafachada.getPersonaById(id);
			if(per!=null) {
				return ResponseEntity.ok(per);
			}else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/aumentaContadorPersonaYPlaneta")
	public Optional<Persona> aumentaContadorPersonaYPlaneta(@RequestParam(value = "id") Long id){
		Optional<Persona> per = null;
		try {
			per = personafachada.aumentaContadorPerYPla(id);
			return per;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return per;
	}
	
	@GetMapping("/getPersonasById")
	public List<Persona> getPersonasById(@RequestParam(value = "id") Long id){
		List<Persona> list = new ArrayList<>();
		try {
			
			return list = personafachada.getPersonasByID(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	

}
