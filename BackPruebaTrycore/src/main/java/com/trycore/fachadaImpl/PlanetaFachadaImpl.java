package com.trycore.fachadaImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trycore.daoImpl.IPlanetaDaoImpl;
import com.trycore.entity.Persona;
import com.trycore.entity.Planeta;
import com.trycore.fachada.IPlanetaFachada;

@Service
public class PlanetaFachadaImpl implements IPlanetaFachada{

	@Autowired
	private IPlanetaDaoImpl planetaDao;
	
	@Override
	public List<Planeta> getPlanetas() throws Exception {
		List<Planeta> list = new ArrayList<>();
		list = planetaDao.getPlanetas();
		return list;
	}

	@Override
	public Optional<Planeta> aumentaContadorPlaneta(Long id) throws Exception {
		Optional<Planeta> pla;
		pla = planetaDao.findById(id);
		planetaDao.aumentaContadorPlaneta(id);
		return pla;
	}

	@Override
	public Optional<Planeta> getPlanetaById(Long id) throws Exception {
		Optional<Planeta> pla;
		pla = planetaDao.findById(id);
		return pla;
	}

	@Override
	public List<Planeta> top3() throws Exception {
		List<Planeta> list = new ArrayList<>();
		list = planetaDao.top3();
		return list;
	}

	
	
}
