package com.trycore.fachadaImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trycore.daoImpl.IPersonaDaoImpl;
import com.trycore.daoImpl.IPlanetaDaoImpl;
import com.trycore.entity.Persona;
import com.trycore.fachada.IPersonaFachada;

@Service
public class PersonaFachadaImpl implements IPersonaFachada{

	@Autowired
	private IPersonaDaoImpl personaDao;
	
	
	@Autowired
	private IPlanetaDaoImpl planetaDao;
	
	@Override
	public List<Persona> getPersonas() throws Exception {
		List<Persona> list = new ArrayList<>();
		list = (List<Persona>) personaDao.findAll();
		return list;
	}

	

	@Override
	public Optional<Persona> getPersonaById(Long id) throws Exception {
		Optional<Persona> per;
		per = personaDao.findById(id);
		return per;
	}



	@Override
	public Optional<Persona> aumentaContadorPerYPla(Long id) throws Exception {
		Optional<Persona> per;
		
		per = personaDao.findById(id);
		Long idPlaneta = per.get().getPlaneta().getPlaneta_id();
		personaDao.aumentaContadorPersona(id);
		planetaDao.aumentaContadorPlaneta(idPlaneta);
		return per;
	}



	@Override
	public List<Persona> getPersonasByID(Long id) throws Exception {
		List<Persona> list = new ArrayList<>();
		list = (List<Persona>) personaDao.getPersonasById(id);
		return list;
	}

	
	
}
