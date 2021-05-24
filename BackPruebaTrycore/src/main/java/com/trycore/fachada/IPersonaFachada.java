package com.trycore.fachada;

import java.util.List;
import java.util.Optional;

import com.trycore.entity.Persona;

public interface IPersonaFachada {
	
	List<Persona> getPersonas() throws Exception;

	Optional<Persona> getPersonaById(Long id) throws Exception;

	Optional<Persona> aumentaContadorPerYPla(Long id) throws Exception;

	List<Persona> getPersonasByID(Long id) throws Exception;
	
	

}
