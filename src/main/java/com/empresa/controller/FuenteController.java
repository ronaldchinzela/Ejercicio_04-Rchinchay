package com.empresa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.empresa.entity.Fuente;
import com.empresa.service.FuenteService;


@RestController
@RequestMapping("/rest/fuente")
public class FuenteController {	
	
	@Autowired
	private FuenteService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Fuente>> listaFuente(){
		List<Fuente> listaFuente = service.listaFuente();
		return ResponseEntity.ok(listaFuente);
	}
	
	@GetMapping("/porId/{id}")
	@ResponseBody
	public ResponseEntity<Fuente> listaPorId(@PathVariable("id") int idFuente){
		Optional<Fuente> optFuente = service.obtienePorId(idFuente);
		if (optFuente.isPresent()) {
			return ResponseEntity.ok(optFuente.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/porCertificacion/{certificacion}")
	@ResponseBody
	public ResponseEntity<List<Fuente>> listaPorCertificacion(@PathVariable("certificacion") String certificacion){
		List<Fuente> listaFuente = service.listaPorCertificacion(certificacion);
		return ResponseEntity.ok(listaFuente);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Fuente> registra(@RequestBody Fuente obj){
		return ResponseEntity.ok(service.insertaActualizaFuente(obj));
	}
	
	@PutMapping
	@ResponseBody
	public ResponseEntity<Fuente> actualiza(@RequestBody Fuente obj){
		return ResponseEntity.ok(service.insertaActualizaFuente(obj));
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Fuente> eliminarPorId(@PathVariable("id") int idFuente){
		Optional<Fuente> optFuente = service.obtienePorId(idFuente);
		if (optFuente.isPresent()) {
			service.eliminaFuente(idFuente);
			return ResponseEntity.ok(optFuente.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
}


