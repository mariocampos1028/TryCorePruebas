package com.trycore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Planeta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long planeta_id;
	
	private String nombre;
	
	private Long diametro;
	
	private int contador;
	
	
	private int cantidad_personas;
	

	public int getCantidad_personas() {
		return cantidad_personas;
	}

	public void setCantidad_personas(int cantidad_personas) {
		this.cantidad_personas = cantidad_personas;
	}

	public Long getPlaneta_id() {
		return planeta_id;
	}

	public void setPlaneta_id(Long planeta_id) {
		this.planeta_id = planeta_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getDiametro() {
		return diametro;
	}

	public void setDiametro(Long diametro) {
		this.diametro = diametro;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	

}
