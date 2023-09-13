package com.vinicius.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.cursomc.domain.Categoria;
import com.vinicius.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.vinicius.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto não encontrado! Id: " + "Tipo: " + Categoria.class.getName()));
		}
}
