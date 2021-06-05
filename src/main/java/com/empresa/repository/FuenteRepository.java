package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Fuente;

public interface FuenteRepository extends JpaRepository<Fuente, Integer> {

	
	@Query("Select a from Fuente a where nombre like :fil")
	public abstract List<Fuente> listaFuentePorNombreLike(@Param("fil") String filtro);

	public abstract List<Fuente> findByCertificacion(String certificacion);
	public abstract List<Fuente> findByCertificacionAndIdFuenteNot(String certificacion, int idFuente);
}
