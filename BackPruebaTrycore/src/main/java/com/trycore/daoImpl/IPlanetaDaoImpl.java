package com.trycore.daoImpl;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trycore.entity.Planeta;

@Repository
public interface IPlanetaDaoImpl extends CrudRepository<Planeta, Long>{

	
	@Query(value="SELECT PL.PLANETA_ID, (SELECT COUNT(*) FROM PERSONA WHERE PLANETA_ID = PL.PLANETA_ID) AS CANTIDAD_PERSONAS, PL.CONTADOR, PL.DIAMETRO, PL.NOMBRE FROM PLANETA PL INNER JOIN PERSONA PE ON PE.PLANETA_ID = PL.PLANETA_ID GROUP BY PL.PLANETA_ID", nativeQuery = true)
	@Transactional(readOnly = true)
	List<Planeta> getPlanetas();
	
	@Transactional
	@Modifying
	@Query("UPDATE Planeta p SET p.contador = p.contador + 1 WHERE p.id = ?1")
	void aumentaContadorPlaneta(Long id);

	@Query(value = "SELECT TOP 3 P.* FROM PLANETA P ORDER BY CONTADOR DESC", nativeQuery = true)
	List<Planeta> top3();
	
}
