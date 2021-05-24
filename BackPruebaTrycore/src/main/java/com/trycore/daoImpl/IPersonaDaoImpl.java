package com.trycore.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trycore.entity.Persona;

@Repository
public interface IPersonaDaoImpl extends CrudRepository<Persona, Long> {

	@Transactional
	@Modifying
	@Query("UPDATE Persona p SET p.contador = p.contador + 1 WHERE p.id = ?1")
	void aumentaContadorPersona(Long id);

	
	@Query("SELECT p FROM Persona p WHERE p.planeta.planeta_id = ?1")
	List<Persona> getPersonasById(Long id);
	
	
	

}
