package com.trycore.fachada;

import java.util.List;
import java.util.Optional;

import com.trycore.entity.Persona;
import com.trycore.entity.Planeta;

public interface IPlanetaFachada {

	List<Planeta> getPlanetas() throws Exception;

	Optional<Planeta> aumentaContadorPlaneta(Long id) throws Exception;

	Optional<Planeta> getPlanetaById(Long id) throws Exception;

	List<Planeta> top3() throws Exception;

}
