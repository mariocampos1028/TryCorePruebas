package com.trycore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trycore.entity.Persona;
import com.trycore.entity.Planeta;
import com.trycore.fachada.IPlanetaFachada;

@RestController
@RequestMapping("/planeta")
public class PlanetaController {

	@Autowired
	private IPlanetaFachada planetaFachada;
	
	@GetMapping("getPlanetas")
	public List<Planeta> getPlanetas(){
		List<Planeta> list = new ArrayList<>();
		try {			
			return list = planetaFachada.getPlanetas();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	
	@GetMapping("/getPlanetaById")
	public ResponseEntity<Optional<Planeta>> getPlaneta(@RequestParam(value = "id") Long id){

		Optional<Planeta> pla;
		try {
			pla = planetaFachada.getPlanetaById(id);
			if(pla!=null) {
				return ResponseEntity.ok(pla);
			}else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ResponseEntity.notFound().build();
	}
	
	
	@GetMapping("/AumentarContadorPlaneta")
	public Optional<Planeta> aumentaContadorPlaneta(@RequestParam(value = "id") Long id){
		Optional<Planeta> pla = null;
		try {
			pla = planetaFachada.aumentaContadorPlaneta(id);
			
			return pla;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return pla;
	}
	
	
	@GetMapping("/top3")
	public List<Planeta> top3(){
		List<Planeta> list = new ArrayList<>();
		try {
			list = planetaFachada.top3();
			return list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	
	
	
	
	
	
}
