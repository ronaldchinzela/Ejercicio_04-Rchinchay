package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Fuente;
import com.empresa.repository.FuenteRepository;

@Service
public class FuenteServiceImpl implements FuenteService {

	@Autowired
	private FuenteRepository repository;

	@Override
	public List<Fuente> listaFuente() {
		return repository.findAll();
	}

	@Override
	public Fuente insertaActualizaFuente(Fuente obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaFuente(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Fuente> listaFuentePorNombreLike(String filtro) {
		return repository.listaFuentePorNombreLike(filtro);
	}

	@Override
	public Optional<Fuente> obtienePorId(int idFuente) {
		return repository.findById(idFuente);
	}

	@Override
	public List<Fuente> listaPorCertificacion(String certificacion) {
		return repository.findByCertificacion(certificacion);
	}

	@Override
	public List<Fuente> listaPorCertificacion(String certificacion, int idFuente) {
		return repository.findByCertificacionAndIdFuenteNot(certificacion, idFuente);
	}
}
