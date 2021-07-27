package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")

public class PostagemController {
	@Autowired
	private PostagemRepository repository;
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id ){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String postagem ){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(postagem));
	}

}
