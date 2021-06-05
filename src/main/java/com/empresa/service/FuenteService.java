package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Fuente;

public interface FuenteService {

	public abstract List<Fuente> listaFuente();
	public abstract Fuente insertaActualizaFuente(Fuente obj);
	public abstract Optional<Fuente> obtienePorId(int idFuente);
	public abstract void eliminaFuente(int id);
	public abstract List<Fuente> listaFuentePorNombreLike(String filtro);
	public abstract List<Fuente> listaPorCertificacion(String certificacion);
	public abstract List<Fuente> listaPorCertificacion(String certificacion, int idFuente);

}
